package Day39_Encap_Inhe.DeviceTask;

public class Phone extends Device {

    public Phone(String brand, String model, double price) {
        super(brand, model, price);
        setPhoneNumber(phoneNumber);
    }

    private long phoneNumber;

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {


        this.phoneNumber = phoneNumber;
    }

    public void call(){
        System.out.println( getBrand()+" "+getModel()+" - "+phoneNumber+" is calling");

    }
    public void text(){
        System.out.println( getBrand()+" "+getModel()+" - "+phoneNumber+" is texting");

    }
}
