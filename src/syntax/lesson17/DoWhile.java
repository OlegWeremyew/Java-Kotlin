package syntax.lesson17;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Integer count = 0;

//        while (count < 3) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter your age: ");
//            int age = scanner.nextInt();
//
//            if (age >= 18) {
//                System.out.println("You are adult.");
//            } else if (age >= 13) {
//                System.out.println("You are teenager.");
//            } else {
//                System.out.println("You are too young");
//            }
//
//            count += 1;
//            //scanner.close();
//        }

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("You are adult.");
            } else if (age >= 13) {
                System.out.println("You are teenager.");
            } else {
                System.out.println("You are too young");
            }

            count += 1;
            //scanner.close();
        } while (count < 3);
        System.out.println("Exit from cycle");


    }
}
