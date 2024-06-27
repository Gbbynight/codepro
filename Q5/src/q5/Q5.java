/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MTLS
 */
public class Q5 {

    private static ArrayList<DoiTuong> DoiTuongList = new ArrayList<>();
  private static ArrayList<ThuVien> ThuVienList = new ArrayList<>();
  private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       while (true){
           showMenu();
           int choice = Integer.parseInt(sc.nextLine());
           switch(choice){
               case 1:
                   addHocSinh();
                   break;
               case 2:
                   addGiaoVien();
                   break;
               case 3:
                   addBook();
                   break;
               case 4:
                   addPaper();
                   break;
               case 5:
                   displayAllDoiTuong();
                   break;
               case 6:
                   displayAllThuVien();
                   break;
               default:
                  System.out.println("Nhap Sai! Hay thu lai."); 
             
           }
       }
    }
       private static void showMenu(){
        System.out.println("Choose 1: Them Hoc Sinh");
        System.out.println("Choose 2: Them Giao Vien");
        System.out.println("Choose 3: Them sach");
        System.out.println("Choose 4: Them tai lieu");
        System.out.println("Choose 5: Hien thi ra tat ca cac Doi tuong");
        System.out.println("Choose 6: Hien thi ra tat ca cac sach hoac tai lieu co trong thu vien");
    }
       private static void addHocSinh(){
           System.out.println("Nhap ma hoc sinh:");
           String ma =sc.nextLine();
           System.out.println("Nhap ten hoc sinh: ");
           String ten = sc.nextLine();
           System.out.println("Nhap gioi tinh (true for Nam, false for Nu: ");
           boolean gioiTinh = Boolean.parseBoolean(sc.nextLine());
           System.out.println("Nhap nam sinh: ");
           String yob =sc.nextLine();
           System.out.println("Nhap lop:");
           String lop = sc.nextLine();
           System.out.println("Nhap ban:");
           String ban = sc.nextLine();

        Student hs = new Student(ma, ten, gioiTinh, yob, lop, ban);
        DoiTuongList.add(hs);
    }
       private static void addGiaoVien(){
           System.out.println("Nhap ma Giao Vien:");
           String ma =sc.nextLine();
           System.out.println("Nhap ten Giao Vien: ");
           String ten = sc.nextLine();
           System.out.println("Nhap gioi tinh (true for Nam, false for Nu: ");
           boolean gioiTinh = Boolean.parseBoolean(sc.nextLine());
           System.out.println("Nhap nam sinh: ");
           String yob =sc.nextLine();
           System.out.println("Nhap mon day:");
           String monDay = sc.nextLine();
           System.out.println("Nhap trinh do:");
           String trinhDo = sc.nextLine();

        Teacher gv = new Teacher(ma, ten, gioiTinh, yob, monDay, trinhDo);
        DoiTuongList.add(gv);
       }
       private static void addBook() {
        System.out.println("Nhap ma sach:");
        String ma = sc.nextLine();
        System.out.println("Nhap ten sach:");
        String ten = sc.nextLine();
        System.out.println("Nhap NXB:");
        String NXB = sc.nextLine();
        System.out.println("Nhap tai ban:");
        int soTrang = Integer.parseInt(sc.nextLine());

        Book book = new Book(ma, ten, NXB, soTrang);
        ThuVienList.add(book);
    } 
      private static void addPaper() {
        System.out.println("Nhap ma tai lieu:");
        String ma = sc.nextLine();
        System.out.println("Nhap ten tai lieu:");
        String ten = sc.nextLine();
        System.out.println("Nhap NXB:");
        String NXB = sc.nextLine();
        System.out.println("Nhap tai ban:");
        int taiBan = Integer.parseInt(sc.nextLine());

        Paper paper = new Paper(ma, ten, NXB, taiBan);
        ThuVienList.add(paper);
    } 
      
      private static void displayAllDoiTuong(){
          for(DoiTuong dt : DoiTuongList){
              System.out.println(dt);
          }
      }
      private static void displayAllThuVien(){
      for(ThuVien tv : ThuVienList){
          System.out.println(tv);
      }
  }
}
     
    
    

