
public class L3_Operators {
    public static void main(String[] args) {
        
        // Arithmatic operators
        int a = 12, b = 5;

        System.out.println("a + b = "+ (a + b) +
        "\na - b = "+ (a - b)+
        "\na * b = "+ (a * b)+
        "\na / b = "+ (a / b)+
        "\na % b = "+ (a % b));

        // Assignment operators
        int x = 4;
        int var;

        var = x;
        System.out.println("Var using = :" + var);
        var += x;
        System.out.println("Var using += :" + var);
        var *= x;
        System.out.println("Var using *= :" + var);

        // Relational Operators 
        int r =7, s = 11;
        System.out.println("a is " + r + "and b is " + s);
        System.out.println("a == b : "+(a == b)+
        "\na != b : "+(a != b)+
        "\na < b : "+(a < b) +
        "\na > b : "+(a > b) +
        "\na >= b : "+(a >= b) +
        "\na <= b : "+(a <= b));

        // Logical operators
        System.out.println("(5>3) && (8>5) :" + ((5>3)&&(8>5)) + 
        "\n(5>3) && (8<5) :" + ((5>3)&&(8<5)) + 
        "\n(5<3) || (8>5) :" + ((5<3)||(8>5)) + 
        "\n(5<3) || (8<5) :" + ((5<3)||(8<5)) + 
        "\n(!(5==3)) :" + (!(5==3)) + 
        "\n(!(5>3)) :" + (!(5>3)));


        // Unary operators
        int p = 12, q = 12;
        int result1, result2;
        result1 = ++p;
        result2 = --q;

        System.out.println("Value of p : " + p +
        "\nAfter increment : " + result1 +
        "\nValue of q : " + q +
        "\nAfter decrement : "+ result2);

        // Ternary operators
        int februaryDay = 29;
        String result;

        result = (februaryDay == 28) ? "Not a leap year " : "Leap year ";
        System.out.println(result);
    }
}
