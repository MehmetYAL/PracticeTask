package Day39_Encap_Inhe.AnimalTask;

public class Animal {
    private String name,size,color,breed;
    private char gender;
    private int age;

    public Animal(String name, String size, String color, String breed, char gender, int age) {
       setName(name);
       setSize(size);
        setColor(color);
        setBreed(breed);
        setGender(gender);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null||name.isBlank()||name.isEmpty()){
            System.out.println("invalid enter");
            System.exit(1);
        }
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {

        this.size = size;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        if (color==null||color.isBlank()||color.isEmpty()){
            System.out.println("invalid enter");
            System.exit(1);
        }
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {

        if (breed==null||breed.isBlank()||breed.isEmpty()){
            System.out.println("invalid enter");
            System.exit(1);
        }
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='M'||gender=='F')){
            System.out.println("Please enter valid gender");
            System.exit(1);
        }

        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age<=0){
            System.exit(1);
        }
        this.age = age;
    }
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void sleep(){
        System.out.println(color+" "+name+ " is sleeping");
    }
    public void move(){
        System.out.println(name+" is moving fast an it's size is "+size);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
/*
1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields
					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative
			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()
 */