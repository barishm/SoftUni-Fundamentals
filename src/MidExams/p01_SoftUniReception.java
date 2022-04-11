package MidExams;

import java.util.Scanner;

public class p01_SoftUniReception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = 0;
        int timeNeeded = 0;
        int stdPerHour = Integer.parseInt(scan.nextLine());
        stdPerHour += Integer.parseInt(scan.nextLine());
        stdPerHour += Integer.parseInt(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());

        while(students > 0){

            hours++;

            if(hours % 4 != 0){
                students = students - stdPerHour;
            }

        }
        System.out.printf("Time needed: %dh.",hours);
    }
}
