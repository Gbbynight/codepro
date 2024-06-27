/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q5;

/**
 *
 * @author MTLS
 */
public class Student extends DoiTuong{
    private String lop;
    private String ban;
public Student(String maDoiTuong, String tenDoiTuong, boolean gioiTinh, String yob, String lop, String ban) {
        super(maDoiTuong, tenDoiTuong, gioiTinh, yob);
        this.lop = lop;
        this.ban = ban;
    }

    

    @Override
    public String toString() {
        return super.toString() + "lop=" + lop + ", ban=" + ban ;
    }
    
}
