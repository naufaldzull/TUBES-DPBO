/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.penjemputan;



/**
 *
 * @author Raka Darma
 */
public class Pengantaran implements Alamat{
    private String namaPenumpang;
    private String durasiPerjalanan;

    public Pengantaran(String namaPenumpang, String durasiPerjalanan) {
         if (namaPenumpang == null || namaPenumpang.isBlank()) {
            throw new IllegalArgumentException("Nama penumpang tidak boleh kosong.");
        }
        if (durasiPerjalanan == null || durasiPerjalanan.isBlank()) {
            throw new IllegalArgumentException("Durasi perjalanan tidak boleh kosong.");
        }
        this.namaPenumpang = namaPenumpang;
        this.durasiPerjalanan = durasiPerjalanan;
    }
     public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public String getDurasiPerjalanan() {
        return durasiPerjalanan;
    }

    @Override
    public void alamatTujuan(String tujuan) {
         System.out.println("Pengantaran akan dilakukan untuk Tujuan: " + namaPenumpang);
    }

    @Override
    public void alamatAsal(String asal) {
         if (asal == null || asal.isBlank()) {
            System.out.println("Alamat asal tidak valid. Mohon masukkan alamat yang valid.");
        } else {
            System.out.println("Alamat asal telah ditetapkan: " + asal);
        }
    }
}

