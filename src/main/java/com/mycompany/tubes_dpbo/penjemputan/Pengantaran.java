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
    private String tujuan;

    public Pengantaran(String namaPenumpang, String tujuan) {
        if (tujuan == null || tujuan.isBlank()) {
            throw new IllegalArgumentException("Tujuan perjalanan tidak boleh kosong.");
        }
        this.namaPenumpang = namaPenumpang;
        this.tujuan = tujuan;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public String getTujuan() {
        return tujuan;
    }
    

    @Override
    public void alamatTujuan(String tujuan) {
         System.out.println("Pengantaran atas nama "+ this.getNamaPenumpang()+ " akan dilakukan untuk Tujuan: " + tujuan);
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

