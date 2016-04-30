package TOBA.business;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import TOBA.business.User;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Account implements Serializable{
   
    public enum AccountType { CHECKING, SAVINGS} 
    
    @Id
    @Column (name="ACCOUNT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accountId;
    
    @Column (name="ACCOUNT_TYPE")
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
        
    @Column (name="BALANCE")
    private double balance;
    
    /*@OneToMany (fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    private ArrayList<Transaction> transactions;*/
    
    public Account() {
    
    }
    
    public Account(double balance, AccountType typeOfAccount){
        this.balance = balance;
        this.accountType = typeOfAccount;
    }    
    
    public long getAccountId() {
        return accountId;
    }
    
    public void setAccountId(long accountId){
        this.accountId = accountId;
    }
    
    public AccountType getAccountType() {
        return accountType;
    }
        
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    } 
    
    public void credit(double amount) {
        this.balance += amount;
    }
    
    public void debit(double amount) {
        this.balance -= amount;
    }
}
