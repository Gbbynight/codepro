
package thucchienscanne;
import java.util.Scanner;

public class BT02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("hay nhap mot so "); 
        int number = sc.nextInt();
        if (number % 2 == 0){
            printSquare(number);
        } else {
            printIsoscelesTriangle(number);
        }
    }
    public static void printSquare(int sideLength){
        for(int i = 0; i < sideLength; i++){
            for(int j = 0; j < sideLength; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printIsoscelesTriangle(int height){
        for (int i = 0; i < height; i++){
            for (int j = 0; j < height - i - 1;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
