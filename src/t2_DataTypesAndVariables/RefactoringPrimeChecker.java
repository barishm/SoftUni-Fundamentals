package t2_DataTypesAndVariables;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int range = Integer.parseInt(scan.nextLine());
        for (int num = 2; num <= range; num++) {
            boolean isPrime = true;
            for (int checker = 2; checker < num; checker++) {
                if (num % checker == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", num, isPrime);
        }
    }
}
