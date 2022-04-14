package Day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileFormat {
    static Scanner s = new Scanner(System.in);

    // Taking Input from User
    public static void main(String[] args) {
        System.out.println("Enter Phone Number:");
        String phoneNumber = s.next();
        String regex = "^[1-9]{2}\\s[0-9]{10}$";

    Pattern p = Pattern.compile(regex);
    Matcher matcher = p.matcher(phoneNumber);

    boolean result = matcher.matches();
        if(result){
        System.out.println("Valid Mobile No");
    }
        else {
            System.out.println("Invalid Mobile No");
        }
    }
}
