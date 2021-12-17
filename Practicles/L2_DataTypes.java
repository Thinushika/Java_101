public class L2_DataTypes {
    public static void main(String[] args) {
        // boolean 
        boolean flag = true;

        // byte 
        byte range; 
        range = 124;

        // short
        short temperature;
        temperature = -200;

        //int 
        int value = -4250000;

        // long 
        long longvalue = -423322000000L;

        // double 
        double number = -42.5;

        //float - 32bit 
        float floatnum = -42.6f;

        // char - 16bit unicode character 
        // min value - '\u0000'
        // max value - '\uffff'
        char letter_t1 = '\u0051';
        char letter_t2 = '9';
        char letter_t3 = 75;

        // String
        String myString = "I'm Thinushika";

        System.out.println(
            "This is boolean data type : " + flag +
            "\nThis is byte data type : "+ range +
            "\nThis is short data type : "+ temperature +
            "\nThis is int data type : "+ value +
            "\nThis is long data type : "+ longvalue +
            "\nThis is double data type : "+ number +
            "\nThis is float data type : "+ floatnum +
            "\nThis is Char data type 1 : "+ letter_t1 +
            "\nThis is Char data type 2 : "+ letter_t2 +
            "\nThis is Char data type 3 : "+ letter_t3 +
            "\nThis is String data type : "+ myString);
    }
}
