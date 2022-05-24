package day38_inheritance_overriding;

public class Ustabaşı extends Isci {

    public String statü="Ustabaşı";
    public String haklar="Ustabaşı haftada birgün ekstra tatil hakkına sahiptir";


    public void mesai(){
        System.out.println("Arıza varsa ustabaşı ekstra ücret almadan çalışır.");
    }

    public void maasHesapla(){

        System.out.println("Ustabaşı 30 gün * 8 saat * 12 euro=" + (30*8*12)+"euro maas alır");



    }

    public static void main(String[] args) {

        /*
        İçinde olduğumuz class dan klasik haliyle bir obje oluşturursak
        o obje ile çağırdığımız variable ve methodlar da
        java önce içinde bulunduğumuz class a bakar
        aradığımız class üyesi, içinde olduğumuz class da varsa
        bize onu getirir.

        YOKSA,
        parent class lara bakar,ilk bulduğunu getirir.

        */
        Ustabaşı yasin=new Ustabaşı();

        System.out.println(yasin.statü);//Ustabaşı
        System.out.println(yasin.haklar);//Ustabaşı haftada birgün ekstra tatil hakkına sahiptir
        System.out.println(yasin.ikramiye);
        System.out.println(yasin.izin);
        yasin.maasHesapla();
        yasin.mesai();
        /*
        Eğer işçi olarak özelliklerini görmek istersek
        Class adını (Data Turu) İsci seçeriz.
         */
        Isci ahmet=new Ustabaşı();

        System.out.println(ahmet.statü);//İşçi
        System.out.println(ahmet.haklar);//
        System.out.println(ahmet.ikramiye);//
        System.out.println(ahmet.izin);//
        ahmet.maasHesapla();
       ahmet.mesai();

        /*
        Siz bir objeyi hangi class dan tanımlarsanız o class a ait özlliklere sahip olur
         */

        Personel adem=new Ustabaşı();

        System.out.println(adem.statü);
        System.out.println(adem.izin);
        System.out.println(adem.izin);
        adem.maasHesapla();
        adem.mesai();
        //System.out.println(adem.ikramiye);// CTE verir

        /*
        Personel adem=new Ustabasi();
        Personel adem= new Personel();

         */

        /*
        Personel adem=new Ustabaşı();


        adem'in data turu Personel,dir
        böylece biz ademi ne olarak isimlendirdiğimizi bilebiliriz
        Ancak ben ademin ustabaşı olduğunu biliryorum
        Çünkü contructorı Ustabaşı
        Ama bu yazım formatı ile adem'in tüm personel ile birlikte sahip olduğu
        ortak özellikleri vurgulamak istiyorum

        Bu kullanım şeklinde oluşturulan obje data turu olarak seçilen class
        ve onun parent class larındaki variable ları kullanabilir.

         */

    }
}
