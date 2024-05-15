/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn3;

import model.GiaoVien;
import model.Students;
import model.MonHoc;
public class BTVN3 {
   public static void main(String[] args) {
       GiaoVien gv = new GiaoVien("GV02","Nguyen Truong G", "03849329234", "24 Tran Dang Ninh");
       Students hs = new Students("HE195090", "Hoang Tran H", "0987654321", "456 Second St", "Nu");
       MonHoc sj= new MonHoc("MAD101", "Toan Roi Rac");
       gv.setNameGV("Huong Thi H");
       hs.setGioitinhS("Nam");
       sj.setTenMonhoc("Mathematic for engineering");
       System.out.println(gv);
       System.out.println(hs);
       System.out.println(sj);
    }
    
}
