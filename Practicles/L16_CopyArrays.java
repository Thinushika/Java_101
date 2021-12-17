import java.util.Arrays;

public class L16_CopyArrays {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6};
        int [] positiveNumbers = numbers; //copy array

        numbers[0] = -1; // changing first index value 1 to -1

        for(int number: positiveNumbers){
            System.out.print(number + ", ");
        }

        System.out.print("\n");


        // Using Looping Construct to copy arrays
        int [] source = {1,2,3,4,5,6};
        int [] destination = new int[6];

        for (int i = 0; i < source.length; ++i){
            destination[i] = source[i];
        }
        System.out.println(Arrays.toString(destination));

        // Using arraycopy() method
        int[] n1 = {2,3,12,4,12,-2};
        int[] n3 = new int[5];
        int[] n2 = new int[n1.length];

        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = "+ Arrays.toString(n2));

        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 = "+ Arrays.toString(n3));


        // Using copyOfRange() method
        int[] destination1 = Arrays.copyOfRange(source, 0, source.length);
        System.out.println("destination1 = " + Arrays.toString(destination1));

        int[] destination2 = Arrays.copyOfRange(source, 2, 5);
        System.out.println("destination2 = " + Arrays.toString(destination2));

    }
}
