package Task5;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер квартиры: ");
        while (true) {
            int apartment;
            apartment = scanner.nextInt();
            int entrance = (apartment - 1) / 36 + 1;
            int storey = (apartment - 36 * (entrance - 1) - 1) / 4 + 1;
            if (apartment > 0 && apartment < 145) {
                System.out.println("Подъезд: " + entrance);

                System.out.println("Этаж: " + storey);
            } else {
                System.out.println("В этом доме нет квартиры под этим номером!");
            }
        }
    }
}