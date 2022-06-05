package tests.Excercies.CanHoca;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CanHoca.C01Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.*;

public class C01 {
    @Test
    public void test01() {
        C01Page co1=new C01Page();
        //~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
        Driver.getDriver().get("http://tutorialsninja.com/demo/index.php?route=common/home");
        //    ~ click on Phones & PDAs
        co1.phonePdaClick.click();
        //    ~ get the brandName of phones
        co1.iphoneList.stream().map(WebElement::getText).forEach(System.out::println);
        //    ~ click on add to button for all elements
        List<WebElement>sepeteEkle=new ArrayList<>();
        for (WebElement each:co1.addToCart
             ) {
            each.click();

        }
        ReusableMethods.waitFor(3);
        //    ~ click on black total added cart button
               co1.blackButton.click();
        //    ~ get the names of list from the cart

                List<String>sepettenListAl=new ArrayList();
        for (int i = 0; i <co1.sepetListe.size() ; i++) {
            sepettenListAl.add(co1.sepetListe.get(i).getText());
        }
        System.out.println(sepettenListAl);
        //    ~ compare the names from displaying list and cart list

        Assert.assertEquals(co1.iphoneList.stream().map(WebElement::getText).sorted(),
                sepettenListAl.stream().sorted(Comparator.comparing(t-> t)));
    }

}
