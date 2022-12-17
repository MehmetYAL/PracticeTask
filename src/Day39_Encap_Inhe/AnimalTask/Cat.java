package Day39_Encap_Inhe.AnimalTask;

public class Cat extends FriendlyAnimal{
    public Cat(String name, String size, String color, String breed, char gender, int age) {
        super(name, size, color, breed, gender, age, false, true, true);
    }
    public void scratch(){
        System.out.println(getName()+" is sctraching");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
