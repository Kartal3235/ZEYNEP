package day05_Matematikselİşlemler;

public class C01_PreIncrementPostıncrement {
    public static void main(String[] args) {

        int sayi=10;

        sayi++;
        System.out.println(sayi);

        sayi++;
        System.out.println(sayi);

        //Eğer 11. ve 12. satırda yaptığım 2 işlemi tek satırda yaparsam
        //Java iki işlemiden önce hangisini yapacağını bilmek ister
        //önce artır sonra yazdırırsak java yerni değeri yazdırır
        //ama önce yazdırır sonra artırırsak bu durumda eski değer yazdırılır


        System.out.println(++sayi);//önce artır sonra yazdır

        System.out.println("post-increment satırında "+sayi++);//önce yazdır sonra artır
        System.out.println("post increment satırından sonra "+sayi);









    }
}
