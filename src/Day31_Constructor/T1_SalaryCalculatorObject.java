package Day31_Constructor;

public class T1_SalaryCalculatorObject {
    public static void main(String[] args) {
      T1_SalaryCalculator employee1= new T1_SalaryCalculator("mehmet",18,0.35,0.15,45);
      T1_SalaryCalculator employee2= new T1_SalaryCalculator("ali",15,0.35,0.15,55);

        System.out.println(employee1.name+" : "+employee1.salaryAfterTax());
        System.out.println(employee2.name+" : "+employee2.salaryAfterTax());


    }
}
