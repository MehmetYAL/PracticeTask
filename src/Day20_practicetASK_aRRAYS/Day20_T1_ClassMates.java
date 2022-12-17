package Day20_practicetASK_aRRAYS;

import java.util.Arrays;

public class Day20_T1_ClassMates {
    public static void main(String[] args) {
        String[] classMates={"meh yal","meh ak","ali kara","cos sag","vel oz","mus ati",
        "meh kor","ziy ah","ahm vel","cyd sco"};

        for (int i = 0; i < classMates.length; i++) {
            String init=classMates[i].charAt(0)+","+classMates[i].charAt(classMates[i].indexOf(" ")+1);
            System.out.println(init);
        }

    }
}
