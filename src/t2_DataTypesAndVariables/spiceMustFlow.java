package t2_DataTypesAndVariables;

import java.util.Scanner;
public class spiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int spice = Integer.parseInt(scan.nextLine());
        int days = 0;
        int spiceMined = 0;

        if (spice >= 100) {

            for (int i = spice; i >= 100; i -= 10) {
                spiceMined += i;
                spiceMined -= 26;
                days++;
            }
            spiceMined -= 26;

            System.out.println(days);
            System.out.println(spiceMined);
        } else {
            System.out.println(days);
            System.out.println(spiceMined);
        }
    }
}
