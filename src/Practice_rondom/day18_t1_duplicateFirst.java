package Practice_rondom;

public class day18_t1_duplicateFirst {
    public static void main(String[] args) {
        String str = "abbca";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int counter = 0;

            for (int j = 0; j < str.length(); j++) {

                char duplicated = str.charAt(j);

                if (ch == duplicated) {
                    counter++;
                }

                if (counter == 2) {
                    System.out.println("" + ch);
                    System.exit(0);
                }

        /*
         Write a program that can return the first duplicated character from a string
         */
            }

        }}}