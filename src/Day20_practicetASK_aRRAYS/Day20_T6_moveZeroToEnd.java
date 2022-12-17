package Day20_practicetASK_aRRAYS;

import java.util.Arrays;

public class Day20_T6_moveZeroToEnd {
    public static void main(String[] args) {
        int[] array = {10, 0, 5, 0, 1, 0};
     // Arrays.sort(array);

      int[] reserve=new int[array.length];
int result=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=0){reserve[result++]=array[i];};

        }
        System.out.println(Arrays.toString(reserve));



        //System.out.println(Arrays.toString(array));

    }
}
/*
write a program that can move all the zeros to the end of the array
Ex:
array = {10, 0, 5, 0, 1, 0};
output:
{10, 5, 1, 0, 0, 0}
 */