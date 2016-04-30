package TOBA.business;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import TOBA.business.Account;

@Entity
public class Transaction implements Serializable{
    
    @Id
    @Column (name="TRANSACTION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accountId;
    
    @Column (name="ACCOUNT_1")
    private double account_1;    
    @Column (name="ACCOUNT_2")
    private double account_2;        
    @Column (name="AMOUNT_TRANSFERRED")
    private double amount;
    
    public Transaction() {
    
    }
    
    public Transaction(double account_1, double account_2, double amount){
        this.account_1 = account_1;
        this.account_2 = account_2;
        this.amount = amount;
    }
    
    public double getAccount1(){
        return account_1;
    }
    
    public void setAccount1(double account_1){
        this.account_1 = account_1;
    }
    
    public double getAccount2(){
        return account_2;
    }
    
    public void setAccount2(double account_2){
        this.account_2 = account_2;
    }
    
    public double getAmount(){
        return amount;
    }
    
    public void setAmount(double amount){
        this.amount = amount;
    }
}
