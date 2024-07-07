/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MTLS
 */
public class MyString implements IString{

    @Override
    public int f1(String str) {
     String[] words = str.trim().split("\\s+");
     int count = 0;
     for(String word : words){
             if(!word.matches("\\d+")){
                 count++;
             }
     }
     return count;
    }
    @Override
    public String f2(String str) {
    }
    
}
