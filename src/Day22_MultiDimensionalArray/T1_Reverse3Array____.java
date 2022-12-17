package Day22_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class T1_Reverse3Array____{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};
        int[] arr3 = {8,9,10,11,12,13};

        int[][] arr2D=new int[3][];
        arr2D[0]=arr1;
        arr2D[1]=arr2;
        arr2D[2]=arr3;
        System.out.println(Arrays.deepToString(arr2D));
        int[][] reverse=new int[arr2D.length][];

        for (int i = 0; i < arr2D.length ; i++) {

            for (int k = arr2D[i].length - 1; k >= 0; k--) {
               // System.out.print(arr2D[i][k]+" ");
            }

        }
        System.out.println(Arrays.toString(reverse));
    }
}
