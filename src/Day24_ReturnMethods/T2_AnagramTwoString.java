package Day24_ReturnMethods;

import java.util.Arrays;

public class T2_AnagramTwoString {
    public static void main(String[] args) {
        String num1="silent";
        String num2="listen";

        System.out.println(isAnagram(num1,num2));

    }

    public static boolean isAnagram(String str1,String str2){

        char[] word1=str1.toCharArray();
        char[] word2=str2.toCharArray();
         Arrays.sort(word1);
         Arrays.sort(word2);
         boolean angram=Arrays.equals(word1,word2);
        return angram;
    }
}
/*
create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:str1 = "cba"
    				str2 = "bac";
    				isAnagram(str1, str2) ====> true
 */