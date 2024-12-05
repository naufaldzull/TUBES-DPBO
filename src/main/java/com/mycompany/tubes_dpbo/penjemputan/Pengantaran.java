/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.penjemputan;

import com.mycompany.tubes_dpbo.penjemputan.Penjemputan;

/**
 *
 * @author Raka Darma
 */
public class Pengantaran implements Alamat{
    private String namaPenumpang;
    private String durasiPerjalanan;

    public Pengantaran(String namaPenumpang, String durasiPerjalanan) {
        this.namaPenumpang = namaPenumpang;
        this.durasiPerjalanan = durasiPerjalanan;
    }
    
    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public String getDurasiPerjalanan() {
        return durasiPerjalanan;
    }

    public void setDurasiPerjalanan(String durasiPerjalanan) {
        this.durasiPerjalanan = durasiPerjalanan;
    }

    @Override
    public void alamatTujuan() {
        System.out.println("");
    }

    @Override
    public void alamatAsal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

