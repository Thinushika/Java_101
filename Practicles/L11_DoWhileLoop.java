import java.util.Scanner;

public class L11_DoWhileLoop {
    public static void main(String[] args) {
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = input.nextInt();

        do{
            sum += num;
            System.out.println("Enter a number : ");
            num = input.nextInt();
        }while(num >= 0 );

        System.out.println("Sum = "+ sum);
        input.close();
    }
}
