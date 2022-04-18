package t3_Arrays;

import java.util.Scanner;
public class maxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] numbers = scan.nextLine().split(" ");
        String Longest = "";
        String Current;
        for (int i = 0; i < numbers.length; i++) {
            Current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i].equals(numbers[j])){
                    Current += " " + numbers[j];
                }
                else{
                    break;
                }
            }
            if(Current.length() > Longest.length()){
                Longest = Current;
            }
            Current = "";
        }
        System.out.println(Longest);
    }
}
