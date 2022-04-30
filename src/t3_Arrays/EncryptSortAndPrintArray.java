package t3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] seq = new String[n];
        int[] numbers = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            seq[i] = scan.nextLine();
            sum = 0;
            for (int j = 0; j < seq[i].length(); j++) {
                char ch = seq[i].charAt(j);
                if(ch == 65 || ch == 69 || ch == 73 || ch ==79 || ch == 85 ||
                ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch == 117){
                    sum += ch * seq[i].length();
                }else{
                    sum += ch / seq[i].length();
                }
            }
            numbers[i] = sum;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
