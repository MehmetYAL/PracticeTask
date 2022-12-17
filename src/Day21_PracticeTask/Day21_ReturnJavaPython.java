package Day21_PracticeTask;

import java.util.Arrays;

public class Day21_ReturnJavaPython {
    public static void main(String[] args) {
        String sent="java java python are language java and c# python";
        String[] str=sent.split(" ");
        System.out.println(Arrays.toString(str));
        int countJava=0;
        int countPython=0;
        for (String s : str) {
            if (s.equalsIgnoreCase("java")){countJava++;}
            else if (s.equalsIgnoreCase("python")) {countPython++;

            }


        }System.out.println("java"+countJava+"python"+countPython);
    }
}
