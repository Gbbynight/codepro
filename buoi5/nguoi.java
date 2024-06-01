
package buoi5;

/**
 *
 * @author MTLS
 */
public class nguoi {
    private String HoTen;
    private int Tuoi;
    private String soCMND;

    public nguoi(String hoTen, int Tuoi, String soCMND) {
        setHoTen(hoTen);
        this.Tuoi = Tuoi;
        this.soCMND = soCMND;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        if(HoTen.matches("\\d+")){
            throw new IllegalArgumentException("Ten khong duoc co so u dumbass");
        }
        this.HoTen = HoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    @Override
    public String toString() {
        return "nguoi{" + "HoTen=" + HoTen + ", Tuoi=" + Tuoi + ", soCMND=" + soCMND + '}';
    }
    
}
