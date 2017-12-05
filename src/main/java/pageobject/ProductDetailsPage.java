package pageobject;

import framework.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static framework.Driver.getDriver;

/**
 * Created by Karanjit_Singh on 05-12-2017.
 */
public class ProductDetailsPage extends BasePage {

    @FindBy (how = How.ID, using = "quantity")
    public WebElement quantity;

    @FindBy (how = How.ID, using = "priceblock_ourprice")
    public WebElement priceOfProduct;

    @FindBy (how = How.ID, using = "add-to-cart-button")
    public WebElement addToCart;

    public void selectEightPieces(){
        Select dropdown = new Select(quantity);
        dropdown.selectByIndex(7);
    }

    public void clickAddToCart(){
        getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES).pageLoadTimeout(1,TimeUnit.MINUTES);
        addToCart.click();
    }

    public double getPriceOfAnItem(){
        String price =  priceOfProduct.getText().replace("$", "").toString();
        double floatPrice =  Double.parseDouble(price);
        return floatPrice;
    }

}
