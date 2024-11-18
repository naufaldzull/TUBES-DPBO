/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo;

/**
 *
 * @author Raka Darma
 */
public class User extends Person {
    private String userName;
    private String password;
    private int userID;
    private int phoneNumber;
    private int gopayBalance;

    public User(String userName, String password, int userID, int phoneNumber, int gopayBalance, String name, int age, String role) {
        super(name, age, role);
        this.userName = userName;
        this.password = password;
        this.userID = userID;
        this.phoneNumber = phoneNumber;
        this.gopayBalance = gopayBalance;
    }

    public String getUserName() {
        return userName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getGopayBalance() {
        return gopayBalance;
    }
}

