package t3_Arrays;

import java.util.Scanner;
public class commonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] text1 = scan.nextLine().split("\\s+");
        String[] text2 = scan.nextLine().split("\\s+");
        for (int i = 0; i < text2.length; i++) {
            for (int j = 0; j < text1.length; j++) {
                if(text2[i].equals(text1[j])){
                    System.out.print(text1[j] + " ");
                }
            }
        }

    }
}
