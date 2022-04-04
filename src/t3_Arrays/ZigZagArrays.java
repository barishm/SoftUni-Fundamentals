package t3_Arrays;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] array1 = new String[n];
        String[] array2 = new String[n];
        for (int i = 1; i <= n; i++) {
            String[] line = scan.nextLine().split(" ");
            if (i % 2 != 0) {
                array1[i - 1] = line[0];
                array2[i - 1] = line[1];
            } else {
                array2[i - 1] = line[0];
                array1[i - 1] = line[1];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}