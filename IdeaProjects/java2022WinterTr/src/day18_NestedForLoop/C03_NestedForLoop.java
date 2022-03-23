package day18_NestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {


        //Soru 13 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim
            //tablosu olusturun


        int input=5;

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i ; j++) {
                //nested for loop ya dikdörtgen veya üçgen formatında olabilir
                //dikdörtgen istediğimizde iki lopp için de bağımsız en point belirleriz
                //üçgen şekli vermek için inner loppun end pointini olarak outer değişkene bağlı yaparız

                System.out.print("* ");


            }
            System.out.println("");

        }

    }
}
