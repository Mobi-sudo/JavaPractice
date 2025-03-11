import java.util.Scanner;
import java.util.regex.*;
public class validation {
    private Pattern regPattern;
    private Matcher regMatcher;
    public String isValidEmail(String email) {
        regPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        regMatcher   = regPattern.matcher(email);
        if(regMatcher.matches()) {
            return "Valid Email Address";
        } else {
            return "Invalid Email Address";
        }   
    }
    public String isValidContact(String contact){
        regPattern = Pattern.compile("^[0-9]{11}$");
        regMatcher   = regPattern.matcher(contact);
        if(regMatcher.matches()) {
            return "Valid Mobile Number";
        } else {
            return "Invalid Mobile Number";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Email: ");
        String eaddress = scanner.next();
        System.out.print("Enter contact: ");
        String cnum = scanner.next();
        validation valid = new validation();
        System.out.println(valid.isValidEmail(eaddress));
        System.out.println(valid.isValidContact(cnum));
        scanner.close();
    }
}
