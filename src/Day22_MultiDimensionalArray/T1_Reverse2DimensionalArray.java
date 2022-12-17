package Day22_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class T1_Reverse2DimensionalArray {
    public static void main(String[] args) {
int[][] array={ {1,2,3}, {4,5,6}};

        for (int i = array.length - 1; i >= 0; i--) {
            for (int k = array[i].length - 1; k >= 0; k--) {
                System.out.print(array[i][k]+" ");
            }
        }
    }
}
/*
Write a program that can reverse a two dimensional array (return new
array)
Ex:
array = { {1,2,3}, {4,5,6}};
output:
reverse = { {6,5,4}, {3,2,1},};
 */