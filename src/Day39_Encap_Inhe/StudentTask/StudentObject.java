package Day39_Encap_Inhe.StudentTask;

public class StudentObject {
    public static void main(String[] args) {

        Student student1=new Student("Alper",6,'M',47,"kres",'A',"Dumlupinar");
        GraduateStudent graduateStudent=new GraduateStudent("Burak",26,'M',14,"orman",'B',"Mudurnu");
        Undergraduate undergraduate=new Undergraduate("Songul",35,'F',1414,"english",'E',"Istanbul");
        CydeoStudent cydeoStudent=new CydeoStudent("Mehmet",45,'M',4714,"SDET",'B',"Cydeo",1414,11,"Java");


        System.out.println(student1);
        System.out.println(graduateStudent);
        System.out.println(undergraduate);
        System.out.println(cydeoStudent);

    }
}
