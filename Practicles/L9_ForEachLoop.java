
public class L9_ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = { 3, 9, 5, -5};
        int sum = 0;

        for(int number: numbers){
            sum += number;
        }
        System.out.println("Sum = " + sum);
    }
}
