package Day23_CustomMethods_void_parameters;

public class Task4_EligibleToVote {
    public static void main(String[] args) {
EligibleToVote(25,"tr");
    }

    public static void EligibleToVote(int age,String citizen){
        if (age>=21&&citizen.equalsIgnoreCase("usa")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("not eligible to vote");}



    }
}
