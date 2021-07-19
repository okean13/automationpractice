package test;

import base.BaseTest;
import com.sun.javafx.css.StyleCache;
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

    @Before
    public void SetUp5() {
        MainPageWorkClass = new MainPage();
        EmptySearchButtonPageWorkClass = new EmptySearchButtonPage();
        MoreButtonPageWorkClass = new MoreButtonPage();
        KillAddPageWorkClass = new KillAddPage();
        SearchButtonPageWorkClass = new SearchButtonPage();
        CategoryPageWorkClass = new CategoryPage();
    }

    @Test
    public void UnSuccessfulSearchTest() {
        MainPageWorkClass.clickYourLogoLink();
        MainPageWorkClass.cartLinkClick();
        MainPageWorkClass.inputSearchButton(" ");
        Assert.assertTrue(EmptySearchButtonPageWorkClass.successAlertDisplayed());
        Assert.assertEquals("0 results have been found.", EmptySearchButtonPageWorkClass.successAlertText());
    }

    @Test
    public void SuccessfulSearchTest() {
        MainPageWorkClass.clickYourLogoLink();
        MainPageWorkClass.cartLinkClick();
        MainPageWorkClass.inputSearchButton("Dresses");
        Assert.assertTrue(SearchButtonPageWorkClass.successfulSearchInputMessageDisplayed());
        Assert.assertEquals("7 results have been found.",SearchButtonPageWorkClass.successfulSearchInputMessageGetText());
    }

    @Test
    public void SuccessfulNewsletterSubscriptionTest() {
        MainPageWorkClass.newsLetterButtonClick();
        MainPageWorkClass.inputEnterYourEmail("trecitest@gmail.com");
        Assert.assertTrue(MainPageWorkClass.successfulNewsletterSubscriptionAlertDisplayed());
        Assert.assertEquals("Newsletter : You have successfully subscribed to this newsletter.", MainPageWorkClass.successfulNewsletterSubscriptionAlertGetText());
    }

    @Test
    public void UnsuccessfulNewsletterSubscriptionTest() {
        MainPageWorkClass.newsLetterButtonClick();
        MainPageWorkClass.inputEnterYourEmail("prvoslav@gmail.com");
        Assert.assertTrue(MainPageWorkClass.unsuccessfulNewsletterSubscriptionDisplayed());
        Assert.assertEquals("Newsletter : This email address is already registered.", MainPageWorkClass.unsuccessfulNewsletterSubscriptionGetText());
    }

    @Test
    public void SuccessfulAddToCartTest() {
        MainPageWorkClass.ScrollDown();
        MainPageWorkClass.hoverTShirt();
        MainPageWorkClass.clickAddToCartButton();
        Assert.assertTrue(MainPageWorkClass.successfulAddToCartAlertDisplayed());
        Assert.assertEquals("Product successfully added to your shopping cart", MainPageWorkClass.successfulAddToCartAlertGetText());
    }

    @Test
    public void SuccessfulMoreButtonTest() {
        MainPageWorkClass.hoverTShirt();
        MainPageWorkClass.clickMoreTShirtButton();
        Assert.assertTrue(MoreButtonPageWorkClass.successfulTShirtDescriptionDisplayed());
        Assert.assertEquals("Faded short sleeve t-shirt with high neckline. Soft and stretchy material for a comfortable fit. Accessorize with a straw hat and you're ready for summer!",MoreButtonPageWorkClass.successfulTShirtDescriptionGetText());
    }
    @Test
    public void SuccessfulShopNowTest(){
        MainPageWorkClass.clickShopNow();
        KillAddPageWorkClass.clickCloseAdd();
        //This test passes even when KillAddPageWorkClass does not exist.
    }
    @Test
    public void SuccessfulTopsTest(){
        MainPageWorkClass.hoverWomenCategoryButton();
        MainPageWorkClass.clickTopsButton();
        Assert.assertTrue(CategoryPageWorkClass.successfulTopsAlertDisplayed());
        Assert.assertEquals("Choose from t-shirts, tops, blouses, short sleeves, long sleeves, tank tops, 3/4 sleeves and more.\n" +
                 "Find the cut that suits you the best!",CategoryPageWorkClass.successfulTopsAlertGetText());
    }
}

