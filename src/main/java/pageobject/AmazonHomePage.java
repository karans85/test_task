package pageobject;

import framework.BasePage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Karanjit_Singh on 04-12-2017.
 */
public class AmazonHomePage extends BasePage {

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    public WebElement searchBox;

    public void searchForDigitalCameras(){
        searchBox.sendKeys("Best Sellers in Digital Cameras" + Keys.ENTER);
    }
}
