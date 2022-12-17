package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class T5_MaxOfArray {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));//using all element using bulk operation
        int max=list.get(0);
        for (Integer each : list) {
            if (each>max){max=each;}

        }
        System.out.println(max);
    }
}
/*
Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
 */