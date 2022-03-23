package day02_variables;

import java.security.Key;

public class C01_Variables {
    public static void main(String[] args) {
        //bir variables oluştururken içerisine koyacağım datanın alabileceği değerlere uygun
        //bir data türü seçmeliyiz
        //örneğin bir şehrin nüfusundan bahsedersek
        // variable' imizin data türü string,booean,char,double olamaz
        // geriye kalan tamsayı türlerinden şehrin nüfusuna içine alabilecek büyüklükte bir data türü seçebiliriz
        //biz kurs boyunca genelde tamsayılar için int, ondalıklı sayılar için double kullnacağız

        System.out.println("Hello World yazdıran Javayı hallder");

        int level=1;

        System.out.println("level");

        boolean ogrenciMi=true;

        System.out.println(ogrenciMi);

        boolean yagışVarmı=false;

        char ozelSembol='&';
        char sayi='2';

        System.out.println(sayi);

        char harf='K';

        System.out.println(harf);



    }
}
