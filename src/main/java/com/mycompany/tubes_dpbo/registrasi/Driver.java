/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.registrasi;

/**
 *
 * @author naufa
 */
public class Driver extends Registrasi {
    public Driver(String nama, String noTelp, String email) {
        super(nama, noTelp, email);
    }

    public void printDriverInfo() {
        System.out.println("Nama Driver: " + getNama());
        System.out.println("Nomor Telepon: " + getNoTelp());
        System.out.println("Email: " + getEmail());
    }
}
