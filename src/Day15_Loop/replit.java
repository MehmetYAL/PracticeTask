package Day15_Loop;

import java.util.Scanner;
import java.util.concurrent.Callable;

import static java.lang.System.out;

public class replit {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String screenSize, CPU, storageType , screenResolution;
        int ramSize, memorySize;
        double price=0;
        System.out.println("select screen size");
        screenSize= input.nextLine();
        if (screenSize.equals("13,3")){ price+=200;}
        else if (screenSize.equals("15,0")) {price+=300;     }
        else if (screenSize.equals("17,3")) {price+=400;     }

        System.out.println("select CPU Type");
        CPU=input.next();
        if (CPU.equals("i3")){price+=150;}
        else if (CPU.equals("i5")) {price+=250 ; }
        else if (CPU.equals("i7")) {price+=350; }

        System.out.println("select a Ram");
        ramSize=input.nextInt();
        price+=(ramSize/4)*50;

        input.nextLine();
        System.out.println("select storage type");
        storageType=input.nextLine();
        out.println("select a memorysize");
        memorySize=input.nextInt();

        if (storageType.equals("HDD")){price+=(memorySize/500)*50;}
        else if (storageType.equals("SSD")) {price+=(memorySize/500)*100; }
        input.nextLine();

        out.println("enter screen resolution");
        screenResolution=input.nextLine();
        if (screenResolution.equals("fullhd")){ price+=100;}
        else if (screenResolution.equals("4K")) {price+=200;  }


        out.println("Computer price = " + price);
        input.close();

            }
        }





