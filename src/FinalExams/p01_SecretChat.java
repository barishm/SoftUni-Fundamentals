package FinalExams;

import java.util.Scanner;

public class p01_SecretChat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scan.nextLine());
        String input = scan.nextLine();
        while (!input.equals("Reveal")) {
            String[] data = input.split(":\\|:");
            String command = data[0];
            switch (command) {
                case "InsertSpace" -> {
                    int index = Integer.parseInt(data[1]);
                    sb.insert(index, " ");
                }
                case "Reverse" -> {
                    StringBuilder substring = new StringBuilder(data[1]);
                    if (sb.toString().contains(substring)) {
                        int start = sb.indexOf(substring.toString());
                        int end = start + substring.length() - 1;
                        sb.delete(start, end + 1);
                        substring.reverse();
                        sb.append(substring);
                    } else {
                        System.out.println("error");
                        input = scan.nextLine();
                        continue;
                    }
                }
                case "ChangeAll" -> {
                    String occurrence = data[1];
                    String replacement = data[2];
                    String replacementString = sb.toString().replaceAll(occurrence, replacement);
                    sb.setLength(0);
                    sb.append(replacementString);
                }
            }
            System.out.println(sb);
            input = scan.nextLine();
        }

        System.out.printf("You have a new text message: %s", sb);
    }
}
