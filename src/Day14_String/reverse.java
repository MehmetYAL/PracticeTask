package Day14_String;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a word");
        String word= input.next();
        String reverse="";
        if (word.length()==5){
          reverse+=word.charAt(4);
          reverse+=word.charAt(3);
          reverse+=word.charAt(2);
          reverse+=word.charAt(1);
          reverse+=word.charAt(0);


        }else if(word.length() > 5){
            reverse = "Too long!";
        }else{
            reverse = "Too short!";
        }
        System.out.println(reverse);
input.close();
    }
}
