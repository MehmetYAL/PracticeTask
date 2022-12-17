package Day24_ReturnMethods;

import java.util.Arrays;

public class T8_reverseArray {
    public static void main(String[] args) {
        int [] array11={10,20,30,40};
        System.out.println(Arrays.toString(reverseArray(array11)));
    }

    public static int[] reverseArray(int[] arr1){
        int j=0;
        int[] newArr=new int[arr1.length];
        for (int i = arr1.length-1; i >= 0; i--) {
            newArr[j++]=arr1[i];

        }return newArr;

    }
  /*
    Create method named reverse that passes an integer array parameter, the method can return the reversed array
				Ex:	arr = {10, 20, 30, 40};
					reverse(arr) ==> {40, 30, 20, 10}
   */

}
