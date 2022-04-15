package MidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03_Inventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> items = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("Craft!")){
            String[] data = input.split(" - ");
            switch(data[0]){
                case "Collect":
                    if(!items.contains(data[1])){
                        items.add(data[1]);
                    }
                    break;
                case "Drop":
                    if(items.contains(data[1])){
                        items.remove(data[1]);
                    }
                    break;
                case "Combine Items":
                    String[] combineItems = data[1].split(":");
                    if(items.contains(combineItems[0])){
                        items.add(items.indexOf(combineItems[0])+1,combineItems[1]);
                    }
                    break;
                case "Renew":
                    if(items.contains(data[1])){
                        items.remove(items.indexOf(data[1]));
                        items.add(data[1]);
                    }
                    break;
            }
            input = scan.nextLine();
        }
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i));
            if(i < items.size()-1){
                System.out.print(", ");
            }

        }

    }
}
