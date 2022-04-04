package t1_BasicSyntax_ConditStat_Loops;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());
        String person = sc.nextLine();
        String day = sc.nextLine();
        double totalSum = 0;

        switch (person) {
            case "Students":
                switch (day) {
                    case "Friday" -> totalSum = people * 8.45;
                    case "Saturday" -> totalSum = people * 9.80;
                    case "Sunday" -> totalSum = people * 10.46;
                }
                if (people >= 30) {
                    totalSum = totalSum - totalSum * 0.15;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        totalSum = people * 10.90;
                        if (people >= 100) {
                            totalSum = totalSum - 10 * 10.90;
                        }
                        break;
                    case "Saturday":
                        totalSum = people * 15.60;
                        if (people >= 100) {
                            totalSum = totalSum - 10 * 15.60;
                        }
                        break;
                    case "Sunday":
                        totalSum = people * 16;
                        if (people >= 100) {
                            totalSum = totalSum - 10 * 16;
                        }
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        totalSum = people * 15;
                        break;
                    case "Saturday":
                        totalSum = people * 20;
                        break;
                    case "Sunday":
                        totalSum = people * 22.50;
                        break;
                }
                if (people >= 10 && people <= 20) {
                    totalSum = totalSum - totalSum * 0.05;
                }
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + person);
        }
        System.out.printf("Total price: %.2f", totalSum);
    }

}
