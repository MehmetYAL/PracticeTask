package zzzMethodOverloadingPrintingClass;
import Day25_MethodOverloading.T1_MergeTwo_Int_String;

import java.util.Arrays;

public class methodPrinting {
    public static void main(String[] args) {
        int[] arr10={11,22,33,44};
        int[] arr20={111,222,333,444};
        System.out.println(Arrays.toString( T1_MergeTwo_Int_String.mergeTwoArrays(arr10,arr20)));
        //System.out.println(arr101);
        System.out.println("---------------------------");

    }
}
