package page;

import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class MainPage extends BaseTest {

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(id = "header_logo")
    WebElement YourLogoLink;

    public @FindBy(xpath = "//div[@class=\"shopping_cart\"]")
    WebElement CartLink;

    public @FindBy(xpath = "//form/input[4][@name=\"search_query\"]")
    WebElement SearchButton;

    public @FindBy(xpath = "//div/h4[contains(text(),'Newsletter')]")
    WebElement NewsletterButton;

    public @FindBy(xpath = "//div/input[@value=\"Enter your e-mail\"]")
    WebElement EnterYourEmailfield;

    public @FindBy(xpath = "//div/p[@class=\"alert alert-success\"]")
    WebElement NewsletterMessage;

    public @FindBy(xpath = "//p[@class=\"alert alert-danger\"]")
    WebElement WarningNewsletterMessage;

    public @FindBy(xpath = "(//ul/li/div[@class=\"product-container\"])[1]")
    WebElement TShirtButton;

    public @FindBy(xpath = "(//a[@data-id-product=\"1\"])[1]")
    WebElement AddToCartButton;

    public @FindBy(xpath = "//div[@class=\"layer_cart_product col-xs-12 col-md-6\"]/h2")
    WebElement AddToCartMessage;

    public @FindBy(xpath = "//span[contains(text(),'More')]")
    WebElement MoreTShirtButton;

    public @FindBy(xpath = "//div/a[@title=\"Product detail\"]")
    WebElement ProductsInCartButton;

    public @FindBy(xpath = "//a[@title=\"sample-2\"]/following::p[2]")
    WebElement ShopNowButton;

    public @FindBy(xpath = "//div[@class=\"cat-title\"]/following::a")
    WebElement WomenCategoryButton;

    public @FindBy(xpath = "//div[@class=\"cat-title\"]/following::a[2]")
    WebElement TopsButton;


    public void clickYourLogoLink() {
        wdwait.until(ExpectedConditions.visibilityOf(YourLogoLink));
        YourLogoLink.click();
    }

    public void cartLinkClick() {
        wdwait.until(ExpectedConditions.visibilityOf(CartLink));
        CartLink.click();
    }

    public void inputSearchButton(String keyword) {
        wdwait.until(ExpectedConditions.visibilityOf(SearchButton));
        SearchButton.clear();
        SearchButton.sendKeys(keyword);
        SearchButton.sendKeys(Keys.ENTER);
    }

    public void newsLetterButtonClick() {
        wdwait.until(ExpectedConditions.visibilityOf(NewsletterButton));
        NewsletterButton.click();
    }

    public boolean successfulNewsletterSubscriptionAlertDisplayed() {
        wdwait.until(ExpectedConditions.visibilityOf(NewsletterMessage));
        return NewsletterMessage.isDisplayed();
    }

    public String successfulNewsletterSubscriptionAlertGetText() {
        wdwait.until(ExpectedConditions.visibilityOf(NewsletterMessage));
        return NewsletterMessage.getText();
    }

    public void inputEnterYourEmail(String email) {
        wdwait.until(ExpectedConditions.visibilityOf(EnterYourEmailfield));
        EnterYourEmailfield.clear();
        EnterYourEmailfield.sendKeys(email);
        EnterYourEmailfield.sendKeys(Keys.ENTER);
    }

    public boolean unsuccessfulNewsletterSubscriptionDisplayed() {
        wdwait.until(ExpectedConditions.visibilityOf(WarningNewsletterMessage));
        return WarningNewsletterMessage.isDisplayed();
    }

    public String unsuccessfulNewsletterSubscriptionGetText() {
        wdwait.until(ExpectedConditions.visibilityOf(WarningNewsletterMessage));
        return WarningNewsletterMessage.getText();
    }

    public void hoverTShirt() {
        wdwait.until(ExpectedConditions.elementToBeClickable(TShirtButton));
        Actions hover = new Actions(driver);
        hover.moveToElement(TShirtButton).perform();
    }

    public void clickTShirtButton() {
        wdwait.until(ExpectedConditions.visibilityOf(TShirtButton));
        TShirtButton.click();
    }

    public void clickAddToCartButton() {
        wdwait.until(ExpectedConditions.visibilityOf(AddToCartButton));
        AddToCartButton.click();
    }

    public boolean successfulAddToCartAlertDisplayed() {
        wdwait.until(ExpectedConditions.visibilityOf(AddToCartMessage));
        return AddToCartMessage.isDisplayed();
    }

    public String successfulAddToCartAlertGetText() {
        wdwait.until(ExpectedConditions.visibilityOf(AddToCartMessage));
        return AddToCartMessage.getText();
    }

    public void ScrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", TShirtButton);
    }
    public void clickMoreTShirtButton() {
        wdwait.until(ExpectedConditions.visibilityOf(MoreTShirtButton));
        MoreTShirtButton.click();
    }
    public void clickShopNow(){
        wdwait.until(ExpectedConditions.visibilityOf(ShopNowButton));
        ShopNowButton.click();
    }
    public void hoverWomenCategoryButton(){
        wdwait.until(ExpectedConditions.visibilityOf(WomenCategoryButton));
        Actions hover = new Actions(driver);
        hover.moveToElement(WomenCategoryButton).perform();
    }
    public void clickTopsButton(){
        wdwait.until(ExpectedConditions.visibilityOf(TopsButton));
        TopsButton.click();
    }
}






