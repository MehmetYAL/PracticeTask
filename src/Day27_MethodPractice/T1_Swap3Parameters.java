package Day27_MethodPractice;

import java.util.Arrays;

public class T1_Swap3Parameters {
    public static void main(String[] args) {
int[] arr={1,2,3,4};
//int ind=1;
//int elem=10;
        System.out.println(Arrays.toString(swap(arr,1,2)));
    }
    public static int[] swap(int[] array,int index,int element){
        int temp=array[index];
        array[index]=array[element];
        array[element]=temp;
return array;
    }
   /* public static int[] swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }*/
}
/*
Create a method named swap that passes three parameters: integer array, integer i, integer j.
 the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}
 */