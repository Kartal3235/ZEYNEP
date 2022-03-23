package day15_metdCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {

        String isim="YASEMİN";
        String soyisim="SARI";
        String kKNo="1234567890123456";

        isimSoyisimGizle(isim,soyisim);
        krediKartıGizle(kKNo);


        String yeniIsim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\S","*");

        String yeniKKNo="**** **** **** "+kKNo.substring(12);

        System.out.println("isim-soyisim:"+yeniIsim+" "+yeniSoyisim+"\nkart no:"+yeniKKNo);


    }

    public static void krediKartıGizle(String kKNo) {
        String yeniKKNo="**** **** **** "+kKNo.substring(12);
    }

    public static void isimSoyisimGizle(String isim, String soyisim) {

        String yeniIsim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\S","*");
    }
}
