package Practice_rondom;

import java.util.ArrayList;
import java.util.Arrays;

public class d28_T1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        /*ArrayList<Integer> list2=new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            //int temp=0;
            if (i == 0) {list2.add(list.get(list.size()-1));
                continue;
            } else if (i== list.size()-1) {list2.add(list.get(0));
break;
            }list2.add(list.get(i));
        }
        System.out.println(list2);*/

int num=0;
int num1=0;
num= list.get(0);
num1= list.get(list.size()-1);

list.set(0,num1);
list.set(list.size()-1,num );
        System.out.println(list);


    }
}
/*
write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];

	                write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
 */