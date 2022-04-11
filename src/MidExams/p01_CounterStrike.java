package MidExams;

import java.util.Scanner;

public class p01_CounterStrike {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int energy = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int wonBattles = 0;
        while(!input.equals("End of battle")){
            int distance = Integer.parseInt(input);
            if(energy < distance){
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",wonBattles,energy);
                return;
            }
            energy -= distance;
            wonBattles++;
            if(wonBattles % 3 ==0){
                energy += wonBattles;

            }
            input = scan.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d",wonBattles,energy);
    }
}
