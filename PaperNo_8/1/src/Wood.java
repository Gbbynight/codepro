/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MTLS
 */
public class Wood {
    private String source;
    private int year;

    public Wood() {
    }

    public Wood(String source, int year) {
        this.source = source;
        this.year = year;
    }

    public String getSource() {
        if(source != null && source.length() > 0){
            return source.substring(0,source.length()-1);
        }
        return source;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        this.year = newYear - this.year;
    }
    
}
