package testlayer;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import static framework.Driver.driver;
import static framework.Driver.getDriver;

/**
 * Created by Karanjit_Singh on 05-12-2017.
 */
public class BaseTest {

    @BeforeMethod
    public void getAmazon(){
        getDriver().manage().window().maximize();
        getDriver().get("https://www.amazon.com");

    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
        driver = null;
    }

}
