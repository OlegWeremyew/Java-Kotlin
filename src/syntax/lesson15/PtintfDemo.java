package syntax.lesson15;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PtintfDemo {
    public static void main(String[] args) {
/**
 * n% - перенос
 * s% - строки
 * d% - числа в 10й системе
 * f% - дробные
 * 3.2f% - целце только 3 цифры, дробные только 2 цифры
 * %tF %tT - дата время
 */

        String name = "Aslan";
        // выводим с переносом строки - '%n'
        System.out.printf("Hello %s! %n", name);

        Integer age = 30;
        System.out.printf("I am %d years old %n", age);


        Double height = 179.7;
        System.out.printf("I am %3.2f height %n", height);

        LocalDateTime now = LocalDateTime.now();
        System.out.printf("Current date and time: %tF %tT", now, now);
    }
}
