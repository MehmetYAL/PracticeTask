package Rewievs;

public class FirstAndLastCharSame {
    public static void main(String[] args) {
        String str="levelr";

        if (str.charAt(0)==str.charAt(str.length()-1)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
