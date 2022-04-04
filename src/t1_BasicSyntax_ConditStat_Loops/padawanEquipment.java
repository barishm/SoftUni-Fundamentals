package t1_BasicSyntax_ConditStat_Loops;

import java.util.Scanner;
public class padawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        double saber = Double.parseDouble(scan.nextLine());
        double robes = Double.parseDouble(scan.nextLine());
        double belts = Double.parseDouble(scan.nextLine());
        double saberCount = Math.ceil(students * 1.10);
        int beltsCount = students - students /6;
        double sum = saberCount * saber + robes * students + belts * beltsCount;
        if(sum <= money){
            System.out.printf("The money is enough - it would cost %.2flv.",sum);
        }
        else{
            System.out.printf("George Lucas will need %.2flv more.", sum - money);
        }
    }
}
