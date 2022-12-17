package Day14_String;

import java.util.Scanner;

public class Day14_task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first fruit name");
        String fruit1=input.next();
        System.out.println("enter second fruitname");
        String fruit2=input.next();
        System.out.println(fruit1+"\n"+fruit2);

        String f3=fruit1.substring(1);
       String f4=fruit2.substring(1);

       System.out.println(f3+f4);
       input.close();

    }
}
