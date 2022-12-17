package Day39_Encap_Inhe.StudentTask;

public class CydeoStudent extends Student{

    public CydeoStudent(String name, int age, char gender, int studentID, String fieldOfStudy, char grade, String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentID, fieldOfStudy, grade, schoolName);
       setBatchNumber(batchNumber);
      setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    private int batchNumber;
    private int groupNumber;
    private String programmingLanguage;

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber<=0){System.exit(1);}

        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber<=0){System.exit(1);}
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage.isEmpty()){
            System.out.println("Can not be empty");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public void eat() {
        System.out.println(getName()+ " is studying");
    }

    public void drink() {
        super.drink();
    }

    public void sleep() {
        super.sleep();
    }

    @Override
    public void study() {
        System.out.println(getName()+" is studying "+ programmingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +'\'' +
                ", gender=" + getGender() +'\'' +
                "studentID=" + getStudentID() +'\'' +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", grade=" + getGrade() +'\'' +
                ", schoolName='" + getSchoolName() + '\'' +
                "batchNumber=" + batchNumber +'\'' +
                ", groupNumber=" + groupNumber +'\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
