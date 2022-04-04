package t1_BasicSyntax_ConditStat_Loops;

import java.util.Scanner;
public class printAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
            System.out.print(i + " ");
        }
        System.out.printf("\nSum: %d", sum);
    }
}
