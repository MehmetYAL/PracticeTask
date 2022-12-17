package Day35_Encapsulation;

public class T3_BankAccountObject {
    public static void main(String[] args) {
        T3_BankAccount customer1=new T3_BankAccount("mehmet",12345,1000);
        customer1.deposite(1020);
        customer1.witDraw(520);
        customer1.getBalance();
        System.out.println(customer1.getBalance());
    }
}
