package Day39_Encap_Inhe.StudentTask;

public class Person {
    private String name;
    private int age;
    private  char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null||name.isEmpty()){
            System.out.println("Invalid characters, please enter valida name");
            System.exit(1);

        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.out.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='M'||gender=='F')){
            System.exit(1);
        }
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is "+age+" years old, he/she is not drinking");
    }
    public void sleep(){
        System.out.println(name+ " is sleeping to much");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
