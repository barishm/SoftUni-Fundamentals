package MidExams;

import java.util.List;
import java.util.Scanner;

public class p03_memoryGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> elements = new java.util.ArrayList<>(List.of(scan.nextLine().split(" ")));
        String input = scan.nextLine();
        int moves = 0;
        while (!input.equals("end")) {
            String[] data = input.split(" ");
            int index1 = Integer.parseInt(data[0]);
            int index2 = Integer.parseInt(data[1]);

            moves++;

            if (index1 == index2 || index1 >= elements.size() || index2 >= elements.size() || index1 < 0 || index2 < 0) {
                System.out.println("Invalid input! Adding additional elements to the board");
                elements.add(elements.size() / 2,"-"+ moves + "a");
                elements.add(elements.size() / 2,"-"+ moves + "a");
            } else if (elements.get(index1).equals(elements.get(index2))) {
                System.out.println("Congrats! You have found matching elements - " + elements.get(index1) + "!");
                if(index1 > index2){
                    elements.remove(index1);
                    elements.remove(index2);
                }else {
                    elements.remove(index2);
                    elements.remove(index1);
                }

            } else {
                System.out.println("Try again!");
            }
            if(elements.isEmpty()){
                System.out.println("You have won in " + moves + " turns!");
                break;
            }

            input = scan.nextLine();
        }
        if (!elements.isEmpty()) {
            System.out.println("Sorry you lose :(");
            elements.forEach(el -> System.out.print(el + " "));
        }
    }
}
