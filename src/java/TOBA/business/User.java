package TOBA.business;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.FetchType;
import TOBA.business.Account;

@Entity
public class User implements Serializable {
    
    @Id
    @Column (name="USER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    
    @Column (name="FIRST_NAME")
    private String firstName;
    @Column (name="LAST_NAME")
    private String lastName;
    @Column (name="PHONE_NUMBER")
    private String phoneNumber;
    @Column (name="ADDRESS")
    private String address;
    @Column (name="CITY")
    private String city;
    @Column (name="STATE")
    private String state;
    @Column (name="ZIP_CODE")
    private String zip;
    @Column (name="EMAIL")
    private String email;
    @Column (name="USER_NAME")
    private String username;
    @Column (name="PASSWORD")
    private String password;
    
    @OneToMany (fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    private ArrayList<Account> accounts;
    
    public User(){
        
    }
    
    public User(String firstName, String lastName, String phoneNumber, 
            String address, String city, String state, String zip, String email) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.username = lastName + zip;
        this.password = "welcome1";
        this.accounts = new ArrayList<Account>();
        this.accounts.add(new Account(25.00, Account.AccountType.SAVINGS));
        this.accounts.add(new Account(0.00, Account.AccountType.CHECKING));
    }
    
    public long getUserId() {
        return userId;
    }
    
    public void setUserId(long userId) {
        this.userId = userId;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    
  
    public ArrayList<Account> getAccounts() {
        return accounts;
    }    

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    
    public Account getAccount(Account.AccountType which) {
        for (Account a: this.accounts){
            if (a.getAccountType() == which){
                return a;
            }
        }
        return null;
    }
    
    public double getCheckingBalance(){
        Account checking = getAccount(Account.AccountType.CHECKING);
        return checking.getBalance();
    }
    
    public double getSavingsBalance(){
        Account savings = getAccount(Account.AccountType.SAVINGS);
        return savings.getBalance();
    }
}
