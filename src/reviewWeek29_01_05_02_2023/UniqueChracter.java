package reviewWeek29_01_05_02_2023;

public class UniqueChracter {
    public static void main(String[] args) {
        String str="AABCCD";
        String letter="";

        for (int i = 0; i <str.length() ; i++) {
            
            String ch=""+str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                letter+=ch;
            }
            
        }
        System.out.println("letter = " + letter);
    }
}
/*
rite a program that can return the unique characters from a String
			Ex:
				input:
					AABCCD

				output:
					BD
			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique
				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1

				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2


 */