package day32_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class C05_İkiTarihArasınıBulma {
    public static void main(String[] args) {

        LocalDate bugun= LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1984,01,03);
        System.out.println(Period.between(dogumGunu,bugun));

        System.out.println(Period.between(dogumGunu,bugun).getYears());

        // FIXME: 31.03.2022

    }
}
