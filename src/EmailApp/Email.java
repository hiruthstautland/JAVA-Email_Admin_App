package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxStorage;
    private String alternateEmail;

    //Constructor, receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName +  " "  + this.lastName);

        //Call method to ask for department after after login
        this.department = setDep();
    }thsi
    //Ask for org/dep
    private String setDep(){
        System.out.print("Enter your department\n1 for Sales & Marketing \n2 Development \n3 Administration \n0 None");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if(departmentChoice == 1){
            return "Sales & Marketing";
        } else if (departmentChoice == 2){
            return "Development";
        } else if (departmentChoice == 3){
            return "Administration";
        } else {
            return "";
        }
    }

    //Generate a password (random)
    //Set mailbox storage
    //Set alternate email
    //Change password
    //GET method to display name, email and mailbox storage
}
