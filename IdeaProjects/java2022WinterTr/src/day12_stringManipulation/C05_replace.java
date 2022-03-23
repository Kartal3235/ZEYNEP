package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str="Bugün ne çok şey öğrendik";

        // bu cümledeki boşluk dışındaki karakter sayısını bulunuz

        System.out.println("space hariç karakter sayısı: "+str.replace(" ","").length());//

        //atama yapılmadığı surece orjınal string kalıcı olarak değişmez
        //sadece o satır için değişiklik yapılıp sonuç yazdırılmış olur

        System.out.println("orjınal str karakter sayısı:"+str.length());

        str=str.replace("Bugün","Yarın");
        str=str.replace("öğrendik","öğreneceğiz");

        str.replace("ne çok","ne az");

        System.out.println(str);



    }
}
