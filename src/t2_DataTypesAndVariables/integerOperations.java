package t2_DataTypesAndVariables;

import java.util.Scanner;
public class integerOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());
        int fourth = Integer.parseInt(scan.nextLine());
        int sum = ((first + second) / third) * fourth;
        System.out.println(sum);

    }
}
