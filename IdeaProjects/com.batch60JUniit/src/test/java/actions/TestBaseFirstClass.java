package actions;

import org.junit.Test;
import utilities.TestBase;

public class TestBaseFirstClass extends TestBase {

    @Test
    public void test(){
      driver.get("https://www.amazon.com");
    }
}
