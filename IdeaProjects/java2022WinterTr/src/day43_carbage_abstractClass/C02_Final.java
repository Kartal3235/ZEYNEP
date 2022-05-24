package day43_carbage_abstractClass;

public class C02_Final extends C01_Final{



    public static void main(String[] args) {

        System.out.println(C01_Final.piSayisi);

        //C01_Final.piSayisi=4;


    }
    public static void method1(){

        /*
        Override parent class daki methodu child class a uyarlamak demekti
        yani işlevini değiştirmek istiyoruz
        ancak parent class daki method final olarak tanımlandığından
        Java methodun uyarlanmaasına izin vermiyor.
         */

        System.out.println("Parent class");
    }

}
