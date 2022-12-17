package Practice_rondom;

import java.util.Arrays;

public class T2 {
    public static void main(String[] args) {
        String[][] items = { {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        for (String[] item : items) {
            for (String str : item) {
                System.out.print(str+"\t");

            }
            System.out.println();

        }

    }
}/*1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water
*/
