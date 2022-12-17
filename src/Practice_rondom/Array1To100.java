package Practice_rondom;

import java.util.Arrays;

public class Array1To100 {
    public static void main(String[] args) {

        int[] number=new int[100];
        for (int i = 0; i <100 ; i++) {
            number[i]=i;

        }
        System.out.println(Arrays.toString(number));
    }

}
