package com.example.oop.inheritance_01;

/**
 * Created by OOP on 2/26/2015.
 */
public class Savings extends Account {


    private double interestAmount;

    public Savings(String number, String customerName, double interestAmount)
    {
       super(number, customerName);
        setInterestAmount(interestAmount);
    }

    public String withdraw(double amount)
    {
        if (getBalance() - amount >= 0) {
            return super.withdraw(amount);
        }
        else
        {
            return "Insufficient balance";
        }
    }

    @Override
    public void Transfer(String fromAccount, String toAccount, double amount) {

    }


    public double getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(double interestAmount) {
        this.interestAmount = interestAmount;
    }



}
