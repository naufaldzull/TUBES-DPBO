/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo;

/**
 *
 * @author Raka Darma
 */
public class Registrasi {
    private String nama;
    private int noTelp;
    private char email;

    public Registrasi(String nama, int noTelp, char email) {
        this.nama = nama;
        this.noTelp = noTelp;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public int getNoTelp() {
        return noTelp;
    }

    public char getEmail() {
        return email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoTelp(int noTelp) {
        this.noTelp = noTelp;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Registrasi{" + "nama=" + nama + ", noTelp=" + noTelp + ", email=" + email + '}';
    }
}

