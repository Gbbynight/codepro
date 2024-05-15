/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Students {
    private String idS;
    private String nameS;
    private String phoneNumberS;
    private String addressS;
    private String gioitinhS;

    public Students(String idS, String nameS, String phoneNumberS, String addressS, String gioitinhS) {
        this.idS = idS;
        this.nameS = nameS;
        this.phoneNumberS = phoneNumberS;
        this.addressS = addressS;
        this.gioitinhS = gioitinhS;
    }

    public String getIdS() {
        return idS;
    }

    public void setIdS(String idS) {
        this.idS = idS;
    }

    public String getNameS() {
        return nameS;
    }

    public void setNameS(String nameS) {
        this.nameS = nameS;
    }

    public String getPhoneNumberS() {
        return phoneNumberS;
    }

    public void setPhoneNumberS(String phoneNumberS) {
        this.phoneNumberS = phoneNumberS;
    }

    public String getAddressS() {
        return addressS;
    }

    public void setAddressS(String addressS) {
        this.addressS = addressS;
    }

    public String getGioitinhS() {
        return gioitinhS;
    }

    public void setGioitinhS(String gioitinhS) {
        this.gioitinhS = gioitinhS;
    }

    @Override
    public String toString() {
        return "Students{" + "idS=" + idS + ", nameS=" + nameS + ", phoneNumberS=" + phoneNumberS + ", addressS=" + addressS + ", gioitinhS=" + gioitinhS + '}';
    }
    
}
