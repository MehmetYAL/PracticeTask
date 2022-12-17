package Rewievs;

public class StartWithX {
    public static void main(String[] args) {
        String str="trxcode";
        char w1=str.charAt(0);
        if (w1=='x'){
            System.out.println(str.substring(1));
        }else System.out.println(str);
    }
}
