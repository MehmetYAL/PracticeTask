package Practice_rondom;

public class ArrayInitials {
    public static void main(String[] args) {
        String[] names={"mehm yal","alper yal","melih yal","al yal"};
        for (int i = 0; i < names.length; i++) {
            String init=names[i].charAt(0)+" "+names[i].charAt(names[i].indexOf(" ")+1);
            System.out.println(init);
        }

    }
}
