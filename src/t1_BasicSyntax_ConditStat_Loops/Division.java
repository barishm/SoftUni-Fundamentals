package t1_BasicSyntax_ConditStat_Loops;

import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integer = Integer.parseInt(sc.nextLine());
        if (integer % 10 == 0){
            System.out.println("The number is divisible by 10");
        }
        else if(integer % 7 == 0){
            System.out.println("The number is divisible by 7");
        }
        else if(integer % 6 == 0){
            System.out.println("The number is divisible by 6");
        }
        else if(integer % 3 == 0){
            System.out.println("The number is divisible by 3");
        }
        else if(integer % 2 == 0){
            System.out.println("The number is divisible by 2");
        }
        else{
            System.out.println("Not divisible");
        }
    }
}
