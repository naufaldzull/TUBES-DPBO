/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo;

/**
 *
 * @author Raka Darma
 */
public class MotorListrik extends Pemesanan {
    private String typeMotorListrik;

    public MotorListrik(String orderID, String Name, String pickuplocation, String destination, int estimatedTime, double price, String typeMotorListrik) {
        super(orderID, Name, pickuplocation, destination, estimatedTime, price);
        this.typeMotorListrik = typeMotorListrik;
    }

    public String getTypeMotorListrik() {
        return typeMotorListrik;
    }

    public void setTypeMotorListrik(String typeMotorListrik) {
        this.typeMotorListrik = typeMotorListrik;
    }

    @Override
    public String toString() {
        return  "Pemesanan dengan orderID: " + super.getOrderID() + ", Nama: " + super.getName() + ", Lokasi Penjemputan: " + super.getPickuplocation() + ", Tujuan: " + super.getDestination() + ", Estimasi Waktu: " + super.getEstimatedTime() + ", Harga:" + super.getPrice() + "Menggunakan Motor Listrik dengan tipe motor listrik: " + typeMotorListrik;
    }
}
