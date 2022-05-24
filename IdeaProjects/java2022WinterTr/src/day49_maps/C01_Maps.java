package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {

        // Java da Collection üyesi bir yapıda
        //data turu Object seçilirse,her data turunden değer ekleyebiliriz
        //ancak bu durumda surekli casting problemleri ile karşılaşabiliriz.

        List<Object> list=new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);
        System.out.println(list);

        list.set(1,(Integer)(list.get(1))+10);//casting yaptık

        Map<Integer, String>sinifList=new HashMap<>();

        // bir sınıfta öğrenci no ile isim-soy isim,branş olarak map oluşturmak istiyoruz.
        // key tek bir unique değerdir.
        // ama value/değer birden fazla bilginin birleşiminden oluşabilir.
        // bu durumda daha sonra istediğimiz bilgilere doğru sekilde ulaşabilmek için
        // tum elementler için value aynı biçimde oluşturulmalıdır.
        //===============================================
        // **** veri sıralaması ve şekilsel açıdan****

        sinifList.put(101,"Ali, Can, Dev");
        sinifList.put(102,"Veli, Yan, QA");
        sinifList.put(103,"Ali, Yan, C#");

        System.out.println(sinifList);

        System.out.println(sinifList.keySet());//[101, 102, 103]
        System.out.println(sinifList.values());
       //[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]
    }
}
