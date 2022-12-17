package Day31_Constructor;

public class T1_SalaryCalculator {
    public String name;
    public double hourlyRate;
    public double stateTax;
    public double federalTax;
    public double weeklyHours;

    public T1_SalaryCalculator(String name, double hourlyRate, double stateTax, double federalTax, double weeklyHours) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.stateTax = stateTax;
        this.federalTax = federalTax;
        this.weeklyHours = weeklyHours;
    }
public double salary(){

        return  ( hourlyRate * weeklyHours * 52);
}
public double stateTax(){
        return (salary()*stateTax);
}
public double federalTax(){
        return (salary()*federalTax);
}
public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
}

    public String toString() {
        return "T1_SalaryCalculator{" +
                "name='" + name + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", stateTax=" + stateTax +
                ", federalTax=" + federalTax +
                ", weeklyHours=" + weeklyHours +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }
}
/*
1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */