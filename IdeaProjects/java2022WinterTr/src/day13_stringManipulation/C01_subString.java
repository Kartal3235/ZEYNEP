package day13_stringManipulation;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class C01_subString {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5));

        //yukardaki stringi kullanarak mehmet hoca ile IT cok güzel

        System.out.println(str.replace("Java","Mehmet hoca"));
        System.out.println("Mehmet Hoca"+str.substring(5));

        System.out.println(str.substring(9));// yazılan index inclusive(dahil)


        // Eğer bir index den sona kadar olan parcayı değil
        // belirli bir parçayı almak istersek
        //2 parametre yazmakmak gerekir str.substring(başlangıçındexi,bitişindexi)
        //baslangıç index(inclusive=dahil)
        //bitiş index(exclusive=hariç)

        System.out.println(str.substring(0,5));

        String harf=str.substring(5,6);//6. harfi String olarak yazın
        System.out.println(harf);

        str="Java gün geçtikçe güzelleşiyor";
        System.out.println(str.substring(7,7));// son sözü endindex söyler

       // System.out.println(str.substring(5,2));//Bitiş index i başlangıç index inden küçük olamaz

        System.out.println(str.substring(str.length()-1));

        System.out.println(str.substring(str.length()-5));//son beş harfi yazdıralım

        System.out.println(str.substring(str.length()));// Son harften sonraki kısmı verir.Yni HİÇLİK







    }
}
