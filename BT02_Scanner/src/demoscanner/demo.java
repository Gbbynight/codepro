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
public class demo {
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Nhap Thong Tin: ");
   System.out.println("Ten: ");
   String name = sc.nextLine();
   System.out.println("Tuoi: ");
   int age = sc.nextInt();
   sc.nextLine();
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
