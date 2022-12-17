package Day24_ReturnMethods;

public class T9_containsInteger {
    public static void main(String[] args) {
       int[] array={10,20,30,40};
       int number=45;
        System.out.println(contains(array,number));
    }

    static public boolean contains(int[] arr, int num) {
        boolean element = false;
        for (int each : arr) {
            if (each == num) {
                element = true;
            }

        }return element;

    }/*Create a method named contains that passes one integer array and one integer parameters, the method returns true
if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false

    */


}

