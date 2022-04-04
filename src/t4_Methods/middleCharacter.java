package t4_Methods;

import java.util.Scanner;

public class middleCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String text = scan.nextLine();
        midChar(text);

    }
    public static void midChar(String text){
        String mid = "";
        for (int i = 1; i <= text.length()/2+1; i++) {
            char sym = text.charAt(i-1);
            if(text.length() % 2 != 0 && i == text.length() / 2 + 1){
                mid += sym;
            }
            if(text.length() % 2 == 0 && i == text.length() / 2){
                mid += sym;
            }
            if(text.length() % 2 == 0 && i == text.length() / 2 + 1){
                mid += sym;
            }
        }
        System.out.println(mid);
    }
}
