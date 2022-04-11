package MidExams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p03_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] numbers = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(numbers);

        List<Integer> greater = new ArrayList<>();
        double avg = 0;
        for (int number : numbers) {
            avg += number;
        }
        avg = avg / numbers.length;
        for (int i = numbers.length-1; i > 0; i--) {
            if(numbers[i] > avg){
                greater.add(numbers[i]);
                if(greater.size() == 5){
                    break;
                }
            }
            else{
                break;
            }
        }
        if(greater.isEmpty()){
            System.out.println("No");
        }else{
            for (Integer integer : greater) {
                System.out.print(integer + " ");

            }
        }
    }
}
