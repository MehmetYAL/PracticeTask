package Day23_CustomMethods_void_parameters;

public class Task3_EligibleBuyAlchol {
    public static void main(String[] args) {
        EligibleToAlcohol(18);
        System.out.println();
    }
    public static void EligibleToAlcohol(int age) {
        if (age >= 21) {
            System.out.println("eligible to buy alcohol");

        } else {
            System.out.println("not eligible to buy alcohol");
        }


    }
}
