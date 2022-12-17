package Day39_Encap_Inhe.AnimalTask;

public class Tiger extends WildAnimal{
    public Tiger( String size, String color, String breed, char gender, int age) {
        super("Tiger" ,size, color, breed, gender, age, true,false,false);
    }

    @Override
    public void hunt() {
        super.hunt();
    }
}
