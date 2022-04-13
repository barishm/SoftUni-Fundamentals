package MidExams;

import java.util.*;
import java.util.stream.Collectors;


public class p02_ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> products = Arrays.stream(scan.nextLine().split("!")).collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("Go Shopping!")){
            String[] data = input.split("\\s+");
            String command = data[0];

            switch (command){
                case "Urgent":
                    String item = data[1];
                    if(!products.contains(item)){
                        products.add(0,item);
                    }
                    break;
                case "Unnecessary":
                    item = data[1];
                    if(products.contains(item)){
                        products.remove(item);
                    }
                    break;
                case "Correct":
                    String oldItem = data[1];
                    String newItem = data[2];
                    if(products.contains(oldItem)){
                        int index = products.indexOf(oldItem);
                        products.add(index,newItem);
                        products.remove(oldItem);
                    }
                    break;
                case "Rearrange":
                    item = data[1];
                    if(products.contains(item)){
                        products.remove(item);
                        products.add(products.size(), item);
                    }
                    break;
            }
            input = scan.nextLine();
        }
        for (int i = 0; i < products.size(); i++) {
            System.out.print(products.get(i));
            if(i < products.size()-1){
                System.out.print(", ");
            }

        }
    }
}
