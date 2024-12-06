/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.registrasi;

import com.mycompany.tubes_dpbo.registrasi.Registrasi;

/**
 *
 * @author Raka Darma
 */
public class RegistrasiDriver extends Registrasi {
    private String sim;
    private String kendaraan;

    public RegistrasiDriver(String nama, int noTelp, String email, String sim, String kendaraan) {
        super(nama, noTelp, email);
        this.sim = sim;
        this.kendaraan = kendaraan;
    }

    public String getSim() {
        return sim;
    }

    public String getKendaraan() {
        return kendaraan;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public void setKendaraan(String kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void uploadDokumen() {
        System.out.println("Dokumen dengan SIM: " + sim + " berhasil diunggah.");
    }

    public void infoKendaraan() {
        System.out.println("Kendaraan: " + kendaraan + ", SIM: " + sim);
    }

    @Override
    public String toString() {
        return "RegistrasiDriver{" + "sim=" + sim + ", kendaraan=" + kendaraan + '}';
    }
}
