package syntax.lesson19;

public class Function {
    public static void main(String[] args) {
        System.out.println("The sum of numbers 15 and 35 " + sumOfNumbers(15, 35));
        System.out.println("The multiply of numbers 23 and 45 " + multiplyOfNumbers(23, 45));
    }

    public static long sumOfNumbers(Integer a, Integer b) {
        return a + b;
    }

    private static long multiplyOfNumbers(Integer a, Integer b) {
        return a * b;
    }
}

//public class NewClass() {
//    public static void main(String[] args) {
//        Long sum = Function.sumOfNumbers(5, 10);
//        System.out.println(sum);
//    }
//}
