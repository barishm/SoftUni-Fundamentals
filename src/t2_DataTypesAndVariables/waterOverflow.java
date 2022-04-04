package t2_DataTypesAndVariables;

import java.util.Scanner;
public class waterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int tank = 0;
        for (int i = 0; i < n; i++) {
            int load = Integer.parseInt(scan.nextLine());
            if (tank + load > 255) {
                System.out.println("Insufficient capacity!");
                continue;
            }
            tank += load;
        }
        System.out.println(tank);
    }
}