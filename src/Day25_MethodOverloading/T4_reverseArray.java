package Day25_MethodOverloading;

import java.util.Arrays;

public class T4_reverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,5,9,11};
        String [] names={"mehmet","ahmet","mustafa","kamil"};
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Arrays.toString(reverse(names)));
    }
    public static int[] reverse(int[] array){
        int[] result=new int[array.length];
        int k=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[k++]=array[i];

        }
return result;
    }

    public static String[] reverse(String[] array){
        String[] result=new String[array.length];
        int k=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[k++]=array[i];

        }
        return result;
    }
}
