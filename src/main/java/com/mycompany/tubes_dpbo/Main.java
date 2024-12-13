/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tubes_dpbo;

/**
 *
 * @author Raka Darma
 */
import com.mycompany.tubes_dpbo.registrasi.Registrasi;
import com.mycompany.tubes_dpbo.registrasi.RegistrasiUser;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<RegistrasiUser> user = new ArrayList<>();

        while (true) {
            System.out.println("\n=== APLIKASI ANTAR JEMPUT KENDARAAN ONLINE ===");
            System.out.println("1. Registrasi User");
            System.out.println("2. Verifikasi User");
            System.out.println("3. Login User");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String namaUser = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon: ");
                    String noTelpUser = scanner.nextLine();
                    System.out.print("Masukkan email: ");
                    String emailUser = scanner.nextLine();
                    System.out.print("Masukkan alamat: ");
                    String alamatUser = scanner.nextLine();

                    RegistrasiUser newUser = new RegistrasiUser(alamatUser, namaUser, noTelpUser, emailUser);

                    if (Registrasi.isEmpty(newUser.getNama(), newUser.getNoTelp(), newUser.getEmail(), newUser.getAlamat(), null, null)) {
                        System.out.println("Registrasi user gagal. Semua data harus diisi.");
                    } else {
                        user.add(newUser);
                        System.out.println("Registrasi user berhasil!");
                    }
                    break;

                case 2:
                    if (!user.isEmpty()) {
                        System.out.println("\n=== DAFTAR USER TERDAFTAR ===");
                        for (int i = 0; i < user.size(); i++) {
                            System.out.println((i + 1) + ". " + user.get(i).getNama());
                        }
                        System.out.println("============================");

                        System.out.print("Masukkan nama user yang ingin diverifikasi: ");
                        String namaVerifikasi = scanner.nextLine();
                        boolean userDitemukan = false;

                        for (RegistrasiUser users : user) {
                            if (users.getNama().equalsIgnoreCase(namaVerifikasi)) { 
                                users.verifikasiUser(); 
                                userDitemukan = true;
                                break;
                            }
                        }
                        if (!userDitemukan) {
                            System.out.println("User dengan nama tersebut tidak ditemukan.");
                        }
                    } else {
                        System.out.println("Belum ada data user yang terdaftar.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nama Anda untuk masuk ke Menu Utama: ");
                    String namaMasuk = scanner.nextLine();
                    boolean isUserRegistered = false;

                    for (RegistrasiUser users : user) {
                        if (users.getNama().equalsIgnoreCase(namaMasuk)) {
                            isUserRegistered = true;
                            System.out.println("Selamat datang, " + users.getNama() + "!");
                            showMenuUtama(scanner);
                            break;
                        }
                    }
                    if (!isUserRegistered) {
                        System.out.println("Nama tidak ditemukan. Silakan registrasi terlebih dahulu.");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan sistem registrasi!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void showMenuUtama(Scanner scanner) {
        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Pesan Kendaraan");
            System.out.println("2. Riwayat");   
            System.out.println("3. Promo");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = scanner.nextInt();
            scanner.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Fitur Pesan Kendaraan belum tersedia.");
                    break;
                case 2:
                    System.out.println("Fitur Riwayat belum tersedia.");
                    break;
                case 3:
                    System.out.println("Fitur Promo belum tersedia.");
                    break;
                case 4:
                    System.out.println("Keluar dari Menu Utama.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
    

