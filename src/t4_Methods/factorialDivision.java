package t4_Methods;

import java.util.Scanner;

public class factorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num1 = Integer.parseInt(scan.nextLine());
        long num2 = Integer.parseInt(scan.nextLine());
        double fact1 = factOfNumber(num1);
        double fact2 = factOfNumber(num2);
        double result = fact1 / fact2;
        System.out.printf("%.2f",result);
    }
    public static long factOfNumber(long n){
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
