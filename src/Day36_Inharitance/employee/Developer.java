package Day36_Inharitance.employee;

public class Developer extends Employee {
    public Developer(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }

    public void coding(){
        System.out.println(name + " is coding");

    }
    public void fixingBug(){
        System.out.println(name + " is fixing bugs");
    }
}
/*
Create the sub class of Employee named Developer:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				coding()
				fixingBugs()
				toString()
 */