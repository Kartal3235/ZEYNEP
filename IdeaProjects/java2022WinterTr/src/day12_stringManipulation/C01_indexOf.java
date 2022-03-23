package day12_stringManipulation;

public class C01_indexOf {
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

        int ilkkullanım=cümle.indexOf(kelime);//-1 veya index
        int ikinciKullanım=cümle.indexOf(kelime,ilkkullanım+1);
        if(ilkkullanım==(-1)){
            System.out.println("Girilen kelime cümlede kullanılmmış");
        }else if(ikinciKullanım==(-1)){
            System.out.println("Girilen kelime cümledew 1 kere kullanı9lmış");
        }else{
            System.out.println("Girilen kelime cümlede 1 den fazla kullanılmış");
        }
    }
}
