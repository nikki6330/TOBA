/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
                
            String url = "/login.jsp";
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            // validate the parameters
            String message;
            if (username.equals("jsmith@toba.com") && password.equals("letmein")) {
                message = "";
                url = "/account_activity.jsp";
            } 
            else {
                message = "";
                url = "/login_failure.jsp";
            }
            request.setAttribute("message", message);
        
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