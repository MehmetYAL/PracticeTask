package Day15_Loop;

public class Day15_T7_reverse {
    public static void main(String[] args) {
        String str="Wooden Spoon";
        String result="";
        for (int i=str.length()-1;i>=0;i--){
           result=result+str.charAt(i);

        }
        System.out.println(result);

        /*Write a program that can reverse any given string
Ex:
input:
Wooden Spoon
output:
noopS nedooW

         */
    }
}
