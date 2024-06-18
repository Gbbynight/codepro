/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project.pkg2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MTLS
 */
public class PROJECT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer cm = new Customer("VietNam","Minh","21","Male");
        Product p1 = new Product("Laptop","Acer Nitro 5", 2100.00);
        Product p2 = new Product("SmartPhone","Iphone 15", 3000.00);
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);     
        
        Order order = new Order("180604", "2024-06-18", cm, products);
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Date Created: " + order.getDateCreated());
        System.out.println("Customer Name: " + order.getCustomer().getName());
        System.out.println("Customer Country: " + order.getCustomer().getCountry());
        System.out.println("Products in the Order:");
        for (Product product : order.getProductList()) {
        System.out.println("- " + product.getProductName() + " (ID: " + product.getProductID() + ", Price: $" + product.getProductPrice() + ")"); 
    }
    
 }
}