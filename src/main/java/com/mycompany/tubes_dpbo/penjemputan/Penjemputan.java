/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.penjemputan;

/**
 *
 * @author Raka Darma
 */
public class Penjemputan implements Alamat{
    private String lokasiPenjemputan;
    

    public Penjemputan(String lokasiPenjemputan) {
          if (lokasiPenjemputan == null || lokasiPenjemputan.isBlank()) {
            throw new IllegalArgumentException("Lokasi penjemputan tidak boleh kosong.");
          
        }
        this.lokasiPenjemputan = lokasiPenjemputan;
    }

    public String getLokasiPenjemputan() {
        return lokasiPenjemputan;
    }

    @Override
    public void alamatTujuan(String asal) {
        System.out.println("Lokasi penjemputan: " + lokasiPenjemputan);
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

