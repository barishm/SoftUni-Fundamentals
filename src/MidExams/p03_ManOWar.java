package MidExams;

import java.util.Arrays;
import java.util.Scanner;

public class p03_ManOWar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] pirateShip = Arrays
                .stream(scan.nextLine().split(">"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int [] warship = Arrays
                .stream(scan.nextLine().split(">"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxHealth = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        while(!input.equals("Retire")){
            String[] data = input.split(" ");
            switch(data[0]){
                case "Fire":
                    if(warship.length > Integer.parseInt(data[1]) && Integer.parseInt(data[1]) >= 0) {
                        warship[Integer.parseInt(data[1])] -= Integer.parseInt(data[2]);
                        if(warship[Integer.parseInt(data[1])] <= 0){
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);
                    if(startIndex >= 0 && startIndex < pirateShip.length && endIndex >= 0 && endIndex < pirateShip.length) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            pirateShip[i] -= Integer.parseInt(data[3]);
                            if (pirateShip[i] <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    }
                    break;
                case "Repair":
                    if(Integer.parseInt(data[1]) < pirateShip.length && Integer.parseInt(data[1]) >= 0) {
                        pirateShip[Integer.parseInt(data[1])] += Integer.parseInt(data[2]);
                        if (pirateShip[Integer.parseInt(data[1])] > maxHealth) {
                            pirateShip[Integer.parseInt(data[1])] = maxHealth;
                        }
                    }
                    break;
                case "Status":
                    int countSections = 0;
                    for (int j : pirateShip) {
                        if (j < maxHealth * 0.2) {
                            countSections++;
                        }
                    }
                    System.out.println(countSections + " sections need repair.");
                    break;
            }
            input = scan.nextLine();
        }
        int sum = 0;
        for (int j : pirateShip) {
            sum += j;
        }
        System.out.println("Pirate ship status: "+sum);
        sum = 0;
        for (int j : warship) {
            sum += j;
        }
        System.out.println("Warship status: "+sum);
    }
}
