package Day39_Encap_Inhe.AnimalTask;

public class Lion extends WildAnimal{
    public Lion( String size, String color, String breed, char gender, int age) {
        super("Lion", size, color, breed, gender, age, true, false, false);
    }

    @Override
    public void hunt() {
        super.hunt();
    }
    public void fight(){
        System.out.println(getName()+" is fighting against tigers");
    }
}
