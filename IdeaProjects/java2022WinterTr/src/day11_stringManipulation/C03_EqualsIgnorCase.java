package day11_stringManipulation;

import java.util.Scanner;

public class C03_EqualsIgnorCase {
    public static void main(String[] args) {


        // Kullanıcıya derse katılıp katılmak istemediğini sorun
        // evet "derse katılımınız alınmıştır" yazdırın
        // hayır derse cevabını ve "sonraki derslerimize bekleriz"yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Derse katıulmak istermisiniz?\nEvet veya Hayır yazınız");
        String cevap=scan.next();


        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabınız:"+cevap+"derse katılımınız onaylanmıştır");

        }else if(cevap.equalsIgnoreCase("hayır")) {
            System.out.println("cevabınız:"+ cevap+"Sonraki derslerimize bekleriz");

                    }else {
            System.out.println("Lütfen evet veya hayır yazınız");
        }
    }
}
