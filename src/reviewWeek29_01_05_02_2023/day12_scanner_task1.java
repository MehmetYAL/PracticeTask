package reviewWeek29_01_05_02_2023;

import java.util.Scanner;

public class day12_scanner_task1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("how many people you live with");

       int number= input.nextInt();

       if (number<3){
           System.out.println("live less than 3");
       } else if (number>=3&&number<=6) {
           System.out.println("live with 3to6");

       }else {
           System.out.println("live too crowded");
       }

        System.out.println("========================================");
        System.out.println("whats is you current speed");
        int speed=input.nextInt();
        int speedLimit=55;
        int overspeed=speed-speedLimit;
        if (speed>speedLimit){
            System.out.println("you r driving over" +overspeed+" mph over limit please slow down");
        }
input.close();
    }
}
