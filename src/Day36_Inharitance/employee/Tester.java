package Day36_Inharitance.employee;

public class Tester extends Employee{
    public Tester(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }

    public void testing() {
        System.out.println(name+" is testing");

    }
    public void creatingTicket(){
        System.out.println(name+ " is creating ticket" + salary);
    }
}
/*
Create the sub class of Employee named Tester:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				testing()
				creatingTicket()
 */