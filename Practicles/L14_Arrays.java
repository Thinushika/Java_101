public class L14_Arrays {
    public static void main(String[] args) {
        String[] arrayStr = new String[100];
        arrayStr[0] = "apple";
        arrayStr[1] = "orange";
        arrayStr[2] = "grape";

        System.out.println("2nd element of the array : "
        + arrayStr[1]);

        int[] age = {12, 4, 6};
        System.out.println("Using for Loop: ");
        for (int i = 0; i < age.length; i++){
            System.out.println(age[i]);
        } 

        
        System.out.println("Using for each Loop: ");
        for (int a : age){
            System.out.println(a);
        }

        // compute sum and avarage of numbers
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9,8, 12};
        int sum = 0;
        Double avarage;

        for( int num: numbers){
            sum += num;
        }
        int arrLength = numbers.length;
        avarage = ((double)sum/ (double)arrLength);

        System.out.println("Sum = "+ sum);
        System.out.println("Avarage = "+ avarage);
    }
}
