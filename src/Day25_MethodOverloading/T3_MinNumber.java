package Day25_MethodOverloading;

public class T3_MinNumber {
    public static void main(String[] args) {
        int[] array={22,54,87,6,};
        System.out.println(minNumber(array));
    }
    public static int minNumber(int[] arr){
        int min=arr[0];
        for (int each : arr) {
            if (each<min){min=each;}

        }return min;

    }
}
