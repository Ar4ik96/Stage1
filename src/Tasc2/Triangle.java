package Tasc2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение сторон треугольника,( либо высоту и известную сторону.)");
        while (true){
            String str = scanner.nextLine();
            str = str.replace(" ", "+");
            String[] data = null;
            String action = null;

            if (str.contains("+")){
             data = str.split("\\+");
             action = "+";
            }
            else if (str.contains("-")){
                data = str.split("-");
                action = "-";
            }


            if(action.equals("+")){
                System.out.println("Площадь вашего треугольника: " + Integer.parseInt(data[0])*Integer.parseInt(data[1])/2) ;
            } else if (action.equals("-")) {
                System.out.println("Площадь вашего треугольника: " + Integer.parseInt(data[0])*Integer.parseInt(data[1])/2);
            }
//
        }
    }

}


