/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q5;

/**
 *
 * @author MTLS
 */
public class DoiTuong {
    protected String MaDoiTuong;
    protected String TenDoiTuong;
    protected boolean gioiTinh;
    protected String yob;

    public DoiTuong(String MaDoiTuong, String TenDoiTuong, boolean gioiTinh, String yob) {
        this.MaDoiTuong = MaDoiTuong;
        this.TenDoiTuong = TenDoiTuong;
        this.gioiTinh = gioiTinh;
        this.yob = yob;
    }

    @Override
    public String toString() {
        return "MaDoiTuong=" + MaDoiTuong + ", TenDoiTuong=" + TenDoiTuong + ", gioiTinh=" + gioiTinh + ", yob=" + yob + '}';
    }
    
}
