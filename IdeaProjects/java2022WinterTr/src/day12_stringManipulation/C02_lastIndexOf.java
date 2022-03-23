package day12_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        //Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
        //kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //-
        //Girilen kelime cumlede kullanilmamis.
        //-
        //Girilen kelime cumlede 1 kere kullanilmis.
        //-
        //Girilen kelime cumlede 1’den fazla kullanilmis.


        String cümle="Java ogren,yeni program ile yeni bir sayfa ac";
        String kelime="yeni";

        int ilkKullanim=cümle.indexOf(kelime);//-1 veya index

        int sonKullanım=cümle.lastIndexOf(kelime);

        if (ilkKullanim==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        } else if (ilkKullanim==sonKullanım){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        }else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }

        String str="Eclipse";
        System.out.println(str.lastIndexOf('p',4));//4 dahil



    }
}
