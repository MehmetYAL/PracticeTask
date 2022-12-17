package Day14_String;

import java.util.Scanner;

public class Day14_task2 {
    public static void main(String[] args) {
        /*       2. ask the user to enter a word. if the word ends with "ly", print
"really???" ,  otherwise, print "never mind"    */
        Scanner input=new Scanner(System.in);
        System.out.println("enter a word");
        String word=input.next();
        String Last2=word.substring(word.length()-2);

        if (Last2.equals("ly")){
            System.out.println("really????????");
        }else {
            System.out.println("never mind");
        }
        input.close();
    }
}
