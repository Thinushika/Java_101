import java.util.Scanner;

public class L7_SwitchStatement {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Item list: apple, pencil, cake, banana, umbrella.\nEnter Your Item to discount : ");
        String item = input.next();

        switch (item){
            case "apple":
                System.out.println("You got 20% discount..");
                break;
            case "pencil":
                System.out.println("You got 10% discount..");
                break;
            case "cake":
                System.out.println("You got 40% discount..");
                break;
            case "banana":
                System.out.println("You got 36% discount..");
                break;
            case "umbrella":
                System.out.println("You got 5% discount..");
                break;
            default:
                System.out.println("Unknown item, Try again..");
                break;
        }
        input.close();

    }
}
