package reviewWeek29_01_05_02_2023;

import java.util.Scanner;

public class day13_String_task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a how is weatehr todey");
        String sentence=input.nextLine();

        System.out.println(sentence.charAt(0)+"."+sentence.charAt(sentence.length()-1));
input.close();
    }
}
