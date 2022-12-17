package Day28_ArrayList;

import java.util.ArrayList;

public class T4_Combine2String {
    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        ArrayList<String> list=new ArrayList<>();
        for (String each : arr1) {
            list.add(each);

        } for (String each : arr2) {
            list.add(each);
        }
        System.out.println(list);
    }
}
