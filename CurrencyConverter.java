import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peso = 0;
        while(true){
            System.out.print("Enter Peso amount: ");
            if(scanner.hasNextInt()){
                peso = scanner.nextInt();
                break;
            }else{
                System.out.println("Invalid input. Only Number value is allowed");
            }                  
        }

        System.out.print("Pick USDT Or Yen For Conversion: ");
        String Moneytoconvert = scanner.next();
        switch(Moneytoconvert.toUpperCase()){
            case "USDT":
                if(peso >= 50){
                    int usdt = peso / 50;
                    System.out.println("Total USDT converted: " + usdt);
                }else{
                    System.out.println("Please input atleast 50 or above.");
                }
                break;
            case "Yen":
                System.out.println("Enter Peso Amount to convert for Yen: ");
                if(peso>= 1){
                    double yen = peso/0.39;
                    System.out.println("Total Yen Converted: " + yen);
                }else{
                    System.out.println("Please input at least 1 or above");
                }
                break;
        }
        scanner.close();
    }   
}
