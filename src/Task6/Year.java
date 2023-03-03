package Task6;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  year = scanner.nextInt();
        System.out.println("Введите какой-то год: ");
            int leapYear = year % 400;
            int normalYear = year % 100;
            int leapYearTo = year % 4;
            if (leapYearTo  < 1 && normalYear >= 1){
                System.out.println("Это высокосный год в нем 366 дней...");
            }else if (leapYear < 1){
                System.out.println("Это высокосный год в нем 366 дней...");
            }else {
                System.out.println("Это обычный год в нем 365 дней...");
            }
        }
    }
