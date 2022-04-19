package t1_BasicSyntax_ConditStat_Loops;

import java.util.Scanner;
public class Message {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder message = new StringBuilder();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String typing = scan.nextLine();
            if(typing.equals("0")){
                message.append(" ");
            }else{
                int numberOfDigits = typing.length();
                int mainDigit = Integer.parseInt(typing) % 10;
                int offset = (mainDigit - 2) * 3;
                if(mainDigit == 8 || mainDigit == 9){
                    offset++;
                }
                int letterIndex = offset + numberOfDigits -1;
                letterIndex += 97;
                char c = (char)letterIndex;
                message.append(c);
            }
        }
        System.out.println(message);
    }
}
