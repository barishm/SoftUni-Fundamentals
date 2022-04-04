package t4_Methods;

import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass = scan.nextLine();
        isPassValid(pass);
    }
    public static void isPassValid(String pass){
        short digitCount = 0;
        boolean validLength = true;
        boolean onlyLettersAndDigits = true;
        if (pass.length() < 6 || pass.length() > 10) {
            validLength = false;
        }
        for (int i = 0; i < pass.length(); i++) {
            char sym = pass.charAt(i);
            if ((sym <= 47 || sym >= 58) && (sym <= 64 || sym >= 91) && (sym <= 96 || sym >= 123)) {
                onlyLettersAndDigits = false;
            }
            if(sym > 47 && sym < 58){
                digitCount++;
            }
        }
        if (!validLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(!onlyLettersAndDigits){
            System.out.println("Password must consist only of letters and digits");
        }
        if(digitCount < 2){
            System.out.println("Password must have at least 2 digits");
        }
        if(validLength && onlyLettersAndDigits && digitCount > 1){
            System.out.println("Password is valid");
        }
    }
}
