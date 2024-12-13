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
    private String waktuPenjemputan;
    private String namaPenjemput;

    public Penjemputan(String lokasiPenjemputan, String waktuPenjemputan, String namaPenjemput) {
          if (lokasiPenjemputan == null || lokasiPenjemputan.isBlank()) {
            throw new IllegalArgumentException("Lokasi penjemputan tidak boleh kosong.");
        }
        if (waktuPenjemputan == null || waktuPenjemputan.isBlank()) {
            throw new IllegalArgumentException("Waktu penjemputan tidak boleh kosong.");
        }
        if (namaPenjemput == null || namaPenjemput.isBlank()) {
            throw new IllegalArgumentException("Nama penjemput tidak boleh kosong.");
        }
        
        this.lokasiPenjemputan = lokasiPenjemputan;
        this.waktuPenjemputan = waktuPenjemputan;
        this.namaPenjemput = namaPenjemput;
    }

    public String getLokasiPenjemputan() {
        return lokasiPenjemputan;
    }

    public String getWaktuPenjemputan() {
        return waktuPenjemputan;
    }

    public String getNamaPenjemput() {
        return namaPenjemput;
    }

    @Override
    public void alamatTujuan() {
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

