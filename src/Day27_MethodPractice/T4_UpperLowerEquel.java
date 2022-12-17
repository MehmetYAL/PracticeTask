package Day27_MethodPractice;

public class T4_UpperLowerEquel {
    public static void main(String[] args) {
 String str="JAVA vva";
int upper=0;
int lower=0;

        for (int i = 0; i <str.length() ; i++) {
            char each=str.charAt(i);
            if (Character.isUpperCase(each)){
                upper++;
            }if (Character.isLowerCase(each)){
                lower++;
            }

        }boolean result=upper==lower;
        System.out.println(result);
    }
}
/*
Write program that returns true if the total number of upper case characters are
 equal to total number of Lowercase characters of a string
		Ex:			str = "JAVA java";

		output:
			true

 */