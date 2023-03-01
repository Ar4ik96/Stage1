package Task5;

import java.util.Scanner;

public class Building {


        private static final int APARTMENTS = 144;
        private static final int APARTMENTS_PER_HALL = 36;
        private static final int APARTMENTS_PER_LEVEL = 4;
        public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        while (true){
            System.out.println("Введите номер квартиры: ");
        int apartment = scanner.nextInt();
        if ( apartment < 0 ||  apartment > APARTMENTS) {
                System.out.println("B этом доме нет квартир под этим номером! ");
                continue;
            }
        int hall = (int) Math. ceil(apartment / (double) APARTMENTS_PER_HALL);
        int apartmentInParticularHall = apartment % APARTMENTS_PER_HALL == 0
                ? APARTMENTS_PER_HALL
                : apartment % APARTMENTS_PER_HALL;
        int level = (int) Math. ceil(apartmentInParticularHall / (double) APARTMENTS_PER_LEVEL);

                System.out.println("Подъезд: " + hall);
                System.out.println("Этаж: " + level);
    }
}
}

//подъедов 4
//этажей 9
//квартир на этаже 4
//квартир в подъеде 36
//всего квартир 144