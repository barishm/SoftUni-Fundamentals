package t4_Methods;

import java.util.Scanner;

public class addAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        int result = sum(num1,num2);
        result = subtract(num3,result);
        System.out.println(result);

    }
    public static int sum(int num1,int num2){
         num1 += num2;
         return num1;
    }
    public static int subtract(int num3,int result){
        result -= num3;
        return result;
    }
}
