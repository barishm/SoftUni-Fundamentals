package t1_BasicSyntax_ConditStat_Loops;

import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        String password = "";
        int count = 0;
        for (int i = user.length() - 1; i >= 0 ; i--) {
            password += user.charAt(i);
        }

        while (true) {
            String input = scan.nextLine();
            count++;
            if(input.equals(password)){
                System.out.printf("User %s logged in.",user);
                break;
            }
            else {
                if(count == 4){
                    System.out.printf("User %s blocked!",user);
                    break;
                }
                System.out.println("Incorrect password. Try again.");
            }

        }
    }
}
