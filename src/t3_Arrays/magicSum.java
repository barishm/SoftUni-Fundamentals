package t3_Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class magicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int number = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == number){
                    System.out.print(numbers[i] + " " + numbers[j]);
                    System.out.println();
                }
            }
        }
    }
}