package actions.excercies;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C11 extends TestBase {
    @Test
    public void test02() {
        driver.get("https://www.amazon.com");
        Actions action=new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

    }
}
