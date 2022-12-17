package Day24_ReturnMethods;

public class T1_frequencyOfWord {
    public static void main(String[] args) {
String senNew="python Java java java java python java python java java java ";
String wordN="java";
        System.out.println(Frequency(senNew,wordN));
    }
public static int Frequency(String sen, String word){
        int result=0;
       //sen=sen.replace(word,"");
    for (int i = 0; i <sen.length()- word.length() ; i++) {

            if (sen.substring(i,i+word.length()).equalsIgnoreCase(word)){
                result++;
            }





}

    return result;


}
}
/*
create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */