/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo;

/**
 *
 * @author Raka Darma
 */
public class Driver extends Person {
    private String driverName;
    private String password;
    private int driverID;
    private int phoneNumber;
    private int gopayIncome;

    public Driver(String driverName, String password, int driverID, int phoneNumber, int gopayIncome, String name, int age, String role) {
        super(name, age, role);
        this.driverName = driverName;
        this.password = password;
        this.driverID = driverID;
        this.phoneNumber = phoneNumber;
        this.gopayIncome = gopayIncome;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getGopayIncome() {
        return gopayIncome;
    }
}

