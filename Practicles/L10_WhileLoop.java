import java.util.Scanner;

public class L10_WhileLoop {
    public static void main(String[] args) {

        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = input.nextInt();

        while(num >= 0 ){
            sum += num;
            System.out.println("Enter a number : ");
            num = input.nextInt();
        }

        System.out.println("Sum = "+ sum);
        input.close();
    }
}
