import java.util.Scanner;

public class L4_InputOutput {
    public static void main(String[] args) {
        // output
        System.out.println("1. println ");
        System.out.println("2. println ");

        System.out.print("1. print ");
        System.out.print("2. print ");

        Double number1 = -10.6;
        System.out.println(5);
        System.out.println(number1);

        System.out.println("I am "+"awesome.");
        System.out.println("Number = "+ number1);

        // Input
        //create an object of scanner
        Scanner input = new Scanner (System.in);
        // take input from the user
        System.out.println("Enter your luckey number : ");
        int number= input.nextInt();
        System.out.println("You entered : "+ number);
        

        //float input
        System.out.println("Enter your float number : ");
        float numberfloat= input.nextFloat();
        System.out.println("You entered : "+ numberfloat);

        //double input
        System.out.println("Enter your Double number : ");
        double numberDouble= input.nextDouble();
        System.out.println("You entered : "+ numberDouble);

        // String input
        System.out.println("Enter your String number : ");
        String numberString= input.next();
        System.out.println("You entered : "+ numberString);

        // closing the scanner object
        input.close();
    }
}
