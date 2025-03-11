import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgagecalculator2 {
    public static void main(String[] args) {
        final byte PERCENTAGE = 100;
        final byte MONTHS = 12;
        Scanner scanner = new Scanner(System.in);
    
        int principal;
        float rate ;
        int years ;
    
        while (true) {
            System.out.print("Principal: ");
            if (scanner.hasNextInt()) {
                principal = scanner.nextInt();
                if (principal >= 1000 && principal<= 1000000) {
                    break;
                } else {
                    System.out.println("Enter a value between 1000 and 1000000.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
            }
        }

        while (true) {
            System.out.print("Interest Rate: ");
            if (scanner.hasNextFloat()) {
                rate = scanner.nextFloat();
                if (rate > 0 && rate <= 30) {
                    break;
                } else {
                    System.out.println("Enter a interest rate value that is greater than 0 and less than or equal to 30.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); 
            }
        }

        float interestRate = rate / PERCENTAGE / MONTHS;

        while (true) {
            System.out.print("Years: ");
            if (scanner.hasNextInt()) {
                years = scanner.nextInt();
                if (years >= 1 && years <=30 ) {
                    break;
                } else {
                    System.out.println("Enter a value of years between 1 to 30.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
            }
        }
        scanner.close();

        int monthlyPayments = years * MONTHS;

          double result = principal * (interestRate * Math.pow(1 + interestRate, monthlyPayments))
                / (Math.pow(1 + interestRate, monthlyPayments) - 1);

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String totalMortgage = currencyFormat.format(result);

        System.out.println("Total Mortgage is " + totalMortgage);
    } 
}
