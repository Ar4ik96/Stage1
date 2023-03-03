package Task6;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        System.out.println("Введите какой-то год: ");
            int leapYear = day % 400;
            int normalYear = day % 100;
            int leapYearTo = day % 4;
            if (leapYearTo  < 1 && normalYear >= 1){
                System.out.println("Это высокосный год в нем 366 дней...");
            }else if (leapYear < 1){
                System.out.println("Это высокосный год в нем 366 дней...");
            }else {
                System.out.println("Это обычный год в нем 365 дней...");
            }
        }
    }
