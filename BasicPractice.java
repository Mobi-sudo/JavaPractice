public class BasicPractice {
    // Practice Conditional Statements in java

    public static void main(String[] args){
        boolean isTrue = true;
        boolean isFalse = false;
        int number = 2;

        if(isTrue){
            System.out.println("it is true");
        }

        if(isFalse){
            
        } else {
            System.out.println("it is false");
        }

        if(isFalse){

        } else if(isTrue) {
            System.out.println("second else if statement is true");
        } else {

        }

        switch (number){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Invalid");
        }

        
        // printing
        // println means next line
        // print means printing everythin in a line
        System.out.println("aaaaaaa");
        System.out.println(10);
        System.out.println(10.3);
        System.out.println(true);

        System.out.print("aaaaaaa");
        System.out.print(10);
        System.out.print(10.3);
        System.out.print(true);

        // variables (declaration and assignment)

        // declaring data types and assigning
        int intdeclaration;                   // declaration
        intdeclaration = 30;                  // assignment

        int age = 11;               // integer (numbers)
        int age1 = 12;               // integer (numbers)
        int age2 = 13;               // integer (numbers)

        String name = "its me";
        String name1 = "its me";

        double crinkles = 12.12;    // numbers with decimal
        double crinkles1 = 12.123;    // numbers with decimal
        double crinkles2 = 12.1234;    // numbers with decimal

        boolean nohomo = false;     // boolean value true or false
        boolean ishomo = true;     // boolean value true or false

        char symbol = '!';
        char symbolc = '$';

        System.out.println(intdeclaration);

        System.out.println(age);
        System.out.println(age1);
        System.out.println(age2);

        System.out.println(symbolc);
    }
}