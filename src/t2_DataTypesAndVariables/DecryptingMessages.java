package t2_DataTypesAndVariables;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int key = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = scan.nextLine().charAt(0);
            message.append(Character.toString(c + key));
        }
        System.out.println(message);
    }
}
