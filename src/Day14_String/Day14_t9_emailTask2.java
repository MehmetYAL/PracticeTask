package Day14_String;

public class Day14_t9_emailTask2 {
    public static void main(String[] args) {
        String email="craig_federighi@apple.com";
        String email2= email.substring(0,email.indexOf('_'));
        String email3=email.substring(email.indexOf('_')+1,email.indexOf('@'));
        String email4=email.substring(email.indexOf('@')+1,email.indexOf('.'));
        String email5=email2.substring(0,1).toUpperCase()+email2.substring(1).toLowerCase();
        String email6=email3.substring(0,1).toUpperCase()+email3.substring(1).toLowerCase();
        System.out.println("firtsName=" + email5);
        System.out.println("lastName= "+ email6);
        System.out.println("domainNmae= " +email4);

        /*Create a class called EmailTask2.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that will print out information about user based on
email. Print first name, last name, and domain.
First and Last name should be printed with proper format -
uppercase first letter and remaining lowercase.
Ex:
input:
craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
        */
    }
}
