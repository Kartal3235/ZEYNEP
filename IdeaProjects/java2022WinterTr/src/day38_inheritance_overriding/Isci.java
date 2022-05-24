package day38_inheritance_overriding;

public class Isci extends Personel{

    public String statü="Isci";
    public String haklar="Isciler kıdem tazminatı alırlar";
    public String ikramiye="İşçiler yılda bir kez ikramiye alır";


    public void mesai(){
        System.out.println("tüm işçiler  haftalık 40saat çalışır.");
    }

    public void maasHesapla(){

        System.out.println("Tüm işçiler 30 gün * 8 saat * 10 euro=" + (30*8*10)+"euro maas alır");

    }
}
