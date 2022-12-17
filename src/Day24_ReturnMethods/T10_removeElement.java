package Day24_ReturnMethods;

import java.util.Arrays;

public class T10_removeElement {
    public static void main(String[] args) {
int[] num={10,20,30,40,50};
int n1=3;
        System.out.println(Arrays.toString(removeElement(num,n1)));
    }
public static int[] removeElement(int[] array,int index){
        int[] newarr=new int[array.length-1];
        int dx=0;
    for (int i = 0; i < array.length; i++) {


        if (i==index){
            continue;

        }newarr[dx++]=array[i];

    }return newarr;
}



}
/*
create a method named removeElement that passes one integer array and one integer,
the method removes the integer index from the integer array and returns the new array
			Ex:	array = {10, 20, 30, 40, 50, 60}
				index = 2
				removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */