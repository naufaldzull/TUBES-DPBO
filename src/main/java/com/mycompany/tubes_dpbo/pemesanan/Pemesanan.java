/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.pemesanan;

/**
 *
 * @author Raka Darma
 */
public class Pemesanan {
    private String orderID;
    private String Name;
    private String pickuplocation;
    private String destination;
    private int estimatedTime;
    private double price;

    public Pemesanan(String orderID, String Name, String pickuplocation, String destination, int estimatedTime, double price) {
        this.orderID = orderID;
        this.Name = Name;
        this.pickuplocation = pickuplocation;
        this.destination = destination;
        this.estimatedTime = estimatedTime;
        this.price = price;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPickuplocation() {
        return pickuplocation;
    }

    public void setPickuplocation(String pickuplocation) {
        this.pickuplocation = pickuplocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pemesanan dengan " + "orderID: " + orderID + ", Nama: " + Name + ", Lokasi Penjemputan: " + pickuplocation + ", Tujuan: " + destination + ", Estimasi Waktu: " + estimatedTime + ", Harga:" + price ;
    }
}
