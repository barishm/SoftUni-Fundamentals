package t3_Arrays;

import java.util.Scanner;
public class commonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] text1 = scan.nextLine().split("\\s+");
        String[] text2 = scan.nextLine().split("\\s+");
        for (String s : text2) {
            for (String value : text1) {
                if (s.equals(value)) {
                    System.out.print(value + " ");
                }
            }
        }
    }
}
