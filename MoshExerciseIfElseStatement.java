import java.util.Scanner;

public class MoshExerciseIfElseStatement {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = scanner.nextInt();
        scanner.close();
      if(num % 3 ==0 && num % 5==0){
          System.out.println("FuzzBuzz");
      } else if (num % 3 ==0) {
          System.out.println("fuzz");
      }else if (num % 5 ==0){
          System.out.println("buzzz");
      }else{
          System.out.println("Not divisible by 3 or 5");
      }
    }
}
