package MidExams;

import java.util.Arrays;
import java.util.Scanner;

public class p02_ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] numbers = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = scan.nextLine();
        while(!input.equals("end")){
            String[] data = input.split(" ");
            String command = data[0];

            switch (command) {
                case "swap":
                    int indexOne = Integer.parseInt(data[1]);
                    int indexTwo = Integer.parseInt(data[2]);
                    int n = numbers[indexOne];
                    numbers[indexOne] = numbers[indexTwo];
                    numbers[indexTwo] = n;
                    break;
                case "multiply":
                    indexOne = Integer.parseInt(data[1]);
                    indexTwo = Integer.parseInt(data[2]);
                    n = numbers[indexOne] * numbers[indexTwo];
                    numbers[indexOne] = n;
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] - 1;
                    }
                    break;
            }
            input = scan.nextLine();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d", numbers[i]);
            if(i < numbers.length-1){
                System.out.print(", ");
            }
        }
    }
}
