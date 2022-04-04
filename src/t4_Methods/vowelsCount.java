package t4_Methods;

import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        printVowelsCount(text);
    }
    public static void printVowelsCount(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char sym = text.toLowerCase().charAt(i);
            if(sym == 97 || sym == 101 || sym == 105
                    || sym == 111|| sym==117||sym==121){
                count++;
            }
        }
        System.out.println(count);
    }

}
