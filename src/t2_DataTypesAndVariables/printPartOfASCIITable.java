package t2_DataTypesAndVariables;

import java.util.Scanner;
public class printPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        for (int i = start; i <= end; i++) {
            System.out.printf("%c ",i);
        }
    }
}
