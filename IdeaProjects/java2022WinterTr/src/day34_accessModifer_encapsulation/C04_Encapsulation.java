package day34_accessModifer_encapsulation;

public class C04_Encapsulation {

    public static void main(String[] args) {

        /* Bir variable encapsule etmek için
        1-Access modiferi private yaparız
        2-okuma ve yazma özelliklerinin kullanılmasını istediğimiz gibi sınırlayabiliriz
            eğer sadce  okunmasını istiyorsak getter
            sadece değer girilebilsin isterseniz setter
          methodlarını oluştururuz

          bir variable için hem getter hem setter oluşturursanız o variable public olmuş gibi
         hem okuyup hemde yazılmasını sağlayabilirsiniz.

         Piyasada Developer lar arasında genel uygulamada böyledir.
         


*/
        C03 obj=new C03();

        System.out.println(obj.getSayi());

        obj.setStr("Java Java Java");

        System.out.println(obj.getStr());
        System.out.println(obj);



    }
}
