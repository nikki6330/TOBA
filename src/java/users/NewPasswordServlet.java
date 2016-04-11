package users;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

import TOBA.business.User;

public class NewPasswordServlet extends HttpServlet {

  @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/new_password.jsp";
        
        // get current action
        String action = request.getParameter("action");
        
        if (action.equals("change")) {
            String password = request.getParameter("password");
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");
            user.setPassword(password);
            
            url = "/account_activity.jsp";
            request.setAttribute("user", user);
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