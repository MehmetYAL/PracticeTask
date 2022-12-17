package Day23_CustomMethods_void_parameters;

public class Task10_DollarToLira {
    public static void main(String[] args) {
        DollarToLira(198);
    }
    public static void DollarToLira(double Dollar){
        double currency=18.6;
        double convert=Dollar*currency;
        System.out.println(convert);
    }
}
