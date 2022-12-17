package Day33_CustomClassStatic;

public class T1_CydeoStudents {
    public String name;
    public int age;
    public char gender;
    public int id;
    public char grade;
    public String BatchNumber;
    public int groupNumber;
    public static String Schoolname="Cydeo";
    public static String programmingLanguage="Java";

    public T1_CydeoStudents(String name, int age, char gender, int id, char grade, String batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        BatchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
    public void study(){
        System.out.println(name+" is studying");
    }
    public void attendClass(){
        System.out.println(name+ " is attending class");
    }
    public static void displayScoolName(){
        System.out.println("Schoolname = " + Schoolname);
    }
    public static void displayProgramLanguage(){
        System.out.println("programmingLanguage = " + programmingLanguage);
    }

    public String toString() {
        return "T1_CydeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", grade=" + grade +
                ", BatchNumber='" + BatchNumber + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
