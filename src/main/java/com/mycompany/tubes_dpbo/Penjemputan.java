/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo;

/**
 *
 * @author Raka Darma
 */
public class Penjemputan {
    private String lokasiPenjemputan;
    private String waktuPenjemputan;
    private String namaPenjemput;

    public Penjemputan(String lokasiPenjemputan, String waktuPenjemputan, String namaPenjemput) {
        this.lokasiPenjemputan = lokasiPenjemputan;
        this.waktuPenjemputan = waktuPenjemputan;
        this.namaPenjemput = namaPenjemput;
    }

    public String getLokasiPenjemputan() {
        return lokasiPenjemputan;
    }

    public void setLokasiPenjemputan(String lokasiPenjemputan) {
        this.lokasiPenjemputan = lokasiPenjemputan;
    }

    public String getWaktuPenjemputan() {
        return waktuPenjemputan;
    }

    public void setWaktuPenjemputan(String waktuPenjemputan) {
        this.waktuPenjemputan = waktuPenjemputan;
    }

    public String getNamaPenjemput() {
        return namaPenjemput;
    }

    public void setNamaPenjemput(String namaPenjemput) {
        this.namaPenjemput = namaPenjemput;
    }
}

