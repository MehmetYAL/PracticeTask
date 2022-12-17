package Day35_Encapsulation;

public class CarpetTask {
    private int width,length,unitPrice;
    private boolean isPersian;

    public CarpetTask(int width, int length, int unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setInitPrice(unitPrice);
        setPersian(isPersian);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width<=0){
            System.exit(0);
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length<=0){
            System.exit(0);
        this.length = length;
    }
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setInitPrice(int unitPrice) {
        if (unitPrice<=0){
            System.exit(0);
        this.unitPrice = unitPrice;
    }
    }
    public double calcCost(){

        double price = (width*length)*unitPrice;

        return isPersian? price+200 : price;
    }



    public boolean isPersian() {
        return isPersian;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }

    public String toString() {
        return "CarpetTask{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPriceOfCarpet=" + calcCost() +
                '}';
    }
}
/*
create a class named Carpet:
                private variables:
                        width, length, unitPrice, isPersian (boolean)
                Encapsulate all the fields:
                		Conditions:
                			width can not be negative
                			width can not be negative
                			unit price can not be negative

		Add a constructor to set all the instances
                instance methods:
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet = (width*length)*unitPrice
            if the carpet is persian  carpet, add 200$ to the totalPrice
 */