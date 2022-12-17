package Day39_Encap_Inhe.DeviceTask;

public class Device {
    private String brand,model;
    private double price;
    public boolean hasBattery, hasPowerButton=true;

    public Device(String brand, String model, double price) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand==null||brand.isEmpty()||brand.isBlank()){
            System.out.println("invalid brand");
        }
        System.exit(1);

        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model==null||model.isEmpty()||model.isBlank()){
            System.out.println("invalid brand");
        }
        System.exit(1);
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.out.println("invalid number, please enter correct numbers for price");
            System.exit(1);
        }
        this.price = price;
    }


    public void turnON(){
        System.out.println( brand+", "+model+" turn ons");
            }
            public void turnOFF(){
                System.out.println( brand+", "+model+" turns Off");
            }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                 '}';
    }
}
