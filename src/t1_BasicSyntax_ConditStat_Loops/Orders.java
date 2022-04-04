package t1_BasicSyntax_ConditStat_Loops;

import java.util.Scanner;
public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double total = 0;
        for (int i = 0; i < n; i++) {
            double pricePerCaps = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int capsCount = Integer.parseInt(scan.nextLine());
            double orderPrice = ((days * capsCount)* pricePerCaps);
            System.out.printf("The price for the coffee is: $%.2f\n", orderPrice);
            total += orderPrice;
        }
        System.out.printf("Total: $%.2f",total);
    }
}
