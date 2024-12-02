/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.pemesanan;

import com.mycompany.tubes_dpbo.pemesanan.Pemesanan;

/**
 *
 * @author Raka Darma
 */
public class Motor extends Pemesanan {
    private String typeMotor;

    public Motor(String orderID, String Name, String pickuplocation, String destination, int estimatedTime, double price, String typeMotor) {
        super(orderID, Name, pickuplocation, destination, estimatedTime, price);
        this.typeMotor = typeMotor;
    }

    public String getTypeMotor() {
        return typeMotor;
    }

    public void setTypeMotor(String typeMotor) {
        this.typeMotor = typeMotor;
    }

    @Override
    public String toString() {
        return "Pemesanan dengan orderID: " + super.getOrderID() + ", Nama: " + super.getName() + ", Lokasi Penjemputan: " + super.getPickuplocation() + ", Tujuan: " + super.getDestination() + ", Estimasi Waktu: " + super.getEstimatedTime() + ", Harga:" + super.getPrice() + "Menggunakan Motor dengan tipe motor: " + typeMotor;
    }
}

