/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q7;

import java.util.ArrayList;

/**
 *
 * @author MTLS
 */
public abstract class Phone {
    protected ArrayList<String> PhoneList = new ArrayList<>();
    abstract void insertPhone(String name, String phone);
    abstract void removePhone(String name);
    abstract void updatePhone(String name,String newphone);
    abstract void searchPhone(String name);
    abstract void sort();
}
