package MidExams;

import java.util.Scanner;

public class p01_BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        int students = Integer.parseInt(scan.nextLine());
        int lectures = Integer.parseInt(scan.nextLine());
        int additionalBonus = Integer.parseInt(scan.nextLine());
        double attendedCount = 0;
        double attendance;
        double maxBonus = 0;
        double bonus;
        for (int i = 0; i < students; i++) {
            attendance = Integer.parseInt(scan.nextLine());
            bonus = attendance / lectures * (5+additionalBonus);
            if(bonus > maxBonus){
                maxBonus = bonus;
                attendedCount = attendance;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n",Math.ceil(maxBonus));
        System.out.printf("The student has attended %.0f lectures.",attendedCount);
    }
}
