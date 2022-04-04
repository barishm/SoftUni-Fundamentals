package t3_Arrays;

import java.util.Scanner;
public class arrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(scan.nextLine());
        String[] rotation = new String[array.length];
        if(n > array.length){
            n = n - array.length;
        }
        for (int i = 0; i < array.length; i++) {
            if(i + n < array.length){
                rotation[i] = array[n + i];
            }
            else {
                rotation[i] = array[i - array.length + n];
            }
        }
        for (String s : rotation) {
            System.out.print(s + " ");
        }
    }
}
