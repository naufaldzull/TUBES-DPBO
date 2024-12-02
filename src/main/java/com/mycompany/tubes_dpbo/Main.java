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
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Role Selection Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menus
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");

        // Create menu items
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem aboutItem = new JMenuItem("About");

        // Add action listeners to menu items
        exitItem.addActionListener(e -> System.exit(0)); // Exit application
        aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(frame,
                "Role Selection Application\nVersion 1.0\nCreated by Your Name",
                "About", JOptionPane.INFORMATION_MESSAGE));

        // Add menu items to menus
        fileMenu.add(exitItem);
        helpMenu.add(aboutItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        // Add menu bar to frame
        frame.setJMenuBar(menuBar);

        // Panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));

        // Welcome label
        JLabel welcomeLabel = new JLabel("Welcome to Our Application", SwingConstants.CENTER);
        panel.add(welcomeLabel);

        // Instruction label
        JLabel instructionLabel = new JLabel("Select Role:", SwingConstants.CENTER);
        panel.add(instructionLabel);

        // User button
        JButton userButton = new JButton("User");
        panel.add(userButton);

        // Driver button
        JButton driverButton = new JButton("Driver");
        panel.add(driverButton);

        // Text area to display information
        JTextArea displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setMargin(new Insets(10, 10, 10, 10));
        JScrollPane scrollPane = new JScrollPane(displayArea);
        frame.add(scrollPane, BorderLayout.SOUTH);

        // ActionListener for User button
        userButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User user = new User("johnDoe", "password123", 1001, 987654321, 50000, "John Doe", 25, "User");
                displayArea.setText("User Information:\n" +
                        "Name: " + user.getName() + "\n" +
                        "Username: " + user.getUserName() + "\n" +
                        "Age: " + user.getAge() + "\n" +
                        "Phone Number: " + user.getPhoneNumber() + "\n" +
                        "GoPay Balance: " + user.getGopayBalance());
            }
        });

        // ActionListener for Driver button
        driverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Driver driver = new Driver("janeDoe", "password456", 2001, 123456789, 70000, "Jane Doe", 30, "Driver");
                displayArea.setText("Driver Information:\n" +
                        "Name: " + driver.getName() + "\n" +
                        "Driver ID: " + driver.getDriverName() + "\n" +
                        "Age: " + driver.getAge() + "\n" +
                        "Phone Number: " + driver.getPhoneNumber() + "\n" +
                        "GoPay Income: " + driver.getGopayIncome());
            }
        });

        // Add panel to frame
        frame.add(panel, BorderLayout.CENTER);

        // Set frame visibility
        frame.setVisible(true);
    }
    
    public void menu(){
        
    }
}

