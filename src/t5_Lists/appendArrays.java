package t5_Lists;


import java.util.*;
import java.util.stream.Collectors;

public class appendArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> arrayOfStrings = Arrays.stream(sc.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(arrayOfStrings);
        List<String> appendedStrings = new ArrayList<>();
        for (String StringOfNumbers : arrayOfStrings) {
            if (!StringOfNumbers.trim().isEmpty()) {
                List<String> arrayOfNumbers = Arrays.stream(StringOfNumbers.trim().split("\\s+")).collect(Collectors.toList());
                appendedStrings.addAll(arrayOfNumbers);
            }
        }
        appendedStrings.forEach(el -> System.out.print(el + " "));
    }
}
