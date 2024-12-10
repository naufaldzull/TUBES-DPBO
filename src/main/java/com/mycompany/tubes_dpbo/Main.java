/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tubes_dpbo;

/**
 *
 * @author Raka Darma
 */
import com.mycompany.tubes_dpbo.registrasi.Registrasi;
import com.mycompany.tubes_dpbo.registrasi.RegistrasiDriver;
import com.mycompany.tubes_dpbo.registrasi.RegistrasiUser;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<RegistrasiUser> user = new ArrayList<>();
        ArrayList<RegistrasiDriver> driver = new ArrayList<>();

        while (true) {
            System.out.println("\n=== APLIKASI ANTAR JEMPUT KENDARAAN ONLINE ===");
            System.out.println("1. Registrasi User");
            System.out.println("2. Registrasi Driver");
            System.out.println("3. Verifikasi User");
            System.out.println("4. Tampilkan Info Driver");
            System.out.println("5. Masuk ke Menu Utama");
            System.out.println("6. Keluar");
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
                    System.out.print("Masukkan nama: ");
                    String namaDriver = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon: ");
                    String noTelpDriver = scanner.nextLine();
                    System.out.print("Masukkan email: ");
                    String emailDriver = scanner.nextLine();
                    System.out.print("Masukkan SIM: ");
                    String simDriver = scanner.nextLine();
                    System.out.print("Masukkan kendaraan: ");
                    String kendaraanDriver = scanner.nextLine();

                    RegistrasiDriver newDriver = new RegistrasiDriver(namaDriver, noTelpDriver, emailDriver, simDriver, kendaraanDriver);

                    if (Registrasi.isEmpty(newDriver.getNama(), newDriver.getNoTelp(), newDriver.getEmail(), null , newDriver.getSim(), newDriver.getKendaraan())) {
                        System.out.println("Registrasi driver gagal. Semua data harus diisi.");
                    } else {
                        driver.add(newDriver);
                        newDriver.uploadDokumen();
                    }
                    break;

                case 3:
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

                case 4:
                    if (!driver.isEmpty()) { 
                        System.out.println("\n=== DATA SEMUA DRIVER ===");
                        for (RegistrasiDriver drivers : driver) { 
                            System.out.println(drivers.toString()); 
                            drivers.infoKendaraan();
                            System.out.println("--------------------------");
                        }
                    } else {
                        System.out.println("Belum ada data driver yang terdaftar.");
                    }
                    break;

                case 5:
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

                case 6:
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
    

