package t2_DataTypesAndVariables;

import java.util.Scanner;
public class Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double maxSnowBallValue = 0;
        int maxSnowBallSnow = 0;
        int maxSnowBallTime = 0;
        int maxSnowBallQuality = 0;

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());
            // (snowballSnow / snowballTime) ^ snowballQuality
            double currentSnowBallValue = Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (currentSnowBallValue > maxSnowBallValue) {
                maxSnowBallValue = currentSnowBallValue;
                maxSnowBallSnow = snowballSnow;
                maxSnowBallTime = snowballTime;
                maxSnowBallQuality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)"
                , maxSnowBallSnow, maxSnowBallTime, maxSnowBallValue, maxSnowBallQuality);
    }
}
