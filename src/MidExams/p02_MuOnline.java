package MidExams;

import java.util.Scanner;

public class p02_MuOnline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] dungeon = scan.nextLine().split("\\|");
        int health = 100;
        int bitcoins = 0;
        int bestRoom = 0;
        for (String s : dungeon) {
            bestRoom++;
            String[] room = s.split(" ");
            if (room[0].equals("potion")) {
                int heal = Integer.parseInt(room[1]);
                health += heal;
                if (health > 100) {
                    System.out.printf("You healed for %d hp.%n", Math.abs(health - 100 - heal));
                    health = 100;
                } else {
                    System.out.printf("You healed for %d hp.%n", heal);
                }
                System.out.printf("Current health: %d hp.%n", health);
            } else if (room[0].equals("chest")) {
                bitcoins += Integer.parseInt(room[1]);
                System.out.printf("You found %d bitcoins.%n", Integer.parseInt(room[1]));
            } else {
                health -= Integer.parseInt(room[1]);
                if (health <= 0) {
                    System.out.printf("You died! Killed by %s.%n", room[0]);
                    System.out.println("Best room: " + bestRoom);
                    return;
                } else {
                    System.out.printf("You slayed %s.%n", room[0]);
                }
            }
        }
        System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d",bitcoins,health);
    }
}
