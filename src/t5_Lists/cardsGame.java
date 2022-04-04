package t5_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class cardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> playerOne = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> playerTwo = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (playerOne.size() != 0 && playerTwo.size() != 0) {
            if (playerOne.get(0) > playerTwo.get(0)) {
                playerOne.add(playerOne.get(0));
                playerOne.add(playerTwo.get(0));
                playerOne.remove(playerOne.get(0));
                playerTwo.remove(playerTwo.get(0));
            } else if (playerOne.get(0) < playerTwo.get(0)) {
                playerTwo.add(playerTwo.get(0));
                playerTwo.add(playerOne.get(0));
                playerTwo.remove(playerTwo.get(0));
                playerOne.remove(playerOne.get(0));
            } else {
                playerTwo.remove(playerTwo.get(0));
                playerOne.remove(playerOne.get(0));
            }
        }
        if (playerOne.size() == 0) {
            int sum = playerTwo.stream().mapToInt(Integer::intValue).sum();
            System.out.print("Second player wins!");
            System.out.printf(" Sum: %d", sum);
        } else {
            int sum = playerOne.stream().mapToInt(Integer::intValue).sum();
            System.out.print("First player wins!");
            System.out.printf(" Sum: %d", sum);
        }
    }
}
