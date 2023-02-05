package reviewWeek29_01_05_02_2023;

public class loop_frequancyOfTheChar {
    public static void main(String[] args) {
     //String str = "aabcccd";
     String str="java programming language";
     char ch='g';
//char ch='c';
     int frequcny=0;
        for (int i = 0; i <str.length() ; i++) {
            char eachChar=str.charAt(i);
            if (eachChar==ch){
                frequcny++;
            }
        }
        System.out.println("frequcny of char = " + frequcny);
    }
}
/*
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
 */