package TOBA.business;

import java.io.Serializable;

public class Account implements Serializable{
   
    private double balance;
    private double checking;
    private Object user;
    
    public Account(Object user, Double balance, Double checking){
        this.balance = balance;
        this.checking = checking;
        this.user = user;
    }
     
    public static void credit() {
        
    }
    
    public static void debit() {
        
    }
    
    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getChecking() {
        return checking;
    }

    public void setChecking(double checking) {
        this.checking = checking;
    }
}
