package Day39_Encap_Inhe.AnimalTask;

public class FriendlyAnimal extends Animal {

    private boolean isWild=false;
    private boolean isFriendly, isPlayable=true;

    public FriendlyAnimal(String name, String size, String color, String breed, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
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

    public void play(){
        System.out.println(getName()+ " is playing");
    }

    public void pet(){
        System.out.println(getName()+" is nice to petting");
    }

    @Override
    public String toString() {
        return "FriendlyAnimal{" +
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
	2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable
				Extra methods:
					play()
					pet()
 */