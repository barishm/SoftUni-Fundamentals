package t4_Methods;

import java.util.Scanner;

public class MatrixNxN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matrix = Integer.parseInt(scan.nextLine());
        printMatrix(matrix);

    }
    public static void printMatrix(int matrix){
        for (int i = 0; i < matrix; i++) {
            for (int j = 0; j < matrix; j++) {
                System.out.print(matrix + " ");
            }
            System.out.println();
        }
    }
}
