/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tubes_dpbo;

/**
 *
 * @author Raka Darma
 */
import com.mycompany.tubes_dpbo.userClass.Driver;
import com.mycompany.tubes_dpbo.userClass.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        menu.registrationMenu();
    }
}

