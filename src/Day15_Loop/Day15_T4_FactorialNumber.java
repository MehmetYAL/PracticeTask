package Day15_Loop;

public class Day15_T4_FactorialNumber {
    public static void main(String[] args) {
        double total=1;
        for (int i=5; i>=1;i--){
            total*=i;
        }
        System.out.println(total);
    }
}
