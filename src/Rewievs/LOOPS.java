package Rewievs;

public class LOOPS {
    public static class RetrunDigitLetter {
        public static void main(String[] args) {
    String letters="";
    String digit="";
    String speciall="";

            String str="mn@123Ab!";
            for (int i = 0; i <str.length() ; i++) {
                char ch=str.charAt(i);
    if (ch>='a'&&ch<='z'){
        letters+=ch;
    } else if (ch>='A'&&ch<'Z') {
        letters+=ch;
        } else if (ch>='0'&&ch<'9') {
        digit+=ch;
    }else {speciall+=ch;}
            }
            System.out.println(letters);
            System.out.println(digit);
            System.out.println(speciall);
        }
    }

    public static class WithOutFirstChar {
        public static void main(String[] args) {
            String str1="apple";
            String str2="banana";
            String w1=str1.substring(1);
            String w2=str2.substring(1);
            System.out.println(w1+w2);
        }
    }
}
