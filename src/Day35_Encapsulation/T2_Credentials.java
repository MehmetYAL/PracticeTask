package Day35_Encapsulation;

public class T2_Credentials {
    private String userName;
    private String password;

    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getPassword(){
        return password;}
    public void setPassword(String password){

                    this.password=password;
    }

    public T2_Credentials(String userName, String password) {
        setUserName(userName);
setPassword(password);    }


    public String toString() {
        return "T2_Credentials{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public boolean isStrongPassword(){
        boolean r1=password.length()>=8&&!password.contains(" ");
        boolean r2=false;
        boolean r3=false;
        boolean r4=false;
        boolean r5=false;

        for (char each: password.toCharArray() ) {
            if (Character.isUpperCase(each)){
                r2=true;
            }
           else if (Character.isLowerCase(each)){r3=true;}
            else if (Character.isDigit(each)) {r4=true;     }
            else  {r5=true;

            }

        }return r1&&r2&&r3&&r4&&r5;


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