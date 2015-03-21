package com.example.oop.inheritance_01;

/**
 * Created by OOP on 2/26/2015.
 */
public abstract class Checking extends Account{

    public Checking(String number, String customerName, double serviceCharge)
    {
        super(number, customerName);
        setServiceCharge(serviceCharge);
    }
    private double serviceCharge;

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }



}
