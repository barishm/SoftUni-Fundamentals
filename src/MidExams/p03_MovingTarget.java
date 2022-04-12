package MidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03_MovingTarget {
    public static void main(String[] args) {
        // it has bugs that didn't fixed yet.
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split(" ");
            String command = data[0];
            switch (command) {
                case "Shoot" -> {
                    int indexToShoot = Integer.parseInt(data[1]);
                    int power = Integer.parseInt(data[2]);
                    int target = numbers.get(indexToShoot);
                    numbers.remove(indexToShoot);
                    target -= power;
                    if (target > 0) {
                        numbers.add(indexToShoot, target);
                    }
                }
                case "Add" -> {
                    int indexToAdd = Integer.parseInt(data[1]);
                    int value = Integer.parseInt(data[2]);
                    if (indexToAdd < numbers.size() && indexToAdd >= 0) {
                        numbers.add(indexToAdd, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                }
                case "Strike" -> {
                    int indexToStrike = Integer.parseInt(data[1]);
                    int radius = Integer.parseInt(data[2]);
                    int startIndex = indexToStrike - radius;
                    int endIndex = indexToStrike + radius;
                    if (startIndex >= 0 && endIndex < numbers.size()) {
                        if (endIndex >= startIndex) {
                            numbers.subList(startIndex, endIndex + 1).clear();
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                }
            }
            input = scan.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if(numbers.size()-1 != i){
                System.out.print("|");
            }
        }
    }
}
