/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo;

/**
 *
 * @author Raka Darma
 */
import java.util.Scanner;
public class Menu {
    private Scanner scanner;
    ArrayList<RegistrasiUser> user = new ArrayList<>();
    ArrayList<RegistrasiDriver> driver = new ArrayList<>();

    // Constructor to pass the scanner instance
    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void registrationMenu() {
        System.out.println("\nSelamat Datang di Aplikasi kami");
        System.out.println("===============================");
        System.out.println("Registrasi");
        System.out.println("1. Daftar sebagai pengguna");
        System.out.println("2. Daftar sebagai pengemudi");
        System.out.println("3. Verifikasi User");
        System.out.println("4. Tampilkan Info Driver");
        System.out.println("5. Keluar");
        System.out.print("Pilih opsi (1/2/3/4/5): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
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


                //yang lama
                /*System.out.println("Anda memilih untuk mendaftar sebagai pengguna.");
                System.out.print("Masukkan nama pengguna: ");
                String username = scanner.nextLine();
                System.out.println("Selamat, " + username + "! Anda telah terdaftar sebagai pengguna.");
                mainMenu(username); // Call mainMenu with the user's name
                break;*/

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




                //yang lama
                /*System.out.println("Anda memilih untuk mendaftar sebagai pengemudi.");
                System.out.print("Masukkan nama pengemudi: ");
                String driverName = scanner.nextLine();
                System.out.println("Selamat, " + driverName + "! Anda telah terdaftar sebagai pengemudi.");
                mainMenu(driverName); // Call mainMenu with the driver's name
                break;*/

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
                    }else {
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
                    System.out.println("Terima kasih telah menggunakan sistem registrasi!");
                    System.exit(0);
                    break;

            default:
                System.out.println("Opsi tidak valid. Silakan coba lagi.");
                registrationMenu(); // Retry registration menu
        }
    }

    public void mainMenu(String name) {
        System.out.println("\nHalo " + name + ", selamat datang di menu utama!");
        System.out.println("Silakan pilih layanan yang Anda inginkan.");
        // You can expand this with more menu options later
    }
}


