package t1_BasicSyntax_ConditStat_Loops;

import java.util.Arrays;
import java.util.Scanner;
public class SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scan.nextLine());
        }
        Arrays.sort(numbers);
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
