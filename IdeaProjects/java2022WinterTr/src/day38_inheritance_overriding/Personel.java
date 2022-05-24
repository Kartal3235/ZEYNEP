package day38_inheritance_overriding;

public class Personel {

    public String statü="Personel";
    public String haklar="Tümpersonel eşit haklara sahiptir.";
    public String izin="tüm personel yılda 4 hafta izin kullanabilir";


    public void mesai(){
        System.out.println("tüm personel 5 gün,günde 8 saat çalışır.");
    }

    public void maasHesapla(){

        System.out.println("Tüm personel 30 gün * 8 saat * 10 euro=" + (30*8*10)+"euro maas alır");

    }
}
