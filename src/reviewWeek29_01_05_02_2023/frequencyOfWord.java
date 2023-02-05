package reviewWeek29_01_05_02_2023;

public class frequencyOfWord {
    public static void main(String[] args) {
        String sentence= "java java java java";
        int frequency=0;

        for (int i = 0; i <=sentence.length()-4 ; i++) {
            String word=sentence.substring(i,i+4);
            if(word.equalsIgnoreCase("java")){
             frequency++;
         }
        }
        System.out.println("frequency = " + frequency);
    }
}
