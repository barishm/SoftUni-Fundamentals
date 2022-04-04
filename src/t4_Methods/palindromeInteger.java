package t4_Methods;

import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

public class palindromeInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String reversed = "";
        while(!line.equals("END")){


            for (int i = line.length() -1; i >= 0; i--) {
                reversed += line.charAt(i);


            }
            if(line.equals(reversed)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
            line = scan.nextLine();
            reversed = "";


        }
    }
}

        


