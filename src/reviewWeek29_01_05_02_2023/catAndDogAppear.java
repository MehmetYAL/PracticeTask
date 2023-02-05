package reviewWeek29_01_05_02_2023;

public class catAndDogAppear {
    public static void main(String[] args) {
        String str="caT dog dogG cAt";
        int freqCat=0;
        int freqDog=0;

        for (int i = 0; i <=str.length()-3 ; i++) {
            String s=str.substring(i,i+3);
            if (s.equalsIgnoreCase("cat")){
                freqCat++;
            } else if (s.equalsIgnoreCase("dog")) {
                freqDog++;

            }
            System.out.println("freqDog = " + freqDog);
            System.out.println("freqCat = " + freqCat);
            boolean r1=freqDog==freqCat;
            System.out.println("r1 = " + r1);
        }
    }
}
/*
write a program to print true if the string "cat" and "dog" appear the
same number of times in the given sentence
        Ex:
            sentence = "caT dog dogG cAt"
            output:
                true
 */