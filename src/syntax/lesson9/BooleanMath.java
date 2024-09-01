package syntax.lesson9;

public class BooleanMath {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        boolean c = a > b; //true
        boolean d = a == b; //false

        boolean logicalAND = c && d;
        boolean logicalOR = c || d;

        System.out.println(logicalAND);
        System.out.println(logicalOR);
    }
}