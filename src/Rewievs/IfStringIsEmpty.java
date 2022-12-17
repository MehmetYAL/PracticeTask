package Rewievs;

public class IfStringIsEmpty {
    public static void main(String[] args) {
        String str="Mehmet";
        if (str.length()==0){
            System.out.println("string is empty");
        } else if (str.length()>3) {
            System.out.println(str.substring(str.length()-3));

        } else if (str.length()<=3) {
            System.out.println(str);

        }
    }
}
