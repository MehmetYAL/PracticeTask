package Day24_ReturnMethods;

import java.util.Arrays;

public class task_reversedArray {
    public static void main(String[] args) {
int[] numArr={10,20,30,40};
        System.out.println(Arrays.toString(reverse(numArr)));
    }

public static int[] reverse(int[] array ){
    int num=0;
    int[] rev=new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
        rev[num++]=array[i];
    }
        return rev;
}

}
/*
create a method that return the reversed array
					{1,2,3,4,5} === > {5,4,3,2,1}
 */