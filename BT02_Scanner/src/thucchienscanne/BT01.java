/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thucchienscanne;

import java.util.Scanner;
 
public class BT01 {
public static boolean lasohoanhao(int number){
    int tongcuasochia = 0;
    for (int i = 1; i < number; i++){
        if (number % i == 0){
            tongcuasochia += i;
        }
    }
    return tongcuasochia == number;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap so thu nhat: ");
    int num1 = sc.nextInt();
    System.out.println("Nhap so thu hai: ");
    int num2 = sc.nextInt();
    boolean isNum1Perfect = lasohoanhao(num1);
    boolean isNum2Perfect = lasohoanhao(num2);
    System.out.println("So thu nhat la hoan hao: " + lasohoanhao(num1) );
    System.out.println("So thu hai la hoan hao: " + lasohoanhao(num2) );
}

}
