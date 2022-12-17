package Practice_rondom;

import java.util.Scanner;

public class firstIndexOfCharacter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string!");
        String word = scanner.next();
        String res = "";

        for (int i = 0; i < word.length(); i++) {

            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(word.indexOf(word.charAt(i) + ""));
                break;
            }
        }
    }
}