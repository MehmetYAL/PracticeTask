package Day14_String;

import java.util.Scanner;

public class day13T8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write your user name");
        String userName= input.next();
        System.out.println("enter your password");
        String password= input.next();
        input.close();
        if (userName.equals("Cydeo")&&password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else {
            System.out.println("Incorrect username or password");
        }input.close();
        /*You are writing a code for the log-in function of the Cybertek
Application, assume that your credentials are:
username: Cydeo
password: WoodenSpoon
Ask the user to enter their credentials. If credentials are
matched, your program should print "Logged in."
otherwise print "Incorrect username or password" as error message
Hints: In order to login, both username and password MUST
be correct
you will need to use equals() method*/
    }
}
