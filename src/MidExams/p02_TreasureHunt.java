package MidExams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p02_TreasureHunt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> chest = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("Yohoho!")){
            String[] data = input.split(" ");
            switch(data[0]){
                case "Loot":
                    for (int i = 1; i < data.length; i++) {
                        if(!chest.contains(data[i])){
                        chest.add(0,data[i]);
                        }
                    }
                    break;
                case "Drop":
                    if(Integer.parseInt(data[1]) <= chest.size() && Integer.parseInt(data[1]) >= 0){
                        String loot = chest.get(Integer.parseInt(data[1]));
                        chest.remove(loot);
                        chest.add(loot);
                    }
                    break;
                case "Steal":
                    List<String> stolen = new ArrayList<>();
                    int startIndex = chest.size() - Integer.parseInt(data[1]);
                    int endIndex = chest.size()-1;
                    if(Integer.parseInt(data[1])> chest.size()){
                        startIndex = 0;
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        stolen.add(chest.get(i));
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        chest.remove(startIndex);
                    }
                    for (int i = 0; i < stolen.size(); i++) {
                        System.out.print(stolen.get(i));
                        if(stolen.size() - 1 > i){
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                    break;

            }
            input = scan.nextLine();
        }
        if(chest.isEmpty()){
            System.out.println("Failed treasure hunt.");
        }else{
            double avg = 0;
            double itemsLength = 0;
            for (int i = 0; i < chest.size(); i++) {
                String item = chest.get(i);
                itemsLength += item.length();
            }
            avg = itemsLength / chest.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.",avg);
        }
    }
}
