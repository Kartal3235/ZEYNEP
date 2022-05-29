package tests.Excercies;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ReactPage;
import utilities.Driver;

import java.util.*;
import java.util.stream.Collectors;

public class ReactClass {
    @Test
    public void test01() {

        ReactPage rct=new ReactPage();
        // 1."https://react-shopping-cart-67954.firebaseapp.com/" adresine gidin
        Driver.getDriver().get("https://react-shopping-cart-67954.firebaseapp.com/");
        // 2.Web sitesindeki tüm öğeleri listeleyin ve yazdirin
        // (sitede 16 urun var, 1.urun : 2.urun :.....seklinde yazdirin )

        for (int i = 0; i <16 ; i++) {
            System.out.println((i+1)+".ürün "+rct.tumElementList.get(i).getText()+" ürün fiyatı "+rct.urunFiyatı.get(i).getText());
        }
        // 3.Stringlerden olusan bir ArrayList oluşturun ve Ürün Adlarını ArrayList'e yerleştirin
        System.out.println("*******************");
        List<String>urunAdı=new ArrayList<>();
        for (WebElement each: rct.tumElementList
             ) {
            urunAdı.add(each.getText());
        }
        System.out.println(urunAdı);
        System.out.println("****************************");
        // 4.Siteden Rastgele 5 öğe seçin, sepete ekleyin ve sectiginiz öğelerin adlarını yazdırın
        // (Her ürün 1 defadan fazla eklenemez!)
        Random rnd=new Random();
        List<String>eklenenUrunList=new ArrayList<String>();
        List<String>eklenenUrunFıyatList=new ArrayList<String>();
        do{
           if(!eklenenUrunList.contains(rct.tumElementList.get(rnd.nextInt(16)).getText())){
               eklenenUrunList.add(rct.tumElementList.get(rnd.nextInt(16)).getText());
           }
           if(!eklenenUrunList.contains(rct.addToCart.get(rnd.nextInt(16)).getText())){
             eklenenUrunList.add(rct.addToCart.get(rnd.nextInt(16)).getText());
           }
           if (!eklenenUrunFıyatList.contains(rct.urunFiyatı.get(rnd.nextInt(16)).getText())){
               eklenenUrunFıyatList.add(rct.urunFiyatı.get(rnd.nextInt(16)).getText());
           }
        }while (eklenenUrunList.size()<5);
        System.out.println("Sepete eklenen urun Listesi : "+eklenenUrunList);
        System.out.println("Sepete eklenen urun Fiyat Listesi: "+eklenenUrunFıyatList);

        // 5.Her bir öğenin fiyatını toplayın ve sonucunuzu web sitesiyle karşılaştırın
        List<String>secılenOgeFıyatTop=new ArrayList<>();

        int sum=0;
        for (int i = 0; i <5 ; i++) {
            secılenOgeFıyatTop.add(eklenenUrunFıyatList.get(i).replaceAll("\\D",""));
            eklenenUrunFıyatList.add(secılenOgeFıyatTop.get(i));
            sum= Integer.parseInt(eklenenUrunFıyatList.get(i));
        }
        // 6.Sonuçlar eşleşiyorsa  konsola test pass yazirin
        // 7.Checkout'a tıklayın
    }
}
