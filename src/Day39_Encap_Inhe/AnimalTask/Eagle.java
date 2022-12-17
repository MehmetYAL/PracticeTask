package Day39_Encap_Inhe.AnimalTask;

public class Eagle extends WildAnimal{
    public Eagle( String size, String color, String breed, char gender, int age ) {
        super("Eagle", size, color, breed, gender, age, true,false,false);
    }

    @Override
    public void hunt() {
        super.hunt();
    }

    public void flyHigh(){
        System.out.println(getName()+" is flying to highest");}
}
