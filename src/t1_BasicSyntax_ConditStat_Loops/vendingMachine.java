package t1_BasicSyntax_ConditStat_Loops;

import java.util.Scanner;
public class vendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        while (true) {
            String input = scan.nextLine();
            if (input.equals("Start")) {
                break;
            }
            double money = Double.parseDouble(input);
            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2) {
                sum += money;
            } else {
                System.out.printf("Cannot accept %.2f\n", money);
            }
        }
        while (true) {
            String input = scan.nextLine();
            if(input.equals("End")){
                break;
            }
            if (input.equals("Nuts")) {
                if (sum >= 2) {
                    sum -= 2;
                    System.out.println("Purchased Nuts");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            else if(input.equals("Water")){
                if (sum >= 0.7) {
                    sum -= 0.7;
                    System.out.println("Purchased Water");
                } else {
                    System.out.println("Sorry, not enough money");
                }

            }
            else if(input.equals("Crisps")){
                if (sum >= 1.5) {
                    sum -= 1.5;
                    System.out.println("Purchased Crisps");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            else if(input.equals("Soda")){
                if (sum >= 0.8) {
                    sum -= 0.8;
                    System.out.println("Purchased Soda");
                } else {
                    System.out.println("Sorry, not enough money");
                }

            }
            else if(input.equals("Coke")){
                if (sum >= 1) {
                    sum -= 1;
                    System.out.println("Purchased Coke");
                } else {
                    System.out.println("Sorry, not enough money");
                }

            }
            else{
                System.out.println("Invalid product");
            }

        }
        System.out.printf("Change: %.2f", sum);

    }
}
