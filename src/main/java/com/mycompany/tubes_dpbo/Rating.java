/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo;

/**
 *
 * @author Raka Darma
 */
public class Rating {
    // Attributes
    private String idRating;
    private int skorRating;
    private String komentar;
    private String tanggalRating;

  
    public Rating(String idPesanan, String tanggalPesanan, String statusPesanan, double totalHarga, String idRating, int skorRating, String komentar, String tanggalRating) {
      
        this.idRating = idRating;
        this.skorRating = skorRating;
        this.komentar = komentar;
        this.tanggalRating = tanggalRating;
    }


  
    public String getIdRating() {
        return idRating;
    }

    public void setIdRating(String idRating) {
        this.idRating = idRating;
    }

    public int getSkorRating() {
        return skorRating;
    }

    public void setSkorRating(int skorRating) {
        this.skorRating = skorRating;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    public String getTanggalRating() {
        return tanggalRating;
    }

    public void setTanggalRating(String tanggalRating) {
        this.tanggalRating = tanggalRating;
    }

   
    @Override
    public String toString() {
        return "Rating{" +
                "idRating='" + idRating + '\'' +
                ", skorRating=" + skorRating +
                ", komentar='" + komentar + '\'' +
                ", tanggalRating='" + tanggalRating + '\'' +
                '}';
    }
}

