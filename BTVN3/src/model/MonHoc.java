/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class MonHoc {
    private String idMonhoc;
    private String tenMonhoc;

    public MonHoc(String idMonhoc, String tenMonhoc) {
        this.idMonhoc = idMonhoc;
        this.tenMonhoc = tenMonhoc;
    }

    public String getIdMonhoc() {
        return idMonhoc;
    }

    public void setIdMonhoc(String idMonhoc) {
        this.idMonhoc = idMonhoc;
    }

    public String getTenMonhoc() {
        return tenMonhoc;
    }

    public void setTenMonhoc(String tenMonhoc) {
        this.tenMonhoc = tenMonhoc;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "idMonhoc=" + idMonhoc + ", tenMonhoc=" + tenMonhoc + '}';
    }
    
}
