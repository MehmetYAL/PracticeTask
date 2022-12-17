package Day31_Constructor;

public class T2_Address {
    public  String name;
    public  String buildingNo;
    public  String street;
    public  String city;
    public  String state;
    public  int zipCode;

    public T2_Address(String name, String buildingNo, String street, String city, String state, int zipCode) {
        this.name = name;
        this.buildingNo = buildingNo;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
            }


    public String toString() {
        return "T2_Address{" +
                "name='" + name + '\'' +
                ", buildingNo='" + buildingNo + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
