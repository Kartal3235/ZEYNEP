package day04_dataCasting_Increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {

        int sayi=20;

        System.out.println(sayi+10);
        //Bu satırda sayıyı 10 artırmadım
        //sayının 10 fazlasını yazdırdım

        System.out.println(sayi);//Eğer atama yapmazsak sayıda yaptığımız arttrıma ve azaltma kalıcı olmaz

        sayi=sayi+10;
        System.out.println(sayi);

        System.out.println(sayi=sayi+=10);
        System.out.println(sayi);

        System.out.println(sayi+=10);
        System.out.println(sayi);

        //bir variable ın değerini kalıcı olarak arttırmak veya azaltmak istersenz assigment şart

        System.out.println("25. satır: " + sayi++);
        System.out.println("26.satır: "+sayi);


        System.out.println("29.satır: "+ ++sayi);
        System.out.println("30.satır: "+sayi);

    }
}
