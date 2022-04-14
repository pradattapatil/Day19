package Day19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidFirstName {
    static Scanner s= new Scanner(System.in);

    public static void main(String[] args) {
        // Taking Input from User
        System.out.println("Enter Name:");
        String name= s.next();
        if(name == null || name.isEmpty()){
            System.out.println("Invalid");
        }
        // Regex Pattern
        String nameregex = "^[A-Z][a-z]{2,}";
        // Checking the Pattern with Input
        Pattern pattern =Pattern.compile(nameregex);
        if(pattern.matcher(name).matches()){
            System.out.println("Valid Name");
        }
        else {
            System.out.println("Invalid Name");
        }
    }

}
