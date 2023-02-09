import java.util.Random;
import java.util.Scanner;

public class Conclusion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пятизначное число");
        int i = scanner.nextInt();
        System.out.println(i/10000);
        System.out.println(i%10000/1000);
        System.out.println(i%1000/100);
        System.out.println(i%100/10);
        System.out.println(i%10);
        }

}
