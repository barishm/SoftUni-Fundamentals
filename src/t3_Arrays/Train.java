package t3_Arrays;

import java.util.Scanner;
public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] train = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            train[i] = Integer.parseInt(scan.nextLine());
            sum += train[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(train[i] + " ");

        }
        System.out.printf("\n%d",sum);
    }
}
