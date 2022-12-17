package Day28_ArrayList;

import java.util.ArrayList;

public class T2_SwapFirstToLast {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.set(0, list.size());
        list.set(list.size()-1,1);
        System.out.println(list);

    }
}
