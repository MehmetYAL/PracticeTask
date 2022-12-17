package Day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class T1_CandyFactory {
    public static void main(String[] args) {
        ArrayList<T1_Candy> candies = new ArrayList<T1_Candy>();
        candies.addAll(Arrays.asList(new T1_Candy("MY", 50, 1.5, false),
                new T1_Candy("my", 45, 2, true),
                new T1_Candy("my", 55, 1.5, false)
        ));
        for (T1_Candy candy : candies) {
            System.out.println(candy.getBrandName() + ":" + candy.getPrice());


        }

    }
}
/*
 1.2 Create a class named T1_CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
 */