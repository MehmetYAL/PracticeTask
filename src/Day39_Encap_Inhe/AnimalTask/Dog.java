package Day39_Encap_Inhe.AnimalTask;

public class Dog extends FriendlyAnimal{
    public Dog(String name, String size, String color, String breed, char gender, int age  ) {
        super(name, size, color, breed, gender, age, false, true, true);
    }

    public void bark(){
        System.out.println(getName()+" is barking everydays");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
/*
4. Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()

			2. Cat:
					Extra methods:
						scratch()
						meow()

			3. Dolphin:
					Extra methods:
						swim()

			4. Parrot:
					Extra methods:
						fly()
						sing()
 */