/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoscanner;

import java.util.Scanner;

/**
 *
 * @author MTLS
 */
public class demo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
   System.out.println("Nhap Thong Tin: ");
   System.out.println("Ten: ");
   String name = sc.nextLine();
   System.out.print("Tuoi: ");
        int age;
        try {
            age = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Vui long nhap so nguyen.");
            return;
        }
   System.out.println("Dia chi: ");
   String address = sc.nextLine();
   System.out.println("So Dien Thoai: ");
   String phonenumber = sc.nextLine();
   System.out.println("Chuyen nganh dang hoc: ");
   String specialized = sc.nextLine();
   System.out.println("\nThong tin ca nhan: ");
   System.out.println("Ten " + name );
   System.out.println("Tuoi " + age );
   System.out.println("Dia Chi " + address );
   System.out.println("Chuyen nganh dang hoc " + specialized );
   sc.close();
    }
    
}
