package Day39_Encap_Inhe.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog=new Dog("Lucy","XL","White","Husky",'M',5);
        Cat cat=new Cat("pamuk","ML","brown","norway",'M',8);
        Dolphin dolphin=new Dolphin("Susu","XXL","Black-White","ocean",'F',4);
        Eagle eagle=new Eagle("XL","Black-White","BJK",'M',120);
        Lion lion=new Lion("Large","GoldBrown","African",'M',12);
        Parrot parrot=new Parrot("M"," ","Amazon",'F',25);
        Tiger tiger=new Tiger("LArge","Brown","Asian",'F',3);


        System.out.println(dog);
        System.out.println(cat);
        System.out.println(dolphin);
        System.out.println(eagle);
        System.out.println(lion);
        System.out.println(parrot);
        System.out.println(tiger);

        dog.bark();
        lion.fight();
        eagle.flyHigh();
        dolphin.swim();
    }
}
