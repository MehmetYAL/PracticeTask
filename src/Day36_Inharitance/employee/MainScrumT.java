package Day36_Inharitance.employee;

public class MainScrumT {
    public static void main(String[] args) {
        Tester tester1=new Tester("Veli","QA",'M',35,123,99000);

        Developer developer1=new Developer("Mustafa","Developer",'M',35,456,120000);

        ScrumMaster scrumMaster1=new ScrumMaster("Akkaya","Scrum Master",'M',35,789,100000);

        ScrumTeam myTeam=new ScrumTeam("Ahmet","Seyfi","Ali");

        myTeam.addTester(tester1);
        myTeam.addDeveloper(developer1);

        System.out.println(myTeam);
        System.out.println(tester1.salary);
        System.out.println(developer1.age+" years old "+developer1.salary);
    }
}
