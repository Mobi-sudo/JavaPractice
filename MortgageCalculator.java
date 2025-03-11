import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte percentage = 100;
        final byte months = 12;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal:");
        int principal = scanner.nextInt();

        System.out.print("Interest Rate:");
        float rate = scanner.nextFloat();
        float interestrate = rate/percentage/months;

        System.out.print("Years:");
        int years = scanner.nextInt();
        int monthly = years * months;

        try{
            scanner.remove();
        } catch(UnsupportedOperationException e ){
            System.out.println("Remove method is not supported.");
        }
        scanner.close();

        double result = principal*(interestrate*Math.pow(1+interestrate,monthly))/(Math.pow(1+interestrate,monthly)-1);

        NumberFormat payment = NumberFormat.getCurrencyInstance();
        String topay = payment.format(result);
        System.out.println("Total Mortgage is "+topay);

    }
}
