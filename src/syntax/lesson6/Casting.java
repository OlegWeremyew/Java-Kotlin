package syntax.lesson6;

public class Casting {
    public static void main(String[] args) {

        byte byteNumber = 12;
        short varForCasting = byteNumber;
        System.out.println("varForCasting after Casting: " + varForCasting);

        int intForCasting = byteNumber;
        System.out.println("varForCasting after Casting: " + intForCasting);

        int intCastingStart = 6_000_012;
        // it will error here
        //byte byteNumTest = intCastingStart;
        // it is correct, but with date lose after casting
        byte byteNumTest = (byte) intCastingStart;
        System.out.println("byteNumTest after safe Casting from Integer to Byte: " + byteNumTest);

        double doubleNumTest = 4.12;
        int intFromDoubleTest = (int) doubleNumTest;
        System.out.println("byteNumTest after safe Casting from Double to Integer: " + intFromDoubleTest);

        final var nameTest = "oleg";
        // below will be error
        // nameTest = "1994";
    }
}