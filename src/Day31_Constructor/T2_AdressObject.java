package Day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class T2_AdressObject {
    public static void main(String[] args) {
        T2_Address tr=new T2_Address("Mehmet Yalcin","47a","Mardin cad","Alanya","Bolu",1476);
        System.out.println(tr);
        ArrayList<T2_Address> adress=new ArrayList<>();
        adress.addAll(Arrays.asList(tr));



    }
}
