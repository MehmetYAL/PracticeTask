package reviewWeek29_01_05_02_2023;

public class day20_arrays_task1 {
    public static void main(String[] args) {
        String[] items  = {"Shoes ya", "Jacket ya",  "Gloves ma", "AirPods my", "iPad al", "iPhone case" };
        for (String each : items) {
           // System.out.println(each.charAt(0)+"."+each.substring(each.indexOf(" ")+1,each.indexOf(" ")+2));


            String reverse="";

            for (int i = args.length-1; i >=0 ; i--) {
                reverse+=each.charAt(i);
            }
            System.out.println("reverse = " + reverse);
        }

    }
}
/*
 create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */