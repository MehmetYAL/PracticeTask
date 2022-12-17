package Practice_rondom;

import java.util.Scanner;

public class sumOfInt {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sum=0;
        for (int i =0; i <=5 ; i++) {
            System.out.println("enter 5 numbers");
            int k= input.nextInt();
            sum+=k;
        }
        System.out.println(sum);
    }
}
