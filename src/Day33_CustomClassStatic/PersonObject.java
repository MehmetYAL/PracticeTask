package Day33_CustomClassStatic;

public class PersonObject {
    public static void main(String[] args) {

        Person person1=new Person("Mehmet",45,'M');
        Person person2=new Person("Ali",15,'M');

        System.out.println(person1);
        person1.eat(" T-bone");

        System.out.println(person2);
        person2.drink(" Water");
        System.out.println(person1.numberOfHead);
        System.out.println(person2.hasWings);

    }
}
