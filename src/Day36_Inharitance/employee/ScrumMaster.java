package Day36_Inharitance.employee;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }

    public void meeting(){
        System.out.println(name+" is preparing grooming meeting");
    }
}
