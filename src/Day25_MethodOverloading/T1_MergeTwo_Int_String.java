package Day25_MethodOverloading;

import java.util.Arrays;

public class T1_MergeTwo_Int_String {
    public static void main(String[] args) {
        int[] array1={1,2,5,6};
        int[] array2={10,20,50,60};
        System.out.println(Arrays.toString(mergeTwoArrays(array1,array2)));


    }
    //ilk once iki array bir arrayda toplamak icin 2array size i kadar yeni
    // bir array olusturulur,arr1+arr2 gibi, sonra bu1.array foreachloop ile cikarilir ve
    // olusturulan int degeri icinde yeni arrayin icine [++] olarak yapilip foreachloop
    //le olusturulan cikarilmis(each) ile esitelnir. ayni islem 2.array icinde yapilir
    //ve return olusturulur.
    public static int[] mergeTwoArrays(int[] arr1,int[] arr2){
        int[] nArray=new int[arr1.length+arr2.length];
        int i=0;
        for (int each : arr1) {
            nArray[i++]=each;

        }
        for (int each : arr2) {
            nArray[i++]=each;

        }return nArray;

    }

    public static double[] mergeTwoArrays(double[] arr1,double[] arr2){
        double[] nArray=new double[arr1.length+arr2.length];
        int i=0;
        for (double each : arr1) {
            nArray[i++]=each;

        }
        for (double each : arr2) {
            nArray[i++]=each;

        }return nArray;

    }

    public static char[] mergeTwoArrays(char[] arr1,char[] arr2){
        char[] nArray=new char[arr1.length+arr2.length];
        int i=0;
        for (char each : arr1) {
            nArray[i++]=each;

        }
        for (char each : arr2) {
            nArray[i++]=each;

        }return nArray;

    }

    public static String[] mergeTwoArrays(String[] arr1,String[] arr2){
        String[] nArray=new String[arr1.length+arr2.length];
        int i=0;
        for (String each : arr1) {
            nArray[i++]=each;

        }
        for (String each : arr2) {
            nArray[i++]=each;

        }return nArray;

    }



}
