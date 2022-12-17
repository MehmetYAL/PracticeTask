package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class T7_firstDuplicate {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));
        System.out.println("list = " + list);
        int firstDup=0;
        for (Integer each : list) {
            int freq=0;
            for (Integer element : list) {
                if (each==element){
                    freq++;
                }
            }
            if (freq>1){
                firstDup=each;
            break;
            }
        }
        System.out.println("firstDup = " + firstDup);
    }
}
    /*Write a program that can return the first duplicated element from an arrayList of Integer
        Ex:
        list = [1,2,2,3,4,4,5,6,7,7];
        output:
        2*/