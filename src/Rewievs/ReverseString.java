package Rewievs;

public class ReverseString {
    public static void main(String[] args) {
        String str="Wooden Spoon";
        String reverse="";
        for (int i =str.length()-1; i >=0 ; i--) {
            char ch=str.charAt(i);
            reverse+=ch;
        }
        System.out.println("reverse = " + reverse);
    }
}
/*
Write a program that can reverse any given string
			Ex:		input:
					Wooden Spoon
				output:
					noopS nedooW
 */