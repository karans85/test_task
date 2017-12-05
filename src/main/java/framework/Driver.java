package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Karanjit_Singh on 05-12-2017.
 */
public class Driver {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:/Users/Karanjit_Singh/chromedriver.exe");
            driver = new ChromeDriver();

        }
        return driver;
    }
}
