package day35_ınharitance;

public class Child01 extends Parent{
    public static void main(String[] args) {

        /*
        Child class hiç bir objeye ihitiyaç duymadan
        parent class daki variable ve methodlara ulşabilir

         */

        System.out.println(isim);// Neval
        System.out.println(fabrika);//Yildiz Tekstil

        method1();
        method2();
    }
}
