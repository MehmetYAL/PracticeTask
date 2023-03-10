package Day35_Encapsulation;

public class T2_CredentialsObject {
    public static void main(String[] args) {
        T2_Credentials strong=new T2_Credentials("mehmet","Bjk&bjk1903");
        System.out.println(strong.isStrongPassword());
    }


}
/*
create a class named Credentials
            Variables:
                username, password
            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit
                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

 */