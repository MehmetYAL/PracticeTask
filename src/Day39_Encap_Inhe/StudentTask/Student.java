package Day39_Encap_Inhe.StudentTask;

public class Student extends Person{
    public Student(String name, int age, char gender, int studentID, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    private int studentID;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy.isEmpty()){System.exit(1);}
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='E')){
            System.out.println("enter valid grade");
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName()+" Id is "+studentID+" is studing");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +'\'' +
                ", gender=" + getGender() +'\'' +
                "studentID=" + studentID +'\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +'\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
