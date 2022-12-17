package Practice_rondom;

public class uniqueChar {
    public static void main(String[] args) {
        String str="aabbcdtdt";

        String result="";
        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            char ch=str.charAt(i);
            for (int j = 0; j <str.length() ; j++) {
                char xy=str.charAt(j);
                if (ch==xy){count++;}
            }if (count==1){
                result=result+ch;
            }

        }System.out.println(result);
    }
}
