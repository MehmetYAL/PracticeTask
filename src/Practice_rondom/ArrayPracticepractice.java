package Practice_rondom;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticepractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("how many number do you want to enter");
        int AllNum= input.nextInt();
        if (AllNum<=0){
            System.out.println("invalid entry");
            System.exit(0);}
        int[] num=new int[AllNum];
            for (int i = 0; i < AllNum; i++) {
                System.out.println("enter numbers");
                 num[i] =input.nextInt();
                  //num[i]=length;
            }
        System.out.println(Arrays.toString(num));
            input.close();
        }
    }

