/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.registrasi;

/**
 *
 * @author Raka Darma
 */
public class Registrasi {
    private String nama;
    private int noTelp;
    private String email;

    public Registrasi(String nama, int noTelp, String email) {
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

    public String getEmail() {
        return email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoTelp(int noTelp) {
        this.noTelp = noTelp;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Registrasi{" + "nama=" + nama + ", noTelp=" + noTelp + ", email=" + email + '}';
    }
}

