package Day39_Encap_Inhe.AnimalTask;

public class Parrot extends FriendlyAnimal{
    public Parrot( String size, String color, String breed, char gender, int age) {
        super("Parrot", size, color, breed, gender, age,false, true, true);
    }

    public void fly(){
        System.out.println(getName()+" is not a really like to fly");
    }
    public void sing(){
        System.out.println(getName()+ " like speaks more than singing");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
