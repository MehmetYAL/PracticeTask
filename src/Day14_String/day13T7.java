package Day14_String;

import java.util.Scanner;

public class day13T7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write a first word");
        String w1=input.next();
        System.out.println("write a second word");
        String w2= input.next();
        System.out.println("write a third word");
        String w3= input.next();
        input.close();
        if (w1.length()==w2.length()&&w2.length()==w3.length()){
            System.out.println("all words are same length");
        } else if (w1.length()==w2.length()&&w2.length()!=w3.length()) {
            System.out.println("not same nor different lenghths");
        } else {
            System.out.println( "all different lenght");
        }
input.close();

        /*Write a program  for CheckWords, the program accepts 3 words and :
- if they are same length:  print "All words are same length"
- if some same length and others not:    print "Not Same nor
Different lengths"
- if all different length :  print "All different length"*/
    }
}
