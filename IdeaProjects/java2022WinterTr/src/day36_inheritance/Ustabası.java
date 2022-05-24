package day36_inheritance;

public class Ustabası extends Isci{
    @Override
    public String toString() {
        return "Ustabası{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
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

        Ustabası ustabası = new Ustabası();
        ustabası.saatUcreti=15;
        ustabası.isim="Murat";
        ustabası.soyisim="Gokcek";
        ustabası.maas=ustabası.maasHesapla();
        ustabası.statu="Isci";
        ustabası.isciStatu="Ustabası";

        System.out.println(ustabası);


    }
}
