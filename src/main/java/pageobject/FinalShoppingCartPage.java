package pageobject;

import framework.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Karanjit_Singh on 05-12-2017.
 */
public class FinalShoppingCartPage extends BasePage {

    @FindBy (how = How.XPATH, using = "//*[@id=\"activeCartViewForm\"]/div[2]/div/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span")
    public WebElement finalProductTitle;

    @FindBy (how = How.XPATH, using = "//*[@id=\"gutterCartViewForm\"]/div[3]/div[2]/div/div[1]/p/span/span[2]")
    public WebElement subTotalPrice;

    public String getFinalProductTitle(){
        return finalProductTitle.getText();
    }

    public double getSubTotalPrice(){
        String subTotalWithoutDollarSign = subTotalPrice.getText().replace("$", "").toString();
        double subTotal = Double.parseDouble(subTotalWithoutDollarSign);
        return subTotal;
    }
}


