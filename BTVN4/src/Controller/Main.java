
package Controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.SinhVien;
public class Main {
    private static ArrayList<SinhVien> listSinhVien = new ArrayList<>();
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Them sinh vien");
            System.out.println("2. Xoa sinh vien");
            System.out.println("3. Sua thong tin sinh vien");
            System.out.println("4. In thong tin sinh vien");
            System.out.println("5. In thong tin cua toan bo sinh vien nam");
            System.out.println("6. In thong tin cua toan bo sinh vien nu");
            System.out.println("7.Thoat");
            System.out.println("Chon chuc nang: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                themSinhVien(sc);
                break;
                case 2:
                xoaSinhVien(sc);
                break;
                case 3:
                suaSinhVien(sc);
                break;
                case 4:
                inThongTinSinhVien();
                case 5:
                inThongTinSinhVienGioiTinh("Nam");
                case 6:
                inThongTinSinhVienGioiTinh("Nu");
                break;
                case 7:
                return;
                default:
                System.out.println("Chuc nang khong hop le ");
            }
            
        }
        
    }
private static void themSinhVien(Scanner sc){
    System.out.print("Nhap ma sinh vien: ");
    String id = sc.nextLine();
    System.out.print("Nhap ten sinh vien: ");
    String name = sc.nextLine();
    System.out.print("Nhap gioi tinh (Nam/Nu): ");
    String gender = sc.nextLine();
    System.out.print("Nhap chuyen nganh: ");
    String major = sc.nextLine();
    SinhVien sinhVien = new SinhVien(id,name,gender,major);
    listSinhVien.add(sinhVien);
    System.out.println("Them sinh vien thanh cong ");
}
private static void xoaSinhVien(Scanner sc){
    System.out.print("Nhap ma sinh vien can xoa: ");
    String id =sc.nextLine();
    for(int i = 0 ;i < listSinhVien.size();i++){
        if(listSinhVien.get(i).getId().equals(id)){
            listSinhVien.remove(i);
            System.out.println("Xoa Sinh Vien Thanh Cong ");
            return;
        }
    }
System.out.println("Khong Tim Thay Ma Sinh Vien ");
}
private static void suaSinhVien(Scanner sc){
    System.out.print("Nhap ma sinh vien can sua: ");
    String id = sc.nextLine();
    for(SinhVien sv : listSinhVien){
        if(sv.getId().equals(id)){
           System.out.print("Nhap ten moi: ");
           sv.setName(sc.nextLine());
           System.out.print("Nhap gioi tinh moi (Nam/Nu): ");
           sv.setGender(sc.nextLine());
           System.out.print("Nhap chuyen nganh moi: ");
           sv.setMajor(sc.nextLine());
           System.out.print("Sua thong tin sinh vien thanh cong!");
           return;
        }
    }
}
private static void inThongTinSinhVien(){
    for(SinhVien sv : listSinhVien){
        System.out.println(sv);
    }
   }
private static void inThongTinSinhVienGioiTinh(String gender){
    for(SinhVien sv : listSinhVien){
        if(sv.getGender().equalsIgnoreCase(gender)){
            System.out.println(sv);
        }
    }
  }
}

  