package MidExams;

import java.util.Arrays;
import java.util.Scanner;

public class p02_shootForTheWin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] targets = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scan.nextLine();
        int shotTargets = 0;
        while(!input.equals("End")){

            int index = Integer.parseInt(input);
            if(index >= targets.length || index < 0){
                input = scan.nextLine();
                continue;
            }

            int targetValue = targets[index];
            shotTargets++;
            targets[index] = -1;

            for (int i = 0; i < targets.length; i++) {
                if(i == index){
                    continue;
                }
                if(targetValue < targets[i] && targets[i] != -1){
                    targets[i] -= targetValue;
                }else if(targetValue >= targets[i] && targets[i] != -1){
                    targets[i] += targetValue;
                }
            }

            input = scan.nextLine();

        }
        System.out.print("Shot targets: "+shotTargets+" -> ");
        for (int target : targets) {
            System.out.print(target + " ");
        }
    }
}
