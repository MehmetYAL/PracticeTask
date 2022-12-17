package Day35_Encapsulation;

public class CarpetObject {
    public static void main(String[] args) {
        CarpetTask carpet1=new CarpetTask(2,3,45,true);
        System.out.println(carpet1);
        carpet1.setPersian(true);
        carpet1.setLength(5);
        carpet1.setWidth(3);
        carpet1.setInitPrice(8);
        System.out.println(carpet1);
    }
}
