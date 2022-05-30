package tests.Excercies;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Gruru99Page;
import utilities.Driver;

public class C01_Gruru99Class {
    @Test
    public void test01() throws InterruptedException {
        Gruru99Page page=new Gruru99Page();

        // http://demo.guru99.com/test/drag_drop.html url e git
        Driver.getDriver().get("http://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(3000);
        //    DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
        Actions action=new Actions(Driver.getDriver());
        action.dragAndDrop(page.bankButon,page.debitAccount).perform();
        //    CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
        action.dragAndDrop(page.sales,page.creditAccount).perform();
        //    DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak
        action.dragAndDrop(page.besBın,page.debitAmount).perform();
        //    CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
        action.dragAndDrop(page.ıkıncıBesBın,page.creditAmount).perform();
        //    Perfect butonun goruntulendigini dogrulayin
        Assert.assertTrue(page.perfectGorundu.isDisplayed());

    }
}
