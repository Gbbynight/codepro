/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q5;

/**
 *
 * @author MTLS
 */
public class ThuVien {
    protected String maTaiLieu;
    protected String tenTL;
    protected String NXB;

    public ThuVien(String maTaiLieu, String tenTL, String NXB) {
        this.maTaiLieu = maTaiLieu;
        this.tenTL = tenTL;
        this.NXB = NXB;
    }

    @Override
    public String toString() {
        return "maTaiLieu=" + maTaiLieu + ", tenTL=" + tenTL + ", NXB=" + NXB + '}';
    }
    
}
