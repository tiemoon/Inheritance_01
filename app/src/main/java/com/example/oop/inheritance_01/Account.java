package com.example.oop.inheritance_01;

/**
 * Created by OOP on 2/26/2015.
 */
public abstract class Account {
    private String number;
    private String customerName;
    private double balance;

    //There's a change here

    public Account(String number, String customerName)
    {
        setNumber(number);
        setCustomerName(customerName);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public String deposit(double amount)
    {
        balance += amount;
        return "Deposited";
    }
//  public String withdraw(double amount)
    public String withdraw(double amount)
    {
        balance -= amount;
        return "Withdrawn";
    }

    public abstract void Transfer(String fromAccount, String toAccount, double amount);


}
