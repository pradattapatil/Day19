package Day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    static Scanner s = new Scanner(System.in);

    // Taking Input from User
    public static void main(String[] args) {
        System.out.println("Enter Email:");
        String email = s.next();
        String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(email);

        boolean result = matcher.matches();
        if(result){
            System.out.println("Valid Email");
        }
        else {
            System.out.println("Invalid Email");
        }
    }
}
