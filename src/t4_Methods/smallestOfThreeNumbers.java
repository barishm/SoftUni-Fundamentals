package t4_Methods;

import java.util.Arrays;
import java.util.Scanner;
public class smallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        int smallestNum = getSmallestNum(num1,num2,num3);
        System.out.println(smallestNum);
    }
    public static int getSmallestNum (int num1,int num2,int num3){
        int[] numbers = {num1,num2,num3};
        Arrays.sort(numbers);
        return numbers[0];
    }
}
