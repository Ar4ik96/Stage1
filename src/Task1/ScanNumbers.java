package Task1;

import java.util.Scanner;

public class ScanNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое число");
        while (true) {
            String s = scan.nextLine();
                String[] data = s.split("");
                for (int i = 0; i < data.length; i++) {
                    System.out.println(data[i]);
                }
        }

    }

}

