package buoi5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        khachsan khachSan = new khachsan();

        while (true) {
            System.out.println("Chon chuc nang: ");
            System.out.println("1. Them khach");
            System.out.println("2. Xoa Khach");
            System.out.println("3. Tinh Tien thue phong");
            System.out.println("4. Hien thi danh sach khach hang");
            System.out.println("5. Thoát");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    int attempts = 0;
                    while (attempts < 3) {
                        try {
                            System.out.print("Nhap ho ten: ");
                            String hoTen = sc.nextLine();
                            System.out.print("Nhap tuoi: ");
                            int tuoi = sc.nextInt();
                            System.out.print("Nhap so CMND: ");
                            String soCMND = sc.next();
                            System.out.print("Nhap loai phong (A/B/C): ");
                            char loaiPhong = sc.next().charAt(0);
                            System.out.print("Nhap so ngay thue: ");
                            int ngayThue = sc.nextInt();
                            sc.nextLine(); // Consume newline

                            if (loaiPhong != 'A' && loaiPhong != 'B' && loaiPhong != 'C') {
                                throw new IllegalArgumentException("Khong co loai phong co ten nhu the, vui long nhap lai (chi co A, B, va C) mong ban khong bi dui.");
                            }

                            nguoi khachMoi = new nguoi(hoTen, tuoi, soCMND);
                            boolean result = khachSan.themkhach(khachMoi, ngayThue, loaiPhong);
                            if (!result) {
                                System.out.println("Hay nhap lai thong tin.");
                            } else {
                                break;
                            }
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        } catch (Exception e) {
                            System.out.println("Đa xay ra loi: " + e.getMessage());
                        }
                        attempts++;
                    }
                    if (attempts == 3) {
                        System.out.println("Ban đa nhap sai 3 lần, chương trinh da ghet roi, nguoi gi ma nhap ngu den tan 3 lan.");
                        sc.close();
                        return;
                    }
                    break;
                case 2:
                    System.out.print("Nhap so CMND cua khach can xoa: ");
                    String cmndXoa = sc.next();
                    khachSan.xoakhach(cmndXoa);
                    break;
                case 3:
                    System.out.print("Nhap so CMND của khach can tinh tien: ");
                    String cmndTinhTien = sc.next();
                    double tienThue = khachSan.tienthuephong(cmndTinhTien);
                    if (tienThue > 0) {
                        System.out.println("Tien thue phong cua khach " + cmndTinhTien + ": " + tienThue + " USD");
                    } else {
                        System.out.println("Khong tim thay khach với so CMND nay.");
                    }
                    break;
                case 4:
                    System.out.println("Danh sach khach hang trong khach san:");
                    System.out.println(khachSan);
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Lua chon khong hop le. Vui lòng chon lasi.");
            }
        }
    }
}
