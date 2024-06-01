
package buoi5;

import java.util.ArrayList;

/**
 *
 * @author MTLS
 */
public class khachsan {
 private ArrayList<nguoi> danhsachkhachthue;
 private ArrayList<Integer> songaythue;
 private ArrayList<Character> loaiphong;

 public khachsan(){
  this.danhsachkhachthue = new ArrayList<>();
  this.songaythue = new ArrayList<>();
  this.loaiphong = new ArrayList<>();
 }   
public boolean themkhach(nguoi nguoi, int ngaythue, char loaiphong){
    for (nguoi kh : danhsachkhachthue){
        if(kh.getSoCMND().equals(nguoi.getSoCMND())){
            System.out.println("So CMND " + nguoi.getSoCMND() + " da con ton tai vui long nhap lai. ");
            return false;
        }
    }
 this.danhsachkhachthue.add(nguoi);
 this.songaythue.add(ngaythue);
 this.loaiphong.add(loaiphong);
 return true;
 }
public void xoakhach(String soCMND){
    for(int i = 0; i < danhsachkhachthue.size();i++){
    if(danhsachkhachthue.get(i).getSoCMND().equals(soCMND)){
        danhsachkhachthue.remove(i);
        songaythue.remove(i);
        loaiphong.remove(i);
        return;
    }
  }
}
public double tienthuephong(String soCMND){
    for (int i = 0; i < danhsachkhachthue.size();i++){
        if(danhsachkhachthue.get(i).getSoCMND().equals(soCMND)){
            int ngaythue = songaythue.get(i);
            char phong = loaiphong.get(i);
            double giaphong = 0;
            switch(phong){
                case 'A':
                giaphong = 500;
                break;
                case 'B':
                giaphong = 300;
                break;
                case 'C':
                giaphong = 100;
                break;
            }
            return ngaythue * giaphong;
        }
    }
    return 0;
}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
       for (nguoi kh : danhsachkhachthue){
           sb.append(kh.toString()).append("\n");
       }
        return sb.toString();
    }

}