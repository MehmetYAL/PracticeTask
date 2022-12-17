package Day20_practicetASK_aRRAYS;

import java.util.Arrays;

public class Day20_T5_reverseArray_______ {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 22, 15};
        int[] reverse = new int[arr.length];

        for (int i = arr.length - 1, k = 0; i >= 0; i--, k++) {
            reverse[i] = arr[k];
        }
        System.out.println(Arrays.toString(reverse));
    }

}