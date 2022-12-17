package Day33_CustomClassStatic;

public class T1_CydeoStudentsObjects {
    public static void main(String[] args) {



    T1_CydeoStudents student1=new T1_CydeoStudents("Mehmet",45,'M',1903,'B',"Eu10",11);
    T1_CydeoStudents student2=new T1_CydeoStudents("Yalcin",26,'M',2002,'A',"US1",47);

        System.out.println(student1);
        System.out.println(student2);
        student1.displayScoolName();
        student1.displayProgramLanguage();
}
}
