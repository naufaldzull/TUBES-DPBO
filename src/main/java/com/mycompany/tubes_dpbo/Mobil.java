/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo;

/**
 *
 * @author Raka Darma
 */
public class Mobil extends Pemesanan {
    private String typeMobil;
    private int kapasitasPenumpang;

    public Mobil(String orderID, String Name, String pickuplocation, String destination, int estimatedTime, double price, String typeMobil,  int kapasitasPenumpang ) {
        super(orderID, Name, pickuplocation, destination, estimatedTime, price);
        this.typeMobil = typeMobil;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String getTypeMobil() {
        return typeMobil;
    }

    public void setTypeMobil(String typeMobil) {
        this.typeMobil = typeMobil;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public String toString() {
        return  "Pemesanan dengan orderID: " + super.getOrderID() + ", Nama: " + super.getName() + ", Lokasi Penjemputan: " + super.getPickuplocation() + ", Tujuan: " + super.getDestination() + ", Estimasi Waktu: " + super.getEstimatedTime() + ", Harga:" + super.getPrice() + "Menggunakan Mobil dengan tipe Mobil: " + typeMobil + ", dengan kapasitas penumpang: " + kapasitasPenumpang;
    }
}
