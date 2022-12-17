package Day21_PracticeTask;

public class Day21_T4_Palandrome {
    public static void main(String[] args) {
String[] str={"anna", "level", "Java"};
int count=0;
        for (String palan : str) {
            String reverse="";
            for (int i = palan.length() - 1; i >= 0; i--) {
            reverse+=palan.charAt(i);
            }if (palan.equalsIgnoreCase(reverse)){count++;}

        }
        System.out.println(count);


    }
}
/*
write a program that can count how many palindromes in an array of
string
Ex:
{"anna", "level", "Java"};
output:
2
 */