package reviewWeek29_01_05_02_2023;

public class ReverseString {
    public static void main(String[] args) {
        String str="Wooden spoon";
        String result="";

        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        System.out.println("result = " + result);
    }
}
