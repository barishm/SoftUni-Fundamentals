package MidExams;

import java.util.Arrays;
import java.util.Scanner;


public class p02_theLift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = Integer.parseInt(scan.nextLine());
        boolean notEmpty = false;
        int[] wagons = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println();
        for (int i = 0; i < wagons.length; i++) {

            if (wagons[i] == 0 && people > 0) {
                if (people == 1) {
                    wagons[i] += 1;
                    people -= 1;
                }
                else if (people == 2) {
                    wagons[i] += 2;
                    people -= 2;
                }
                else if (people == 3) {
                    wagons[i] += 3;
                    people -= 3;
                }
                else {
                    wagons[i] += 4;
                    people -= 4;
                }
            }
            else if (wagons[i] == 1 && people > 0) {
                if (people == 1) {
                    wagons[i] += 1;
                    people -= 1;
                }
                else if (people == 2) {
                    wagons[i] += 2;
                    people -= 2;
                }
                else {
                    wagons[i] += 3;
                    people -= 3;
                }
            }
            else if (wagons[i] == 2 && people > 0) {
                if (people == 1) {
                    wagons[i] += 1;
                    people -= 1;
                }
                else {
                    wagons[i] += 2;
                    people -= 2;
                }
            }
            else if (wagons[i] == 3 && people > 0) {
                    wagons[i] += 1;
                    people -= 1;
            }

        }
        for (int j : wagons) {
            if (j != 4) {
                notEmpty = true;
                break;
            }
        }
        if(people > 0){
            System.out.printf("There isn't enough space! %d people in a queue!%n",people);
            for (int wagon : wagons) {
                System.out.print(wagon + " ");
            }
        }else {
            if(notEmpty){
            System.out.println("The lift has empty spots!");
            }
            for (int wagon : wagons) {
                System.out.print(wagon + " ");
            }
        }
    }
}
