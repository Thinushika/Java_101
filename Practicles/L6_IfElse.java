import java.util.Scanner;

public class L6_IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Marks to grade : ");
        int marks = input.nextInt();

        if (marks > 90){
            System.out.println("Congradulations! You got grade A.");
        }else if(marks >75){
            System.out.println("Awsome! You got grade B.");
        }else if(marks > 65){
            System.out.println("Good! You got grade C. Need to work hard.");
        }else{
            System.out.println("Sorry! It is F. work hard and Do it better in next time.");
        }

        input.close();
    }
}
