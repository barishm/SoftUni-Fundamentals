package t4_Methods;

import java.util.Scanner;

public class charactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch1 = scan.next().charAt(0);
        char ch2 = scan.next().charAt(0);
        char ch = ' ';
        printChars(ch1,ch2);
    }
    public static void printChars(char ch1,char ch2){
        if(ch2 < ch1){
            char chh = ch1;
            ch1 = ch2;
            ch2 = chh;
        }
        for (int i = ch1+1; i < ch2; i++) {
            char ch = ' ';
            ch1++;
            ch = ch1;
            System.out.print(ch+" ");
        }
    }
}
