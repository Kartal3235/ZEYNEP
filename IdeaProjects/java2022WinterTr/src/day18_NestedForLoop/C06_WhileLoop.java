package day18_NestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {

        // Kullanıcıdan iki tam sayı alıp
        // bu  sayıları ve aralarındaki tüm sayıları yazdıran bir kod oluşturun


        int baslangıc=40;
        int bitis=60;


        for (int i = baslangıc; i <= bitis; i++) {
            System.out.print(i+" ");

        }
        System.out.println("");

        // aynı soruyu while loop ile yapalım

        int i=baslangıc;

        while(i<=bitis){

            System.out.print(i+" ");
            i++;

        }
        System.out.println(baslangıc);
    }
}

