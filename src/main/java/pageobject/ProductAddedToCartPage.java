package pageobject;

import framework.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

import static framework.Driver.getDriver;

/**
 * Created by Karanjit_Singh on 05-12-2017.
 */
public class ProductAddedToCartPage extends BasePage {

    @FindBy (how = How.ID, using = "hlb-view-cart-announce")
    public WebElement verifyCartButton;

    public void clickCartButton(){
        getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES).pageLoadTimeout(1,TimeUnit.MINUTES);
        verifyCartButton.click();
    }

}
