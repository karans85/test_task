package pageobject;

import framework.BasePage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.concurrent.TimeUnit;
import static framework.Driver.getDriver;

/**
 * Created by Karanjit_Singh on 05-12-2017.
 */
public class SearchResultsPage extends BasePage {

    @FindBy (how = How.XPATH, using = "//*[@id=\"result_4\"]/div/div/div/div[2]/div[1]/div[1]/a")
    public WebElement fifthProduct;

    public SearchResultsPage(WebDriver driver) {
        super();
    }

    public void clickFifthProduct(){
        fifthProduct.click();
        }

        public String getFifthProductTitle(){
            String getProductTitle = fifthProduct.getText();
            return getProductTitle;
        }

    public void scrollDown(){
        getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES).pageLoadTimeout(1,TimeUnit.MINUTES);
        JavascriptExecutor jse = (JavascriptExecutor) getDriver() ;
        jse.executeScript("scroll(0, 1000);");
    }
}
