package Practice_rondom;

import java.util.Scanner;

public class LogInFunction {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your email");
        String email= input.next();
        System.out.println("enter your password");
        String pass= input.next();
        if (email.equals("Cydeo")&&pass.equals("WoodenSpoon")){
            System.out.println("LoggedIn");}
else {
            for (int i = 0; i < 3; i++) {
              System.out.println("Incorrect,please re enter your email and password and");
email= input.next();
pass= input.next();

                if (email.equals("Cydeo")&&pass.equals("WoodenSpoon")){
                    System.out.println("LoggedIn");
                break;}

            }if (!(email.equals("Cydeo") && pass.equals("WoodenSpoon"))){
                System.out.println("your email has been locked, email to support tem");
            }
        }
        /*
        ou are writing a code for the log-in function of the Cydeo Application,
        assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

         Ask the user to enter their credentials
            If credentials are matched, your program should print "Logged in."
          If the credentials are not matched, the program should allow the
            user to have three attempts to enter correct credentials and
         if all three attempts are failed, then print "Your account is locked."
         */
    }
}
