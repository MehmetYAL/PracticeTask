package Day15_Loop;

import java.util.SplittableRandom;

public class Day15_T5_RetiveADigit {
    public static void main(String[] args) {
        String str="ABCD123#$@!";

        String digits="";
        String spec="";
        String let="";

        for (int i =0; i<str.length();i++){
            char ch=str.charAt(i);
            if (ch>'0'&&ch<='9'){
            digits=digits+ch;}
            else if (ch>='A'&&ch<='Z') {
                let+=ch;
            } else if (ch>='a'&&ch<='z') {
                let+=ch;

            }else {
                if (ch!=' '){spec+=ch;

                }
            }
            System.out.println("let = " + let);
            System.out.println("spec = " + spec);
            System.out.println("digits = " + digits);
        }



        /*  write a program that can retive the digits, letters and special
characters from a string
Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!
         */
    }
}
