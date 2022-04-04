package t1_BasicSyntax_ConditStat_Loops;

import java.util.Scanner;
public class rageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lostGames = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());
        int headsetTrash = lostGames / 2;
        int mouseTrash = lostGames / 3;
        int keyboardTrash = lostGames / 6;
        int displayTrash = lostGames / 12;
        double total = headsetPrice * headsetTrash + mousePrice * mouseTrash + keyboardPrice * keyboardTrash + displayPrice * displayTrash;
        System.out.printf("Rage expenses: %.2f lv.",total);
    }
}
