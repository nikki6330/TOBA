package users;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import TOBA.business.Transaction;
import TOBA.business.Account;

public class TransactionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
                
            String url = "/transaction.jsp";
            String message;
            // get current action
            String action = request.getParameter("action");
                        
            if (action.equals("transfer")) {
                String account_type_1 = request.getParameter("account_1");
                String account_type_2 = request.getParameter("account_2");
                double amount = Double.parseDouble(request.getParameter("amount"));
                double account_1 = Double.parseDouble(request.getParameter("account_1")); 
                double account_2 = Double.parseDouble(request.getParameter("account_2"));
                
                 if (account_type_1.equals(account_type_2)) {
                    message = "You cannot transfer money to the same account";
                    url = "/transaction.jsp";
                    } 
                 
                 else if(amount > account_1) {
                     message = "You cannot transfer more money than the account has";
                     url = "/transaction.jsp";
                     }
                
                 //Run debit and credit methods
                 else {
                     //Determine if first account is checking or savings
                     if (account_type_1 == Account.AccountType.CHECKING) {
                         //Run debit method
                         Account.debit(amount);
                     }
                     
                     else {
                         //Run debit method
                         Account.debit(amount);
                     }
                     // Determin if second account is 
                     if (account_type_2 == Account.AccountType.CHECKING) {
                         //Run credit method
                         Account.credit(amount);
                     }
                     
                     else{
                         Account.credit(amount);
                     }
                    /*Transaction transaction = new Transaction(account_1, account_2, amount);*/
                    message = "";
                    url = "/transaction.jsp";
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