package Practice_rondom;

import java.util.ArrayList;
import java.util.Arrays;

public class day28_arraylist_maxNu {

    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6));


        int max=0;

        for (Integer each : numbers) {
            if (each>max){
                max=each;
            }

        }
        System.out.println(max);
    }
}
