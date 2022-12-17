package Day27_MethodPractice;

public class T3_LetterDigitSpecialChar {
    public static void main(String[] args) {
String str="Wooden Spoon12//";

String letter="";
String digit="";
String specialChars="";


        for (int i = 0; i <str.length() ; i++) {
            char each=str.charAt(i);
if (Character.isLetter(each)){letter+=each;}
else if (Character.isDigit(each)) {digit+=each;

}else {specialChars+=each;}


            //System.out.print(each+"*");
        }System.out.println("letter = " + letter);
        System.out.println("digit = " + digit);
        System.out.println("specialChars = " + specialChars);



    }
}
/*
. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:			str = "Wooden Spoon!"
		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */