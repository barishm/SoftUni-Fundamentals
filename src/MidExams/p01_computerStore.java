package MidExams;

import java.util.Scanner;

public class p01_computerStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        double price = 0;
        double taxes = 0;


        String input = scan.nextLine();
        while(!input.equals("special") && !input.equals("regular")){
            price = Double.parseDouble(input);

            if(price > 0) {
                sum += price;
            }else{
                System.out.println("Invalid price!");
            }
            input = scan.nextLine();
        }

        taxes = sum * 0.2;

        if(sum > 0) {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sum);
            System.out.printf("Taxes: %.2f$%n", taxes);
            sum = sum + taxes;
            if(input.equals("special")){
                sum = sum - sum * 0.1;
            }
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n", sum);
        }else{
            System.out.println("Invalid order!");
        }
    }
}
