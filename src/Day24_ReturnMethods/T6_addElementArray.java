package Day24_ReturnMethods;

import java.util.Arrays;

public class T6_addElementArray {
    public static void main(String[] args) {
        int[] array={1,2,3,5};
        int element=4;
        System.out.println(Arrays.toString(addElement(array,element)));

    }
    public static int[] addElement(int[] arr, int num ){
        int[] result=new int[arr.length+1];
        int i=0;
        for (int i1 : arr) {
            result[i++]=i1;}
         result[i]=num;
        return result;
        }
        //int[] newArr={i,num};r
        //System.out.println()    }



}
/*
create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array
    			Ex:	arr ={1,2,3};
    				num = 4;
    				addElement(arr, num) ==> {1,2,3,4}
 */