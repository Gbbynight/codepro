/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.pkg2;

/**
 *
 * @author MTLS
 */
public class Customer extends Person{
    private String country;

    public Customer(String country, String name, String age, String sex) {
        super(name, age, sex);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String language() {
        switch(country){
            case"USA":
                return"English";
            case"VN":
                return "Vietnamese";
            case"JP":
                return"Japanese";
            default:
                return"Unknown";
        }
    }
}

