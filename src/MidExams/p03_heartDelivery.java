package MidExams;

import java.util.Arrays;
import java.util.Scanner;

public class p03_heartDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] places = Arrays
                .stream(scan.nextLine().split("@"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int currentPlace = 0;
        int failedPlaces = 0;
        String input = scan.nextLine();
        while (!input.equals("Love!")) {

            String[] data = input.split(" ");

            if (data[0].equals("Jump")) {
                int range = Integer.parseInt(data[1]);
                if (range + currentPlace >= places.length || range < 0) {
                    currentPlace = 0;
                }else{
                    currentPlace = currentPlace + range;
                }
                if(places[currentPlace] != 0){
                    places[currentPlace] -= 2;
                    if(places[currentPlace] == 0){
                        System.out.printf("Place %d has Valentine's day.%n",currentPlace);
                    }
                }
                else {
                    System.out.printf("Place %d already had Valentine's day.%n", currentPlace);

                }
            }
            input = scan.nextLine();

        }
        System.out.println("Cupid's last position was " + currentPlace + ".");
        for (int place : places) {
            if (place != 0) {
                failedPlaces++;
            }
        }
        if (failedPlaces > 0) {
            System.out.printf("Cupid has failed %d places.%n", failedPlaces);
        } else {
            System.out.println("Mission was successful.");
        }

    }
}
