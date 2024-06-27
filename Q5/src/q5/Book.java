/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q5;

/**
 *
 * @author MTLS
 */
public class Book extends ThuVien{
    private int soTrang;

    public Book(String maTaiLieu, String tenTL, String NXB, int soTrang) {
        super(maTaiLieu, tenTL, NXB);
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return super.toString() + "soTrang=" + soTrang;
    }
    
}
