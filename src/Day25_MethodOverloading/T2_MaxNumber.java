package Day25_MethodOverloading;

import java.util.Arrays;

public class T2_MaxNumber {
    public static void main(String[] args) {
        int[] array={20,45,87};
        System.out.println(maxNumber(array));
       
    }
    public static int maxNumber(int[] arr){
        int max=arr[0];
        for (int each : arr) {
            if (each>max){max=each;}


        }return max;
    }

    public static short maxNumber(short[] arr){
        short max=arr[0];
        for (short each : arr) {
            if (each>max){max=each;}


        }return max;

    }


}
