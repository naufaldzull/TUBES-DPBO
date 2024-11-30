/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo;

/**
 *
 * @author Raka Darma
 */
public class Pengantaran extends Penjemputan{
    private String namaPenumpang;
    private String durasiPerjalanan;

    public Pengantaran(String namaPenumpang, String durasiPerjalanan, String lokasiPenjemputan, String waktuPenjemputan, String namaPenjemput) {
        super(lokasiPenjemputan, waktuPenjemputan, namaPenjemput);
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
}

