import java.util.Scanner;

public class MoshExerciseSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number:");
        int num = scanner.nextInt();
        scanner.close();
        switch((num % 3 ==0 ? 1 :0) + (num % 5 ==0 ? 2:0)){
            case 1:
                System.out.println("Fuzz");
                break;
            case 2:
                System.out.print("Buzz");
                break;
            case 3:
                System.out.print("FuzzBuzz");
                break;
        }
    }
}
