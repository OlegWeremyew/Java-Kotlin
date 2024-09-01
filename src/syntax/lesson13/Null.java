package syntax.lesson13;

public class Null {
    public static void main(String[] args) {

        String emptyStr = "";
        int nullableInt = 0;
        System.out.println("value " + emptyStr);
        System.out.println("value " + nullableInt);

        String nullableStr;
        // it error because not value
        //System.out.println("value " + nullableStr);

        nullableStr = null;
        System.out.println("value " + nullableStr);

        // it cause error, null not have any methods
        //System.out.println("value " + nullableStr.length());


    }
}
