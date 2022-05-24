package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate trh=LocalDate.now();// objenin oluşturulduğu tarihi trh ye atar
        LocalDate baskaTrh= LocalDate.of(1984,1,18);
        // İstediğimiz yıl ay gün değerlerine göre bize obje oluşturulur.

        System.out.println(trh);//2022-03-31

        // get' li methodlarla tarih ile ilgili bilgileri alabiliriz

        System.out.println(trh.getDayOfMonth());

        System.out.println(trh.getDayOfWeek());

        System.out.println(trh.getMonthValue());

        System.out.println(trh.getDayOfYear());

        // bir tarihten istediğimiz kadar ileri veya geri gidebiliriz

        System.out.println(trh.minusWeeks(20));
        System.out.println(trh.minusWeeks(5).minusDays(3));

        System.out.println(trh.plusMonths(9).plusDays(10));


        //Istediğimiz ülkenin o andaki tarihini elde etmek istersek

        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);

        // is ile baslayan method lar boolean sonuclar dondürür.
        System.out.println(LocalDate.now().isLeapYear());// false

        System.out.println(trh.isAfter(baskaTrh));// true

    }

}
