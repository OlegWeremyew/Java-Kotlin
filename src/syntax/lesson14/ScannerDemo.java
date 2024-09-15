package syntax.lesson14;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        //Integer age = Integer.parseInt(scanner.nextLine());
        Integer age = scanner.nextInt();

        System.out.print(age  + " - " + name);
        scanner.close();
    }
}
