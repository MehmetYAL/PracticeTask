package Day15_Loop;

public class Day15_T1_sumOfEvenNumbers {
    public static void main(String[] args) {
//1. Write a program that can return the sum of even numbers between 1
//to 100
        int total=0;
        for (int i=2;i<=100;i+=2){
        if (i%2==0);
            total+= i;}
        System.out.println(total);
    }
}
