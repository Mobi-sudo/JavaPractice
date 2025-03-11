import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator_with_Validation_Canbeimproved {
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
                if (principal > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer for the principal.");
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
                if (rate > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive number for the interest rate.");
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
                if (years > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer for the number of years.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
            }
        }

        int monthlyPayments = years * MONTHS;

        scanner.close();

        
        double result = principal * (interestRate * Math.pow(1 + interestRate, monthlyPayments))
                / (Math.pow(1 + interestRate, monthlyPayments) - 1);

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String totalMortgage = currencyFormat.format(result);

        System.out.println("Total Mortgage is " + totalMortgage);
    }
}
