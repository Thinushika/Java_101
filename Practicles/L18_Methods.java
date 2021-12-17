public class L18_Methods {

    public int addNumbers(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int square(int num){
        return num*num;
    }

    public void square1(int a){
        int squar = a*a;
        System.out.println("Square is: "+squar);
    }

    public static void main(String[] args) {
        int num1 = 38;
        int num2 = 84;
        L18_Methods LM = new L18_Methods();
        int result = LM.addNumbers(num1, num2);
        System.out.println("Sum is : " + result);

        
        int sqResult;
        sqResult = square(10);
        System.out.println("Squared value is : " + sqResult);


        LM.square1(20);

        System.out.println("Square root is: " + Math.sqrt(100));
    }
}
