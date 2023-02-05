package reviewWeek29_01_05_02_2023;

import javax.print.DocFlavor;

public class day13_withoutfirstCharacter {
    public static void main(String[] args) {
        String first="apple";
        String second="banana";

        System.out.println(first.substring(1) + second.substring(1));
        System.out.println("========================");
        String addOne="one";
        String addTwo="eight";
        if (addOne.charAt(addOne.length()-1)==addTwo.charAt(0)){
            System.out.println(addOne+addTwo.substring(1));
        }
        System.out.println("=====================================");
/*
Ex:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com
 */
        String email="mike_tyson@gmail.com";
        String firstname=email.substring(0,email.indexOf("_"));
        String secondName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domainName=email.substring(email.indexOf("@"));
        String underscore=email.substring(email.indexOf("_"),email.indexOf("_")+1);
        System.out.println(secondName+underscore+firstname+domainName);

        System.out.println("+++++++++++++++++++++++++++++++++++");

        /*
        Ex:
input:
craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
         */
String email1="craig_federighi@apple.com";
char firstNameI=email1.toUpperCase().charAt(0);
String firstNameRest=email1.substring(1,email1.indexOf("_"));
String lastIN=email1.toUpperCase().substring(email1.indexOf("_")+1,email1.indexOf("_")+2);
String lastNameI=email1.substring(email1.indexOf("_")+2,email1.indexOf("@"));
String domain=email1.substring(email1.indexOf("@")+1,email1.indexOf("."));
        //System.out.println(lastIN);

        System.out.println(firstNameI+firstNameRest);
        System.out.println(lastIN+lastNameI);
        System.out.println(domain);


    }
}
/*
Print first word without its first
character
then print the second word without its first character.
Input:
apple
banana
Output:
ppleanana
 */