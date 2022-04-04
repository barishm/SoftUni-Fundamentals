package t4_Methods;

import java.util.Scanner;

public class topNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        printTopNumbers(n);
    }
    public static void printTopNumbers(int n){
        int digitSum = 0;
        int number = 0;
        int digit = 0;
        boolean odd = false;
        for (int i = 1; i <= n; i++) {
            odd = false;
            number = i;
            while (number > 0){
                digit = number % 10;
                if(digit % 2 != 0){
                    odd = true;
                }
                digitSum = digitSum + number % 10;
                number = number / 10;
            }
            if(digitSum % 8 == 0 && odd){
                System.out.println(i);
            }
            digit = 0;
            digitSum = 0;
        }
    }
}