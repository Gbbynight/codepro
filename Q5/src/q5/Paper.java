/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q5;

/**
 *
 * @author MTLS
 */
public class Paper extends ThuVien{
    private int taiBan;

    public Paper(String maTaiLieu, String tenTL, String NXB, int taiBan) {
        super(maTaiLieu, tenTL, NXB);
        this.taiBan = taiBan;
    }

    @Override
    public String toString() {
        return super.toString() + "taiBan=" + taiBan ;
    }
    
}
