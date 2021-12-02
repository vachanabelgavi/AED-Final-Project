/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Products;

/**
 *
 * @author Nidhi Raghavendra
 */
public class Product {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Product() {
        this.name = "";
    }
}
