package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
    /*
     ...Exercise3...
    // http://the-internet.herokuapp.com/add_remove_elements/
    // click on the "Add Element" button 100 times
    // write a function that takes a number, and clicks the "Delete" button
    // given number of times, and then validates that given number of
    // buttons was deleted
    1.method : createButtons(100)
    2.deleteButtonsAndValidate()
  */
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test() {
        // http://the-internet.herokuapp.com/add_remove_elements/
        // click on the "Add Element" button 100 times
        // write a function that takes a number, and clicks the "Delete" button
        // given number of times, and then validates that given number of
        // buttons was deleted
        //1.method : createButtons(100)
        //2.deleteButtonsAndValidate()


        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        int x=100;
        int y=20;
        WebElement deleteButton=driver.findElement(By.xpath("//div[@id='elements']"));
        String[]arr=deleteButton.getText().split(" ");

    }

    public void createButtons(int x){
        for (int i = 0; i <x ; i++) {
            driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        }
    }
    public void deleteButtonsAndValidate(int y){
        for (int i = 0; i <y ; i++) {
            driver.findElement(By.xpath("//*[text()='Delete']")).click();
        }
    }

}
