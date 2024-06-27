/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q5;

/**
 *
 * @author MTLS
 */
public class Teacher extends DoiTuong{
    private String monDay;
    private String trinhDo;

    public Teacher(String MaDoiTuong, String TenDoiTuong, boolean gioiTinh, String yob, String monDay, String trinhDo) {
        super(MaDoiTuong, TenDoiTuong, gioiTinh, yob);
        this.monDay = monDay;
        this.trinhDo = trinhDo;
    }

    @Override
    public String toString() {
        return super.toString() + "monDay=" + monDay + ", trinhDo=" + trinhDo + '}';
    }
    
}
