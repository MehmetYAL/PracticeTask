package Day24_ReturnMethods;

import java.util.Arrays;

public class T7_mergeTwoIntegerArray {
    public static void main(String[] args) {
        int[]arr11={1,2,3,4};
        int[] arr12={10,20,30,40};
        System.out.println(Arrays.toString(merge(arr11,arr12)));
    }

    public static int[] merge(int[] arr1,int[] arr2){

        int[] arr3=new int[arr1.length+ arr2.length];
        int k=0;
        for (int i : arr1) {
            arr3[k++]=i;
                    }
        for (int i : arr2) {
            arr3[k++]=i;       }


       return arr3;

    }

/*
Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array
				Ex:	arr1 = {1,2,3}
					arr2 = {4,5,6}
					merge(arr1, arr2) ====> {1,2,3,4,5,6}
 */



}
