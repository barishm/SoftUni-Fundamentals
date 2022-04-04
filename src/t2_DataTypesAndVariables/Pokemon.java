package t2_DataTypesAndVariables;

import java.util.Scanner;
public class Pokemon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());
        int M = Integer.parseInt(scan.nextLine());
        int Y = Integer.parseInt(scan.nextLine());
        double halfN = N * 0.50;
        int targets = 0;
        while (N >= M) {
            N -= M;
            targets++;
            if (N == halfN && Y != 0) {
                N /= Y;
            }
        }
        System.out.println(N);
        System.out.println(targets);
    }
}
