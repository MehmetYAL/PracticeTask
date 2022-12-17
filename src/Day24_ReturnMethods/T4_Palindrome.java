package Day24_ReturnMethods;

public class T4_Palindrome {
    public static void main(String[] args) {
String palan="levelll";
        System.out.println(isPalandrome(palan));
    }

    public static boolean isPalandrome(String str){
        String reserve="";
        for (int i=str.length()-1;i>=0;i--){
            reserve+=str.charAt(i);


        }boolean pal=str.equalsIgnoreCase(reserve);

return pal;
  }
}
/*
 By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false
				Ex:	str = "Level"
					isPalindrome(str) ===> true
 */