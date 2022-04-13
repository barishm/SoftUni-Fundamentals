package MidExams;

import java.util.Scanner;

public class p01_BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scan.nextLine());
        int numberOfLectures = Integer.parseInt(scan.nextLine());
        int bonus = Integer.parseInt(scan.nextLine());
        int totalBonus = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            totalBonus = bonus / numberOfLectures *(5+bonus);


        }


    }
}
