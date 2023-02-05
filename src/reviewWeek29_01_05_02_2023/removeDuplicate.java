package reviewWeek29_01_05_02_2023;

public class removeDuplicate {
    public static void main(String[] args) {
        String str="AABBCCBC";
        String s1="";

        for (int i = 0; i <str.length() ; i++) {
            String ch=""+str.charAt(i);
     if (!s1.contains(ch))     { s1+=ch;}

        }
        System.out.println("s1 = " + s1);
    }
}
/*
Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC
				Output:
					ABC
			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding

 */