package t2_DataTypesAndVariables;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String line;
        boolean isBalanced = true;
        boolean openBracketTurn = true;
        boolean bracketClosed = false;
        for (int i = 1; i <= n; i++) {
            line = scan.nextLine();

            if (line.equals("(")) {
                if (openBracketTurn) {
                    openBracketTurn = false;
                } else {
                    isBalanced = false;
                }
                bracketClosed = false;
            }
            if (line.equals(")")) {
                if(!openBracketTurn){
                    openBracketTurn = true;
                    bracketClosed = true;
                }else{
                    isBalanced = false;
                }

            }

        }
        if (bracketClosed && isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
