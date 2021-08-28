package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.*;

public class MainPageTest extends BaseTest {

    MainPage MainPageWorkClass;
    EmptySearchButtonPage EmptySearchButtonPageWorkClass;
    MoreButtonPage MoreButtonPageWorkClass;
    KillAddPage KillAddPageWorkClass;
    SearchButtonPage SearchButtonPageWorkClass;
    CategoryPage CategoryPageWorkClass;
    ProductPage ProductPageWorkClass;

    @Before
    public void setUp5() {
        MainPageWorkClass = new MainPage();
        EmptySearchButtonPageWorkClass = new EmptySearchButtonPage();
        MoreButtonPageWorkClass = new MoreButtonPage();
        KillAddPageWorkClass = new KillAddPage();
        SearchButtonPageWorkClass = new SearchButtonPage();
        CategoryPageWorkClass = new CategoryPage();
        ProductPageWorkClass = new ProductPage();
    }

    @Test
    public void unSuccessfulSearchTest() {
        MainPageWorkClass.clickYourLogoLink();
        MainPageWorkClass.cartLinkClick();
        MainPageWorkClass.inputSearchButton(" ");
        Assert.assertTrue(EmptySearchButtonPageWorkClass.successAlertDisplayed());
        Assert.assertEquals("0 results have been found.", EmptySearchButtonPageWorkClass.successAlertText());
    }

    @Test
    public void successfulSearchTest() {
        MainPageWorkClass.clickYourLogoLink();
        MainPageWorkClass.cartLinkClick();
        MainPageWorkClass.inputSearchButton("Dresses");
        Assert.assertTrue(SearchButtonPageWorkClass.successfulSearchInputMessageDisplayed());
        Assert.assertEquals("7 results have been found.",SearchButtonPageWorkClass.successfulSearchInputMessageGetText());
    }

    @Test
    public void successfulNewsletterSubscriptionTest() {
        MainPageWorkClass.newsLetterButtonClick();
        MainPageWorkClass.inputEnterYourEmail("trecitest@gmail.com");
        Assert.assertTrue(MainPageWorkClass.successfulNewsletterSubscriptionAlertDisplayed());
        Assert.assertEquals("Newsletter : You have successfully subscribed to this newsletter.", MainPageWorkClass.successfulNewsletterSubscriptionAlertGetText());
    }

    @Test
    public void unsuccessfulNewsletterSubscriptionTest() {
        MainPageWorkClass.newsLetterButtonClick();
        MainPageWorkClass.inputEnterYourEmail("prvoslav@gmail.com");
        Assert.assertTrue(MainPageWorkClass.unsuccessfulNewsletterSubscriptionDisplayed());
        Assert.assertEquals("Newsletter : This email address is already registered.", MainPageWorkClass.unsuccessfulNewsletterSubscriptionGetText());
    }

    @Test
    public void successfulAddToCartTest() {
        MainPageWorkClass.ScrollDown();
        MainPageWorkClass.hoverTShirt();
        MainPageWorkClass.clickAddToCartButton();
        Assert.assertTrue(MainPageWorkClass.successfulAddToCartAlertDisplayed());
        Assert.assertEquals("Product successfully added to your shopping cart", MainPageWorkClass.successfulAddToCartAlertGetText());
    }

    @Test
    public void successfulMoreButtonTest() {
        MainPageWorkClass.hoverTShirt();
        MainPageWorkClass.clickMoreTShirtButton();
        Assert.assertTrue(MoreButtonPageWorkClass.successfulTShirtDescriptionDisplayed());
        Assert.assertEquals("Faded short sleeve t-shirt with high neckline. Soft and stretchy material for a comfortable fit. Accessorize with a straw hat and you're ready for summer!",MoreButtonPageWorkClass.successfulTShirtDescriptionGetText());
    }
    @Test
    public void successfulShopNowTest(){
        MainPageWorkClass.clickShopNow();
        KillAddPageWorkClass.clickCloseAdd();
        //This test passes even when KillAddPageWorkClass does not exist. The "link Shop" now is useless.
    }
    @Test
    public void successfulTopsTest(){
        MainPageWorkClass.hoverWomenCategoryButton();
        MainPageWorkClass.clickTopsButton();
        Assert.assertTrue(CategoryPageWorkClass.successfulTopsAlertDisplayed());
        Assert.assertEquals("Choose from t-shirts, tops, blouses, short sleeves, long sleeves, tank tops, 3/4 sleeves and more.\n" +
                 "Find the cut that suits you the best!",CategoryPageWorkClass.successfulTopsAlertGetText());
    }

    @Test
    public void successfulQuantityCheckingTest(){
        MainPageWorkClass.hoverTShirt();
        MainPageWorkClass.clickMoreTShirtButton();
//        ProductPageWorkClass.hoverPlusButton();
        ProductPageWorkClass.clickPlusButton();
        Assert.assertTrue(ProductPageWorkClass.successfulCheckingQuantityDisplayed());
        Assert.assertEquals("2", ProductPageWorkClass.successfulCheckingQuantityGetAttribute());
    }
    @Test
    public void successfulSelectingOrangeColorTShirtSizeTest(){
        MainPageWorkClass.hoverTShirt();
        MainPageWorkClass.clickMoreTShirtButton();
        ProductPageWorkClass.selectTShirtSize("1");
        Assert.assertTrue(ProductPageWorkClass.SuccessfulTShirtColourSelectionDisplayed());
        Assert.assertEquals("S", ProductPageWorkClass.SuccessfulTShirtColourSelectionGetText());
        ProductPageWorkClass.clickOrangeColourButton();
        ProductPageWorkClass.clickBlueColourButton();
        MainPageWorkClass.clickAddToCartButton();
    }
}

