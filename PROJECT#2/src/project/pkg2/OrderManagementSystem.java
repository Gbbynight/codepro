/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.pkg2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author MTLS
 */
public class OrderManagementSystem {
    private List<Product> productList;
    private List<Order> orderList;

    public OrderManagementSystem() {
        this.productList = new ArrayList<>();
        this.orderList = new ArrayList<>();
    }
   public void addProduct(Product product){
       productList.add(product);
   }
    public void updateProductPrice(String productID,double newPrice){
        for(Product product : productList){
            if(product.getProductID().equals(productID)){
               product.setProductPrice(newPrice);
               break;
            }
        }
    }

    public List<Product> getProductList() {
        return productList;
    }
    public void createOrder(Order order){
        orderList.add(order);
    }

    public Order getOrderList(String orderID) {
        for(Order order : orderList){
        if(order.getOrderId().equals(orderID)){
            return order;
        }
    }
        return null;
    
    
    }
    public void printOrderByID(String orderID){
        Order order = getOrderList(orderID);
        if(order != null){
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Date Created: " + order.getDateCreated());
            System.out.println("Customer Name: " + order.getCustomer().getName());
            System.out.println("Product:");
            for (Product product : order.getProductList()){
                System.out.println("-"+ product.getProductName()+"($"+ product.getProductPrice() +")");
                
            } 
              } else {
            System.out.println("Order not found");
        }
    }
public void sortProductByPrice(){
    Collections.sort(productList);
    }
public void printAllCustomers(){
  for(Order order : orderList){
      Customer customer = order.getCustomer();
      System.out.println("Name: " + customer.getName());
            System.out.println("Sex: " + customer.getSex());
            System.out.println("Language: " + customer.language());
            System.out.println("Country: " + customer.getCountry());
  }
 }
}
