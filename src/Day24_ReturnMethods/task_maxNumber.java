package Day24_ReturnMethods;

public class task_maxNumber {
    public static void main(String[] args) {
 int[] arr1={10,45,96,3,45,8};
     int maxNumber= maxNumber(arr1);
        System.out.println(maxNumber);


    }
public static int maxNumber(int[] arr1){
        int max=0;
    for (int i = 0; i < arr1.length; i++) {
        if (arr1[i]>max){max=arr1[i];}
    }return max;

}

}
/*
2. create a method that can return the maximum number from an array of integers
 */