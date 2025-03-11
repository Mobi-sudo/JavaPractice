import java.util.Scanner;

public class Switch{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type of user:");
        String user = scanner.next();
        scanner.close();
        switch(user){
            case "admin":
                System.out.println("you are an admin");
                break;
            case "User":
                System.out.println("you are a User");
                break;
            default:
                System.out.println("You are a guest");
        }
    }
}