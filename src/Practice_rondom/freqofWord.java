package Practice_rondom;

public class freqofWord {
    public static void main(String[] args) {
        String str=" java java Java python tr java";
        String word="java";
        System.out.println(frequencyOfWord(str,word));

    }

    public static int frequencyOfWord( String sen,String word){
        int j=0;
sen=sen.toLowerCase();
word=word.toLowerCase();
        for (int i = 0; i <sen.length() ; i++) {
            if (sen.contains(word)){
                j++;
                sen=sen.replaceFirst(word," ");
            }

        }return j;

    }
}
