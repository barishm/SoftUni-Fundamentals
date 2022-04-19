package t1_BasicSyntax_ConditStat_Loops;

import java.util.Scanner;
public class GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = Double.parseDouble(scan.nextLine());
        double totalSpend = balance;
        String input = scan.nextLine();
        while (!input.equals("Game Time")) {
            switch (input) {
                case "OutFall 4":
                    if (balance < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 39.99;
                        System.out.println("Bought OutFall 4");
                    }
                    break;
                case "CS: OG":
                    if (balance < 15.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 15.99;
                        System.out.println("Bought CS: OG");
                    }
                    break;
                case "Zplinter Zell":
                    if (balance < 19.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 19.99;
                        System.out.println("Bought Zplinter Zell");
                    }
                    break;
                case "Honored 2":
                    if (balance < 59.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 59.99;
                        System.out.println("Bought Honored 2");
                    }
                    break;
                case "RoverWatch":
                    if (balance < 29.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 29.99;
                        System.out.println("Bought RoverWatch");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (balance < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if(balance <= 0){
                System.out.println("Out of money!");
                return;
            }
            input = scan.nextLine();
        }
        totalSpend = totalSpend - balance;
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",totalSpend,balance);
    }
}
