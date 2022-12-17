package Day24_ReturnMethods;

public class task_minNumber {
    public static void main(String[] args) {
int[] Num={2,4,12,-2,5};
int minNumber=minNumber(Num);
        System.out.println(minNumber);

    }

    public static int minNumber(int[] arrMin){
        int min=0;
        for (int k : arrMin) {
            if (k<min){min=k;}
        }
return min;
    }


}
/*
creat class that can return the minimum number
 */