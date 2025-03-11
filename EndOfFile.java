
import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;

        while (sc.hasNext()) { // Read until EOF
            String line = sc.nextLine(); // Read one line
            System.out.println(lineNumber + " " + line); // Print line number and content
            lineNumber++; // Increment line number
        }

        sc.close();
    }
}
