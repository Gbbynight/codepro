
package project.pkg2;

import java.util.Objects;


public class Product implements Comparable<Product> {
 private String productName;
 private String productID;
 private double productPrice;

    public Product(String productName, String productID, double productPrice) {
        this.productName = productName;
        this.productID = productID;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    @Override
    public int compareTo(Product other) {
        return Double.compare(this.productPrice, other.productPrice);
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productID,product.productID);
    }
 @Override
    public int hashCode() {
        return Objects.hash(productID);
    }
 
}
