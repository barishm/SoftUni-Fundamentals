package MidExams;

import java.util.Scanner;

public class p01_GuineaPig {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double food = Double.parseDouble(scan.nextLine());
        double hay = Double.parseDouble(scan.nextLine());
        double cover = Double.parseDouble(scan.nextLine());
        double guinea = Double.parseDouble(scan.nextLine());
        food = food * 1000;
        hay = hay * 1000;
        cover = cover * 1000;
        guinea = guinea * 1000;
        int days = 0;
        while (days < 30) {
                days++;
            food -= 300;
            if (days % 2 == 0) {
                hay = hay - food * 0.05;

            }
            if (days % 3 == 0) {
                cover = cover - guinea / 3;
            }
            if (hay <= 0 || food <= 0 || cover <= 0){
                System.out.println("Merry must go to the pet store!");
                return;
            }

        }
        food = food * 0.001;
        hay = hay * 0.001;
        cover = cover * 0.001;
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",food,hay,cover);

    }

}
