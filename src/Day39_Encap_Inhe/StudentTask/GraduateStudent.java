package Day39_Encap_Inhe.StudentTask;

public class GraduateStudent extends Student {


    public GraduateStudent(String name, int age, char gender, int studentID, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentID, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        super.study();
    }

    public String toString() {
        return "GraduateStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentID=" + getStudentID() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", grade=" + getGrade() +'\'' +
                ", schoolName='" + getSchoolName() + '\'' +
                '}';
    }

}
