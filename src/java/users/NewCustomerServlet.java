package users;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

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
        
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String phoneNumber = request.getParameter("phoneNumber");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zip = request.getParameter("zip");
            String email = request.getParameter("email");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
                    

            // validate the parameters
            String message;
            if (firstName == null || lastName == null || phoneNumber == null || 
                address == null || city == null || state == null || zip == null ||
                email == null || username == null || password == null ||
                firstName.isEmpty() || lastName.isEmpty() || phoneNumber.isEmpty() ||
                address.isEmpty() || city.isEmpty() || state.isEmpty() || zip.isEmpty() ||
                email.isEmpty() || username.isEmpty() || password.isEmpty()) {
                message = "*Please fill out all form fields*";
                url = "/new_customer.jsp";
            }
            else {
                message = "";
                url = "/success.jsp";
            }
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