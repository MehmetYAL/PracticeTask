package Practice_rondom;

public class ArrayMinOfNumber {
    public static void main(String[] args) {
        int[] numbers={5,25,10,8,7};
        int min=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min){
                min=numbers[i];
            }

        }
        System.out.println(min);
    }
}
