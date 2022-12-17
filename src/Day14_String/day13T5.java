package Day14_String;

import java.util.Scanner;

public class day13T5 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter a sentence");
        String str= input.nextLine();
        input.close();
        int lenght=str.length();
        String result="";
        if (lenght==0){
            result="empty";
        } else if (lenght>3) {int lastIndex=str.length()-1;
            result=""+str.charAt(lenght-3)+str.charAt(lenght-2)+str.charAt(lenght-1);

        } else{ result=str;}
        System.out.println(result);

            /*Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three
                characters
        if the string has less than or equal 3 characters, print the
        string itself*/
input.close();
    }

}
