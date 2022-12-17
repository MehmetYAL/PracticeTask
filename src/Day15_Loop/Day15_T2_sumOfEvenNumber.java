package Day15_Loop;

public class Day15_T2_sumOfEvenNumber {
    public static void main(String[] args) {
        int total=0;
        for (int i=1; i<=100;i+=2){
            if (i%2==1);
            total+=i;
        }
        System.out.println(total);
    }
}
