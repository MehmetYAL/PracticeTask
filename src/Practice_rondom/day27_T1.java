package Practice_rondom;

import java.util.Arrays;

public class day27_T1 {
    public static void main(String[] args) {
        int[] str={10,20,30,40,50};
        int eleman=100;

        System.out.println(Arrays.toString(insertElement(str,2,eleman)));
    }


    public static int[] insertElement(int[] array, int index, int element) {
        int[] array1 = new int[array.length +1];
        int i=0;
        for (int k = 0; k < array1.length; k++) {
            if (k == index) {
                array1[k] = element;
                continue;

            }
            array1[k] = array[i++];

        }

return array1;
    }
}
/*
Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}
 */