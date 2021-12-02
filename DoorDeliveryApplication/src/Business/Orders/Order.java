/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Orders;

import java.awt.Image;

/**
 *
 * @author Nidhi Raghavendra
 */
public class Order {
    private String name;
    private double price;
    private Image prescription;
    
    public Order() {
        this.name = "";
        this.price = 0.0;
        this.prescription = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Image getPrescription() {
        return prescription;
    }

    public void setPrescription(Image prescription) {
        this.prescription = prescription;
    }
    
    
}
