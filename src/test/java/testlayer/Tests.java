package testlayer;


import framework.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.*;


/**
 * Created by Karanjit_Singh on 04-12-2017.
 */
public class Tests extends BaseTest{

    @Test
    public void checkIfCorrectProductIsAdded() {

        AmazonHomePage homePage = new AmazonHomePage();
        SearchResultsPage searchResult = new SearchResultsPage(Driver.getDriver());
        ProductDetailsPage detailsPage = new ProductDetailsPage();
        ProductAddedToCartPage productAdded = new ProductAddedToCartPage();
        FinalShoppingCartPage finalPage = new FinalShoppingCartPage();

        homePage.searchForDigitalCameras();
        searchResult.scrollDown();
        String titleBeforeAddingToCart = searchResult.getFifthProductTitle();
        searchResult.clickFifthProduct();

        detailsPage.selectEightPieces();
        detailsPage.clickAddToCart();
        productAdded.clickCartButton();
        String titleAfterAddingToCart = finalPage.getFinalProductTitle();

        Assert.assertEquals(titleBeforeAddingToCart, titleAfterAddingToCart, " Correct product is not added");
    }

    @Test
    public void checkIfSubTotalPriceSumIsCorrect() {
        AmazonHomePage homePage = new AmazonHomePage();
        SearchResultsPage searchResult = new SearchResultsPage(Driver.getDriver());
        ProductDetailsPage detailsPage = new ProductDetailsPage();
        ProductAddedToCartPage productAdded = new ProductAddedToCartPage();
        FinalShoppingCartPage finalPage = new FinalShoppingCartPage();

        homePage.searchForDigitalCameras();
        searchResult.scrollDown();
        searchResult.clickFifthProduct();


        double oneItemPrice = detailsPage.getPriceOfAnItem();
        double totalOfEightItems= oneItemPrice*8;

        detailsPage.selectEightPieces();
        detailsPage.clickAddToCart();
        productAdded.clickCartButton();
        double finalSubtotal = finalPage.getSubTotalPrice();


        Assert.assertEquals(totalOfEightItems, finalSubtotal, "Sub-Total price is incorrect");
    }

}