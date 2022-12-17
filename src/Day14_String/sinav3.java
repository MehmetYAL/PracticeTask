package Day14_String;

public class sinav3 {
    public static void main(String[] args) {

        char grade='A';
        boolean passed=grade=='A'||grade=='B';
        boolean passed2=grade=='C'||grade=='D';
        if (passed||passed2){
            System.out.println("you have passed exam");
        }else {System.out.println("you failed"   );}

    }
}
