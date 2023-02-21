package Tasc3;

import java.util.Scanner;

public class Okrujnost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение радиуса");
        while (true) {
            String str = scanner.nextLine();
            String[] data = str.split(" ");

            double pi = 3.14;

                System.out.println("Длина окружности равна: " + Double.parseDouble(data[0]) *2*pi);

        }
    }
}
