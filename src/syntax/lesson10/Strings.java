package syntax.lesson10;

public class Strings {
    public static void main(String[] args) {

        String strName = "Oleg1";
        String strConstructor = new String("Oleg2");
        System.out.println(strName + " " + strConstructor);

        //equals
        String firstStr = "Hello";
        var secondStr = "World!";
        var thirdStr = "world!";
        var fourthStr = "world!";
        System.out.println(strName.equals(strConstructor));
        System.out.println(firstStr.equals(secondStr));
        System.out.println("with check register: " + secondStr.equals(thirdStr));
        System.out.println("ignore register: " + secondStr.equalsIgnoreCase(thirdStr));

        //length
        System.out.println("thirdStr length: " + thirdStr.length());

        //get substring
        System.out.println("thirdStr sybstring: " + thirdStr.substring(2));
        System.out.println("thirdStr sybstring: " + thirdStr.substring(2,4));
        System.out.println("thirdStr sybstring: " + thirdStr.substring(thirdStr.indexOf("o")));


        // is exist substring
        System.out.println("contains: " + thirdStr.contains(secondStr));
        System.out.println("contains: " + "this str consist world!".contains(fourthStr));

        //cases
        String newUpperStr = fourthStr.toUpperCase();
        System.out.println("upper: " + newUpperStr);
        System.out.println("lower: " + fourthStr.toLowerCase());

        //trim spaces
        var login = "  test_12. ";
        System.out.println(login);
        String strAfterTrimSpaces = login.trim();
        System.out.println(strAfterTrimSpaces);

        //replace
        var loginAfterReplace = login.trim().replace('_', '.');
        System.out.println("loginAfterReplace: " + loginAfterReplace);

        //stringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world");
        sb.append("-");
        sb.append("1212");
        System.out.println("sb: " + sb);
    }
}