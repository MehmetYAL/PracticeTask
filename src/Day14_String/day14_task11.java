package Day14_String;

import java.util.Scanner;

public class day14_task11 {
    public static void main(String[] args) {
        /*
        Ask user to enter two words. Print first word without its first
character then print the second word without its first character.
Input:
apple
banana
Output:
ppleanana
         */
        Scanner input=new Scanner(System.in);
        System.out.println("enter a word");
        String word=input.next();
        word=word.substring(1);
        System.out.println(word);
        System.out.println("enter second word");
        String word2=input.next();
        word2=word2.substring(1);

        System.out.println(word2);

        System.out.println(word+word2);

input.close();




    }

}
