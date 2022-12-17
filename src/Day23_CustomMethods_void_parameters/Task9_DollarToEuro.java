package Day23_CustomMethods_void_parameters;

public class Task9_DollarToEuro {
    public static void main(String[] args) {
       DollarToEuro(1200);
    }
    public static void DollarToEuro(int Dollar){

        double currency=Dollar/1.02;
        System.out.println(currency);
    }
}
