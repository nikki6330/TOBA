package users;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import TOBA.business.User;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
                
            String url = "/login.jsp";
            String message;
            // get current action
            String action = request.getParameter("action");
            
            if (action.equals("goToLogin")) {
                url = "/login.jsp";
            }
            
            if (action.equals("login")) {
        
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");

            // validate the parameters
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                message = "";
                url = "/account_activity.jsp";
            } 
            else {
                message = "";
                url = "/login_failure.jsp";
            }
            request.setAttribute("message", message);
            
            }
            
            if (action.equals("account")) {
                url = "/account_activity.jsp";
            }
            
            else if (action.equals("transaction")) {
                url = "/transaction.jsp";
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