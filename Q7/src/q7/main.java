
package q7;

import java.util.Scanner;

/**
 *
 * @author MTLS
 */
public class main {
public static void main(String[] args){
    
        PhoneBook phoneBook = new PhoneBook();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nPHONEBOOK MANAGEMENT SYSTEM");
            System.out.println("1. Nhap SDT");
            System.out.println("2. Xoa SDT");
            System.out.println("3. Cap Nhat SDT");
            System.out.println("4. Tim SDT");
            System.out.println("5. Sap xep SDT");
            System.out.println("6. Thoat");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhap ten: ");
                    String name = sc.nextLine();
                    System.out.print("nhap SDT: ");
                    String phone = sc.nextLine();
                    phoneBook.insertPhone(name, phone);
                    break;
                case 2:
                    System.out.print("Nhap ten: ");
                    name = sc.nextLine();
                    phoneBook.removePhone(name);
                    break;
                case 3:
                    System.out.print("Nhap ten: ");
                    name = sc.nextLine();
                    System.out.print("nhap SDT: ");
                    phone = sc.nextLine();
                    phoneBook.updatePhone(name, phone);
                    break;
                case 4:
                    System.out.print("Nhap ten: ");
                    name = sc.nextLine();
                    phoneBook.searchPhone(name);
                    break;
                case 5:
                    phoneBook.sort();
                    System.out.println("SDT da duoc sap xep.");
                    break;
                case 6:
                    System.out.println("Thoat");
                    sc.close();
                    return;
                default:
                    System.out.println("Ban da chon sai vui long nhap lai.");
            }
        }
    }
}
    
    

