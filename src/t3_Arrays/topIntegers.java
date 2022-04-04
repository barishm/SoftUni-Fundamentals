package t3_Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class topIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1 + i; j < numbers.length; j++) {
                if(numbers[i] <= numbers[j]){
                    break;
                }
                if(numbers.length - 1 == j){
                    System.out.print(numbers[i] + " ");
                }
            }
        }
        System.out.print(numbers[numbers.length-1]);
    }
}
