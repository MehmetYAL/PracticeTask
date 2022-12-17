package Practice_rondom;

import java.util.Arrays;

public class Array100to1 {
    public static void main(String[] args) {
        int[] number=new int[101];
        int[] result=new int[number.length];
        int j=0;
        for (int i = number.length; i >= 1; i--) {
            result[j++]=i;

        }
        System.out.println(Arrays.toString(result));
       // System.out.println(Arrays.toString(number));
        //int newnum=number[101];
       // for (int i = number.length; i >0 ; i--) {
//number[i]=i;

     //   }
       // System.out.println(Arrays.toString(number));
    }
}
