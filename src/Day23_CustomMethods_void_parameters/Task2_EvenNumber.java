package Day23_CustomMethods_void_parameters;

public class Task2_EvenNumber {
    public static void main(String[] args) {
        printEvenNumbers();
    }
    public static void printEvenNumbers(){
        for (int i = 1; i < 100 ; i++) {
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }

        System.out.println();
    }

}

