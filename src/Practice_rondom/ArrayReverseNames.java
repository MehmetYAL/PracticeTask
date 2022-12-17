package Practice_rondom;

public class ArrayReverseNames {
    public static void main(String[] args) {
        String[] names = {"java", "python", "melih yalcin", "alper yal"};
        for (String classmates : names) {
            String result = "";
            for (int i = classmates.length()-1; i >= 0; i--) {

                result += classmates.charAt(i);

            }System.out.println(result);

        }
    }
}