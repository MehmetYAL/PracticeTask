package Day39_Encap_Inhe.AnimalTask;

public class WildAnimal extends Animal {
    private boolean isWild=true;
    private boolean isFriendly, isPlayable=false;

    public WildAnimal(String name, String size, String color, String breed, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, size, color, breed, gender, age);
        setWild(isWild);
        setFriendly(isFriendly);
        setWild(isWild);
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public void hunt(){
        System.out.println(getName()+" is good in hunting");
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "name='" + getName() + '\'' +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}
/*
3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable
				Extra Methods:
					hunt()
 */