package Day36_Inharitance.employee;

import java.util.ArrayList;

public class ScrumTeam {
    public ArrayList<Tester> testers=new ArrayList<>();
    public ArrayList<Developer> developers=new ArrayList<>();
   // public ArrayList<ScrumMaster> scrumMasters=new ArrayList<>();
    public String PO,PM,BA;


    public ScrumTeam(String PO, String PM, String BA) {
        this.PO = PO;
        this.PM = PM;
        this.BA = BA;
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }


    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", PM='" + PM + '\'' +
                ", BA='" + BA + '\'' +
                ", testers='" + testers.size() + '\'' +
                ", Developers='" + developers.size() + '\'' +
                '}';
    }

}
