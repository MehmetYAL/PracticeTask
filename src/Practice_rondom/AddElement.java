package Practice_rondom;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[] str1={1,2,3};
        int n=4;
        System.out.println(Arrays.toString(addelement(str1,n)));
    }
    public static int[] addelement(int[] arr, int element){
        int [] str= new int[arr.length+1];
        int j=0;
        for (int each : arr) {
            str[j++]=each;

        }str[j]=element;
        return str;
    }


}
   /* create a method named addElement that takes one integer array and one integer,
   the method can add the Integer number after the
        last index of the integer array and returns the new array

        Ex:
        arr ={1,2,3};
        num = 4;

        addElement(arr, num) ==> {1,2,3,4}*/