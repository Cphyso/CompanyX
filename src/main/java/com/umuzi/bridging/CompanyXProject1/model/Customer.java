package com.umuzi.bridging.CompanyXProject1.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Defining the model
 * */

@Entity
public class Customer {

    public Customer(){}

    public Customer(Long customerID, String customerName, String customerLastName, long customerNumber) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerLastName = customerLastName;
        this.customerNumber = customerNumber;
    }

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(long customerNumber) {
        this.customerNumber = customerNumber;
    }
    @Id
    private Long customerID;
    private String customerName;
    private String customerLastName;
    private long customerNumber;

  /*  public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    private Account account;*/
}
