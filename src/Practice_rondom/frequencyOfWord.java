package Practice_rondom;

public class frequencyOfWord {
    public static void main(String[] args) {
        String str="Bjk is champion and BJK is biggest,bjk is the BjK";
        int BJK=str.length();
        int count=0;
        for (int i = 0; i <=BJK-3 ; i++) {
            if (str.substring(i,i+3).equalsIgnoreCase("bjk")){count++;}

        }
        System.out.println(count);
    }
}
