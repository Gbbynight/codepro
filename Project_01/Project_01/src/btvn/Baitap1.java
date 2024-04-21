package btvn;

public class Baitap1 {
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 4;
        System.out.println(isPrime(a) ? a + " la so nguyen to" : a + " khong la so nguyen to");
        System.out.println(isOdd(b) ? b + " la so le" : b + " khong la so le");
    }
}
