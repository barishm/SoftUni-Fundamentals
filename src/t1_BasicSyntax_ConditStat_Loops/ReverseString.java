package t1_BasicSyntax_ConditStat_Loops;

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scan.nextLine());
        sb.reverse();
        System.out.println(sb);
    }
}
