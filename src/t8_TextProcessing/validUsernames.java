package t8_TextProcessing;

import java.util.Arrays;
import java.util.Scanner;

public class validUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(", ")).filter(validUsernames::isValid).forEach(System.out::println);

    }

    static boolean isValid(String username) {
        return username.matches("[a-zA-Z0-9\\-_]{3,16}");
    }

}
