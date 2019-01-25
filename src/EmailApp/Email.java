package EmailApp;

//Produce new company-email and password
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String companyName = "Amazing.no";              //??
    private String email;
    private String mailboxStorage = "50 GB";
    private int defaultpasswordLength = 8;          //??
    private String alternateEmail;

    //Constructor, receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email eier: " + this.firstName +  " "  + this.lastName);

        //Call method to ask for department after after login
        this.department = setDep();
       // System.out.println("Department: " + this.department);

        //Combine to create
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companyName.toLowerCase();
        System.out.println("Din nye jobb email: " + this.email);

        //Call a method that returns a random password
        this.password = randomPassword(defaultpasswordLength);
        System.out.println("Ditt passord: " + this.password);
    }

    //Ask for org/dep
    private String setDep(){
        System.out.print("Avdelingskoder\n1 Salg & Marked\n2 Utvikling\n3 Administration\n4 Økonomi\n0 Ingen\nTast inn ditt avdelingsnummer: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if(departmentChoice == 1){
            return "Salg & Marked";
        } else if (departmentChoice == 2){
            return "Utvikling";
        } else if (departmentChoice == 3){
            return "Administration";
        } else if (departmentChoice == 4){
            return "Økonomi";
        } else {
            return "";
        }
    }

    //Generate a password (random)
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅabcdefghijklmnopqrstuvwxyzæøå0123456789";
        char [] password = new char [length];
        for (int i = 0; i < length ; i++){
            int randomValue = (int)(Math.random()* passwordSet.length());
            password[i] = passwordSet.charAt(randomValue);
           // System.out.println(randomValue);
          //  System.out.println(passwordSet.charAt(randomValue));
        }
        return new String(password);
    }

    //Set mailbox storage
    public void setMailboxStorage (String storage){
        this.mailboxStorage = storage;
    }
    //Set alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    //Change password
    public void changePassword(String password){
        this.password = password;
    }
    public String getMailboxStorage(){
        return mailboxStorage;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }

    public String emailInfo(){
        return  "NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX STORAGE: " + mailboxStorage
                ;
    }


}
