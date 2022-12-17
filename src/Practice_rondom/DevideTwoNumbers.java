package Practice_rondom;

public class DevideTwoNumbers {
    public static void main(String[] args) {
        /*
        Write a program that
        can divide two positive numbers
        without using / (division) and * (multiplication and% reminder
         */

        int n1=30;
        int n2=4;
        int coount=0;
        while (n1>n2){
            n1=n1-n2;
            coount++;
        }
        System.out.println(coount);

    }



}
