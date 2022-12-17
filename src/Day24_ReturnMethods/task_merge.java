package Day24_ReturnMethods;

import java.util.Arrays;

public class task_merge {
    public static void main(String[] args) {
int [] arr1={1,2,3};
int[] arr2={4,5};
        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }
public static int[] merge(int[] a, int []b){
        int[] newArray=new int[a.length+b.length];
        int j=0;
    for (int i : a) {
        newArray[j++]=i;

    }
    for (int i : b) {newArray[j++]=i;

    }return newArray;


}


}
/*
 create a method that can merge two arrays and returnj the new array
				arr1 = {1,2,3}
				arr2 = {4,5}

				{1,2,3,4,5}
 */

