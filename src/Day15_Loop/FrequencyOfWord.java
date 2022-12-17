package Day15_Loop;

public class FrequencyOfWord {
    public static void main(String[] args) {

        /*String sen="java is fun java is cool.nice java";
        sen=sen.toLowerCase();
       int frequency=0;
while (sen.contains("java")){
    sen=sen.replaceFirst("java","");
    frequency++;

}
        System.out.println(frequency);*/

/*
write a program that can return the frequency of the a word Java from
the sentence
Ex:
sentence = "Java Java";
output:
2
 */

        String sen="java is fun java is co" +
                "ol.nice java.java";
        sen=sen.toLowerCase();
        int frequency=0;

        for (int i = 0; i <sen.length() ; i++) {
            if (sen.contains("java")){
                sen=sen.replaceFirst("java","");
                frequency++;
            }



        }System.out.println(frequency);


        }
}
