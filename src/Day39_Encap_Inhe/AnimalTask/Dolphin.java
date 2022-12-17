package Day39_Encap_Inhe.AnimalTask;

public class Dolphin extends FriendlyAnimal{
    public Dolphin(String name, String size, String color, String breed, char gender, int age) {
        super(name, size, color, breed, gender, age,false, true, true);
    }

    public void swim(){
        System.out.println(getName()+" is love to swim");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
