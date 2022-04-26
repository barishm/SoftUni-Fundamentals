package t2_DataTypesAndVariables;

import java.util.Arrays;
import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int leftSum = 0;
        int rightSum = 0;
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            long[] numbers = Arrays
                    .stream(scan.nextLine().split("\\s+"))
                    .mapToLong(Long::parseLong)
                    .toArray();
            long leftNumber = numbers[0];
            long rightNumber = numbers[1];
            if(leftNumber > rightNumber){
                while (leftNumber != 0){
                    leftSum += leftNumber % 10;
                    leftNumber = leftNumber / 10;
                }
                System.out.println(Math.abs(leftSum));
            }else{
                while(rightNumber != 0){
                    rightSum += rightNumber % 10;
                    rightNumber = rightNumber / 10;
                }
                System.out.println(Math.abs(rightSum));
            }
            leftSum = 0;
            rightSum = 0;
        }
    }
}
