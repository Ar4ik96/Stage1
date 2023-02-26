
//Написать программу которая считает 4 числа c клавиатуры и выведет на экран самое большое из них.
package Task4;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 4 числа: ");
        while (true) {
            String str = scanner.nextLine();
            String[] data = str.split(" ");

            String greaterValue = data[0];
            for (int i = 1; i < data.length; i++) {
                if(Integer.parseInt(data[i]) > Integer.parseInt(greaterValue) ) greaterValue = data[i];
            }
            System.out.println("Число с найбольшим значением: " +  greaterValue);

        }
    }
}

