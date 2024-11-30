/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo;

/**
 *
 * @author Raka Darma
 */
public class Pesanan {
    private String idPesanan;
    private String tanggalPesanan;
    private String statusPesanan;
    private double totalHarga;

   
    public Pesanan(String idPesanan, String tanggalPesanan, String statusPesanan, double totalHarga) {
        this.idPesanan = idPesanan;
        this.tanggalPesanan = tanggalPesanan;
        this.statusPesanan = statusPesanan;
        this.totalHarga = totalHarga;
    }

   
    public String getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    public String getTanggalPesanan() {
        return tanggalPesanan;
    }

    public void setTanggalPesanan(String tanggalPesanan) {
        this.tanggalPesanan = tanggalPesanan;
    }

    public String getStatusPesanan() {
        return statusPesanan;
    }

    public void setStatusPesanan(String statusPesanan) {
        this.statusPesanan = statusPesanan;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    
    @Override
    public String toString() {
        return "Pesanan{idPesanan='" + idPesanan + "', tanggalPesanan='" + tanggalPesanan + "', statusPesanan='" 
            + statusPesanan + "', totalHarga=" + totalHarga + '}';
    }
}
