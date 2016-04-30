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
    @Column (name="TRANSFER_AMMOUNT")
    private double ammount;
    
    public Transaction() {
    
    }
    
    public Transaction(double account_1, double account_2, double ammount){
        this.account_1 = account_1;
        this.account_2 = account_2;
        this.ammount = ammount;
    }
    
    
    
}
