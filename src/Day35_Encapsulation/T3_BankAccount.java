package Day35_Encapsulation;

public class T3_BankAccount {

    private String accountHolder;
    private double accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposite(double amount){
        if (amount<=0){
            System.out.println("deposit amount can not be negative or zero");
            System.exit(1);
        }
        System.out.println("depositing $" + amount+"to the account"+accountNumber);
        balance+=amount;

    }
    public void witDraw(double amount){
        if (amount<=0){
            System.out.println("deposit amount can not be negative or zero");
            System.exit(1);
        }
        if (balance<=0){
            System.out.println("Insufficient balance");
        }balance-=amount;
    }

    public T3_BankAccount(String accountHolder, double accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "T3_BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
/*
create a class named T3_BankAccount
        Private variables:
            accountHolder, accountNumber, balance

        encapsulate all the fields

        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()

            DO NOT duplicate any code fragments

 */