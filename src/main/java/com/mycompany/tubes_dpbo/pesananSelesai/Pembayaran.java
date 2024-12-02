/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.pesananSelesai;

/**
 *
 * @author Raka Darma
 */
public class Pembayaran {
    private String idPembayaran;
    private String metodePembayaran;
    private String statusPembayaran;
    private double jumlahBayar;

   
    public Pembayaran(String idPembayaran, String metodePembayaran, String statusPembayaran, double jumlahBayar) {
        this.idPembayaran = idPembayaran;
        this.metodePembayaran = metodePembayaran;
        this.statusPembayaran = statusPembayaran;
        this.jumlahBayar = jumlahBayar;
    }

   
    public String getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(String idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

   
    @Override
    public String toString() {
        return "Pembayaran{idPembayaran='" + idPembayaran + "', metodePembayaran='" + metodePembayaran + "', statusPembayaran='" 
            + statusPembayaran + "', jumlahBayar=" + jumlahBayar + '}';
    }
}
