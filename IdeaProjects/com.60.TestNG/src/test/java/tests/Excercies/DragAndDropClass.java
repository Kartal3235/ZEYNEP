package tests.Excercies;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DragAndDropPage;
import utilities.Driver;

public class DragAndDropClass {
    @Test
    public void test01() {
        DragAndDropPage dad=new DragAndDropPage();

        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        // Fill in capitals by country.
        Actions action=new Actions(Driver.getDriver());
       action.dragAndDrop(dad.roma,dad.ıtaly).perform();
       action.dragAndDrop(dad.madrid,dad.spaın).perform();
       action.dragAndDrop(dad.oslo,dad.norway).perform();
       action.dragAndDrop(dad.stockholm,dad.sweden).perform();
       action.dragAndDrop(dad.washington,dad.unitedStates).perform();
       action.dragAndDrop(dad.copehagen,dad.danımark).perform();
       action.dragAndDrop(dad.seoul,dad.southKorea).perform();
       Driver.closeDriver();
    }
}
