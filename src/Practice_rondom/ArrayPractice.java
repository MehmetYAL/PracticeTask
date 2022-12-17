package Practice_rondom;

public class ArrayPractice {
    public static void main(String[] args) {
        char[] letter=new char[26];
char ch='A';
        for (int i = 0; i < letter.length; i++) {
            letter[i]=ch;ch++;
        }
        System.out.println(letter);

        System.out.println("===================================================");

        char xy='Z';
        for (int i = 0; i < letter.length; i++) {
            letter[i]=xy;xy--;
        }
        System.out.println(letter);
    }
}
