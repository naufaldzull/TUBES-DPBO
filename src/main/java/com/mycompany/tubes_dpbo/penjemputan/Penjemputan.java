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

    @Override
    public void alamatTujuan() {
        if(" ".equals(getLokasiPenjemputan()) || getLokasiPenjemputan() == null){
            System.out.println("Lokasi penjemputan tidak diketahui.");
            System.out.println("Masukan ulang lokasi penjemputan");
            
        }else{
            System.out.println("Lokasi penjemputan berhasil di setting.");
            setLokasiPenjemputan(lokasiPenjemputan);
            System.out.println(getLokasiPenjemputan());
        }
    }

    @Override
    public void alamatAsal(String asal) {
        if (" ".equals(asal) || asal == null){
            System.out.println("Alamat asal tidak valid.");
            System.out.println("Mohon untuk masukan lagi alamta yang valid");
        }else if (!" ".equals(asal) || asal != null){
            System.out.println("Alamat tujuan berhasil di setting.");    
        }
    }
}

