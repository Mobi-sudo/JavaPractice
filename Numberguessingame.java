import java.util.Random;
import java.util.Scanner;

public class Numberguessingame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randnum = random.nextInt(100) + 1;
        int guess;
        while(true){
            System.out.print("Enter a number to guess: ");
            if(sc.hasNextInt()){
                guess=sc.nextInt();
                if (guess < 1 || guess > 100) {
                    System.out.println("Enter a value between 1 - 100.");
                    continue;
                }
                if(guess == randnum){
                    System.out.println("Congrats on guessing the number!");
                    break;
                }else if(guess > randnum){
                    System.out.println("Number is Lower.");
                }else {
                    System.out.println("Number is higher.");
                }
            }else{
                System.out.println("Please enter a number.");
                sc.next();
            }
        }
        System.out.println("The random number is : "+ randnum);
    }
}
