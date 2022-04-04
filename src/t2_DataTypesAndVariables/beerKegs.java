package t2_DataTypesAndVariables;

import java.util.Scanner;
public class beerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double biggestVolume = 0;
        String biggest = "";
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            double volume = Math.PI * (radius * radius) * height;
            if(volume > biggestVolume ){
                biggestVolume = volume;
                biggest = model;
            }
        }
        System.out.println(biggest);
    }
}