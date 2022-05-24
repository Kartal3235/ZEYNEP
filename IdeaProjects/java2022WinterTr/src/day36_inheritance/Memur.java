package day36_inheritance;

public class Memur extends Muhasebe {


    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {


        Memur memur1=new Memur();

        // memur1 objesi Memur classının objesi olamasına rağmen
        // inherit ettiği Muhasebe ve onun da Paretn i olan Personel
        // class lardaki tüm dataları alabilir.

        // Personel class ından
        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepecik";
        memur1.adres="Ankara";
        memur1.tel="3125746598";


        // Muhasebe classından

        memur1.saatUcreti=10;
        memur1.maas= memur1.maasHesapla();
        memur1.statu="Memur";
        System.out.println(memur1);

        Memur memur2 = new Memur();
        memur2.persNo=1002;
        memur2.saatUcreti=10;
        memur2.maas= memur2.maasHesapla();

        System.out.println(memur2);


    }

}
