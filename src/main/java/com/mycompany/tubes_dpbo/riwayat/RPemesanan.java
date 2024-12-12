/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_dpbo.riwayat;

/**
 *
 * @author Raka Darma
 */
public abstract class RPemesanan {
    protected String DName;
    protected String UName;
    protected String orderID;

    public RPemesanan(String DName, String UName, String orderID) {
        this.DName = DName;
        this.UName = UName;
        this.orderID = orderID;
    }
    
    public abstract void DName();
    public abstract void Uname();
    public abstract void OrderID();
}
