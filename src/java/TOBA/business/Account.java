package TOBA.business;

import java.io.Serializable;

public class Account implements Serializable{
   
    private double balance;
    private double checking;
    private double savings;
    private Object user;
    
    public Account(Object user, Double checking, Double savings){
        this.checking = checking;
        this.savings = savings;
        this.user = user;
    }
     
    public double credit(Double balance, Double amount) {
        return balance + amount;
    }
    
    public double debit(Double balance, Double amount) {
        return balance - amount;
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
    
    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }
}
