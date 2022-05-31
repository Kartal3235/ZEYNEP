package tests.day18_pom;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ReactPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class C03_ReactClass {
    @Test
    public void test01() {
        ReactPage rct=new ReactPage();
        // 1."https://react-shopping-cart-67954.firebaseapp.com/" adresine gidin
        Driver.getDriver().get("https://react-shopping-cart-67954.firebaseapp.com/");
        // 2.Web sitesindeki tüm öğeleri listeleyin ve yazdirin
        // (sitede 16 urun var, 1.urun : 2.urun :.....seklinde yazdirin )

        for (int i = 0; i <rct.tumElementList.size() ; i++) {

            System.out.println((i+1)+". ürün"+rct.tumElementList.get(i).getText());
        }

        // 3.Stringlerden olusan bir ArrayList oluşturun ve Ürün Adlarını ArrayList'e yerleştirin
        List<String> urunAdları=new ArrayList<>();

        for (int i = 0; i <rct.tumElementList.size() ; i++) {

            urunAdları.add(rct.tumElementList.get(i).getText());
        }
        System.out.println(urunAdları);

        // 4.Siteden Rastgele 5 öğe seçin, sepete ekleyin ve sectiginiz öğelerin adlarını yazdırın
        // (Her ürün 1 defadan fazla eklenemez!)
        Random rnd=new Random();
        List<String>sepetList=new ArrayList<>();


        do {

            if(!sepetList.contains(rct.tumElementList.get(rnd.nextInt(16)).getText())){
                sepetList.add(rct.tumElementList.get(rnd.nextInt(16)).getText());
            }



        }while(sepetList.size()<5);
        System.out.println("Sepete eklenen ürünler: "+sepetList);

        // 5.Her bir öğenin fiyatını toplayın ve sonucunuzu web sitesiyle karşılaştırın
        //
    }
}
