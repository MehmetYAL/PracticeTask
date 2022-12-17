package Day23_CustomMethods_void_parameters;

public class Task13_EachChar {
    public static void main(String[] args) {
        EachChar("hello cydeo");

    }
    public static void EachChar(String eachChar){

        for (int i = 0; i <eachChar.length() ; i++) {
            System.out.print(eachChar.charAt(i));

        }

    }
}
