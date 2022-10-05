package com.company;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("123456789",0,"default name","default email","default phonenubmer");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999999",100.55,customerName,email,phoneNumber);
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance must be positive");
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double funds){
        if (funds > 0){
            this.balance += funds;
            System.out.println("Current balance after deposit is now " + this.balance);
        } else {
            System.out.println("Deposits need to be positive!");
        }
    }

    public void withdrawFunds(double funds){
        if(funds > 0 && this.balance - funds >= 0){
            this.balance -= funds;
            System.out.println("Current balance after withdrawal is now " + this.balance);
        } else {
            System.out.println("Insufficient balance to complete transaction");
        }
    }

}


