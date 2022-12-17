package Day24_ReturnMethods;

public class T5_frequencyOfNumberArray {
    public static void main(String[] args) {
int[] num={1,1,2,2,3,3,3,3,8};
int ele=3;
        System.out.println(frequency(num,ele));
    }

    public static int frequency(int arr[],int element){
      int count=0;
        for (int i : arr) {if (i==element){
            count++;
        }

        }return count;
    }
}
/*
create method that accepts one integer array and one integer number and returns the frequency of the number
                    Ex: int[] array ={1,1,1,1,1,2,2};
                        frequency(array, 1) ==> 5
 */