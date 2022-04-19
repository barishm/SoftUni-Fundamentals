package t1_BasicSyntax_ConditStat_Loops;

import java.util.Scanner;
public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        printEnglishName(number);

    }
    private static void printEnglishName(int number) {
        String englishName = null;
        if(number % 10 == 0) {
            englishName = "zero";
        }else if(number % 10 == 1){
            englishName = "one";
        }else if(number % 10 == 2){
            englishName = "two";
        }else if(number % 10 == 3){
            englishName = "three";
        }else if(number % 10 == 4){
            englishName = "four";
        }else if(number % 10 == 5){
            englishName = "five";
        }else if(number % 10 == 6){
            englishName = "six";
        }else if(number % 10 == 7){
            englishName = "seven";
        }else if(number % 10 == 8){
            englishName = "eight";
        }else if(number % 10 == 9){
            englishName = "nine";
        }
        System.out.println(englishName);
    }
}
