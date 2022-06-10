package tests.dataProvider1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C01_dataProvider {

    /*
    Data provider
    1-create a method
    2-use @dataProvider annotation
    2-add data
     */


    @DataProvider
    public  Object[][] dataProviderMethod(){

        Object[][] customerCredentials={{"customer@bluerentalcars.com","12345"},
                {"customer1@bluerentalcars.com","12346"},{"customer2@bluerentalcars.com","12347"},
                {"customer3@bluerentalcars.com","12348"}};
        return customerCredentials;
    }


    @Test(dataProvider = "dataProviderMethod")
    public void customerLogininfo(String username,String password){

        System.out.println("username : "+username+ "|password: "+password);
    }
}
