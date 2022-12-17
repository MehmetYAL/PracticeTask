package Day23_CustomMethods_void_parameters;

public class Task5_GradeOfTheStudents {
    public static void main(String[] args) {
        GradeOfTheStudents(99);
    }
    public static void GradeOfTheStudents(int grade){
        if (grade>0&&grade<=100){
            if (grade<100&&grade>=90){
                System.out.println("Great");
            } else if (grade<90&&grade>=80) {
                System.out.println("good");

            } else if (grade<80&&grade>=600) {
                System.out.println("passed");

            }else {
                System.out.println("failed");
            }
        }else {
            System.out.println("invalid score");
        }
    }
}
