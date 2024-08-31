package syntax.lesson5;

/**
 * @author OLEG
 * @version 1.1.1
 */

public class Variables {
    public static void main(String[] args) {
        // It 1 - Byte. Byte 2^8    0...255    -128...127
        Byte byteNumber = 127;
        // casting to byte
        Byte age1 = (byte) 255;
        System.out.println("The byte number: " + Integer.parseInt("11111111", 2));
        System.out.println(age1);

        // It 2 - Byte.  Short 2^16    0...65536.   -32768-32767
        // Short is Class.   short is primitive
        // Short oldAge = 500;
        short oldAge = 500;
        System.out.println("The short number: " + oldAge);


        // It 4 - Byte. Int 2^32    -2 billion... 2 billion
        // Integer is Class.   int is primitive
        //Integer intNumber = 5000000;
        int intNumber = 5000000;
        System.out.println("The integer number: " + intNumber);


        // It 8 - Byte. Int 2^64
        // Long is Class.   int is primitive
        // Long longNumber = 5000000000000000L;
        long longNumber = 5000000000000000L;  // "L" is mean long integer
        System.out.println("The long number: " + longNumber);


        //float. It 4 Byte
        float floatNumber = 5.0f;
        System.out.println("The float number: " + floatNumber);

        //double. It 4 Byte
        double doubleNumber = 1231235.000234234;
        System.out.println("The double number: " + doubleNumber);


        // Infinities
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.POSITIVE_INFINITY);

        // it will error here
        //System.out.println(Double.isNaN(23/0));
        // it will correct in Double format
        System.out.println(Double.isNaN(23/0.0));


        // char
        char charSymb = 'A';
        System.out.println("The char var: " + charSymb);


        var varValue = 10L;
        int first, second;
        first = 10;
        second = 12;
    }
}