package Rewievs;

public class StringPalindrome {
    public static void main(String[] args) {
        String str="levelf";
        String reverse="";
        for (int i =str.length()-1; i >=0 ; i--) {
            char ch=str.charAt(i);
            reverse+=ch;
        }if (str.equalsIgnoreCase(reverse)){
            System.out.println(true);
        }else System.out.println(false);
    }
}
