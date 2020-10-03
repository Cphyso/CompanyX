package com.umuzi.bridging.CompanyXProject1.model;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Account {

   /* private String accountType;
    private boolean active;
    private double balance;
    private double interestRates;
    @Id
    private String accountNumber;
    private  static int incrementer = 0000;

    public Account(String accountType, boolean active, double balance, double interestRates, String accountNumber)
    {
        this.accountType = accountType;
        this.active = active;
        this.balance = balance;
        this.interestRates = interestRates;
        this.accountNumber = accountNumberGenerator();
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRates() {
        return interestRates;
    }

    public void setInterestRates(double interestRates) {
        this.interestRates = interestRates;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(){}
    public void withdraw(){}
    public void monthlyChargers(){}

    public String accountNumberGenerator(){
        String accTypeCode = null;
        String accNum = null;
        String x = getAccountType();
        switch (x.toLowerCase()){
            case "savings":
                accTypeCode = "1100";
                break;
            case "cheque":
                accTypeCode = "2200";
                break;
            case "credit":
                accTypeCode = "3300";
                break;
            case "personal loan":
                accTypeCode = "4400";
        }

        accNum = accTypeCode + incrementer;
        incrementer++;

        return accNum;
    }*/
}
