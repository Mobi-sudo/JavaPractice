import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick USDT Or Yen For Conversion: ");
        String Moneytoconvert = scanner.next();
    
        switch(Moneytoconvert.toUpperCase()){
            case "USDT":
                while (true) {
                    System.out.println("Enter peso Amount to convert for USDT: ");
                    int pesousdt = scanner.nextInt();
                    if(pesousdt >= 50){
                        int usdt = pesousdt / 50;
                        System.out.println("Total USDT converted: " + usdt);
                        break;
                    }else{
                        System.out.println("Please input atleast 50 or above.");
                    }
                    break;
                }
            case "Yen":
                System.out.println("Enter Peso Amount to convert for Yen: ");
                int pesoyen = scanner.nextInt();
                if(pesoyen>= 1){
                    double yen = pesoyen/0.39;
                    System.out.println("Total Yen Converted: " + yen);
                    break;
                }else{
                    System.out.println("Please input at least 1 or above");
                }
                break;
        }
        scanner.close();
    }   
}
