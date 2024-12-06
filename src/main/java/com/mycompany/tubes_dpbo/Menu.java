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
        System.out.print("Pilih opsi (1/2): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                System.out.println("Anda memilih untuk mendaftar sebagai pengguna.");
                System.out.print("Masukkan nama pengguna: ");
                String username = scanner.nextLine();
                System.out.println("Selamat, " + username + "! Anda telah terdaftar sebagai pengguna.");
                mainMenu(username); // Call mainMenu with the user's name
                break;

            case 2:
                System.out.println("Anda memilih untuk mendaftar sebagai pengemudi.");
                System.out.print("Masukkan nama pengemudi: ");
                String driverName = scanner.nextLine();
                System.out.println("Selamat, " + driverName + "! Anda telah terdaftar sebagai pengemudi.");
                mainMenu(driverName); // Call mainMenu with the driver's name
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
