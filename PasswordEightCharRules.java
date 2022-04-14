package Day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordEightCharRules {
    static Scanner s = new Scanner(System.in);

    // Taking Input from User
    public static void main(String[] args) {
        System.out.println("Enter Password:");
        String password = s.next();
        String regex = "^[a-zA-z1-9]{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(password);

        boolean result = matcher.matches();
        if(result){
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
    }
}
