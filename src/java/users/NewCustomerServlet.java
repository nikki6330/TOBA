package users;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

import TOBA.business.User;
import TOBA.data.UserDB;
import TOBA.business.Account;
import TOBA.data.AccountDB;

public class NewCustomerServlet extends HttpServlet {

  @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/new_customer.jsp";
         
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }
        
         // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/new_customer.jsp";    // the "join" page
        }
        
        if (action.equals("change")) {
            String password = request.getParameter("password");
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");
            user.setPassword(password);
            UserDB.update(user);
            session.setAttribute("user", user);
            
            url = "/account_activity.jsp";
        }
        
        if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String phoneNumber = request.getParameter("phoneNumber");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zip = request.getParameter("zip");
            String email = request.getParameter("email");
            
            HttpSession session = request.getSession();
            
            // store data in User object
            User user = new User(firstName, lastName, phoneNumber, address, city,
            state, zip, email);
            
            double savings = 25.00;
            double checking = 0.00;
            
            Account account = new Account(user, checking, savings);
            
            // validate the parameters
            String message;
            if (firstName == null || lastName == null || phoneNumber == null || 
                address == null || city == null || state == null || zip == null ||
                email == null ||
                firstName.isEmpty() || lastName.isEmpty() || phoneNumber.isEmpty() ||
                address.isEmpty() || city.isEmpty() || state.isEmpty() || zip.isEmpty() ||
                email.isEmpty()) {
                message = "*Please fill out all form fields*";
                url = "/new_customer.jsp";
            }
            else if (UserDB.emailExists(user.getEmail())) {
                message = "This email address already exists.<br>" +
                          "Please enter another email address.";
                url = "/new_customer.jsp";
            }
            else {
                message = "";
                UserDB.insert(user);
                AccountDB.insert(account);
                url = "/success.jsp";
            }
            session.setAttribute("user", user);
            session.setAttribute("account", account);
            request.setAttribute("message", message);
        }
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
  }        
}