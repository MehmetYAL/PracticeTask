package reviewWeek29_01_05_02_2023;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {
        String str="Cydeo12345School!@$woodenSpoon";
        String letter="";
        String digit="";
        String special="";

        for (int i = 0; i <str.length() ; i++) {

            char ch=str.charAt(i);
            if ((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
                letter+=ch;
            } else if (ch>='0'&&ch<='9') {
                digit+=ch;

            }else {
                special+=ch;
            }

        }
        System.out.println("letter = " + letter);
        System.out.println("digit = " + digit);
        System.out.println("special = " + special);
    }
}
