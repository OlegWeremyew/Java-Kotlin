package syntax.lesson18;

public class ForDemo {
    public static void main(String[] args) {
        Integer sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            sum += 1;
        }
        System.out.println(sum);
    }
}
