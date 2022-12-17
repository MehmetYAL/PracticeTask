package Day15_Loop;

import java.util.Scanner;

public class Day15_T8_palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter word.");
        String word= input.next();
        String palan="";
        for (int i = word.length()-1 ;i>=0; i--) {
            palan+=word.charAt(i);

        }boolean isPalandrome=word.equalsIgnoreCase(palan);
        System.out.println("isPalandrome = " + isPalandrome);
        System.out.println(palan);
        input.close();

        /*Write a program that can check if the given String is palindrome
Ex:
input:
Level
output:
true
input:
Anna
output:
true*/

    }
}
