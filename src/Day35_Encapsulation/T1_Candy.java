package Day35_Encapsulation;

public class T1_Candy {
    private String brandName;
     private int quantity;
     private double price;
     private boolean hasPeanuts;

    public T1_Candy(String brandName, int quantity, double price, boolean hasPeanuts) {
        setBrandName(brandName);
        setQuantity(quantity);
        setHasPeanuts(hasPeanuts);
        setPrice(price);
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<=0){
            System.exit(0);
        }
        this.quantity = quantity;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        if (price==0){
            System.out.println("free");
        }
        else if (price<1){
            System.exit(0);
        }
        this.price = price;
    }
public double calcost(){
        return quantity*price;
}
    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public String toString() {
        return "T1_Candy{" +
                "brandName='" + brandName + '\'' +
                ", quantity=" + quantity +
                ", price=" +((price==0)?"free" :+ price) +
                ", totalPrice=" +((calcost()==0)?"free" :+ calcost()) +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;

    }
}
/*
 Create a custom class named Candy
                private variables:
                    brand (String), quantity (int), price (double), hasPeanuts (boolean)

                Encapsulate All the private fields
                        (price of candy can not be set to negative)
                        (quantity of candy can not be set to zero or negative)

                Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

                Extra methods:
                    toString():
                        if the price is zero, print "free" instead of 0
 */