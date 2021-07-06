package page;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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

    public @FindBy(xpath = "//div/footer/div/section/h4[contains(text(),'Follow us')]")
    WebElement FollowUsButton;

    public @FindBy(xpath = "//div/section[@id='social_block']")
    WebElement SocialBlockLinks;

    public @FindBy(xpath = "//div/section[2]/h4[contains(text(),'Categories')]")
    WebElement CategoriesButton;

    public @FindBy(xpath = "//div/section[3]/h4[contains(text(),'Information')]")
    WebElement InformationButton;

    public @FindBy(xpath = "//div/section[4]/h4[contains(text(),'My account')]")
    WebElement MyAccountButton;

    public @FindBy(xpath = "//div/section[5]/h4[contains(text(),'Store information')]")
    WebElement StoreInformationButton;

    public @FindBy(xpath = "//div/p[@class=\"alert alert-success\"]")
    WebElement NewsletterMessage;

     public @FindBy(xpath = "//p[@class=\"alert alert-danger\"]")
    WebElement WarningNewsletterMessage;

    //public @FindBy(xpath ="//body[@id=\"top\"]")
    //WebElement NovaReklamaZaGasenje;

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

    public boolean unsuccessfulNewsletterSubscriptionDisplayed(){
        wdwait.until(ExpectedConditions.visibilityOf(WarningNewsletterMessage));
        return WarningNewsletterMessage.isDisplayed();
    }
    public String unsuccessfulNewsletterSubscriptionGetText(){
        wdwait.until(ExpectedConditions.visibilityOf(WarningNewsletterMessage));
        return WarningNewsletterMessage.getText();
}
    public void clickInformation() {
        wdwait.until(ExpectedConditions.visibilityOf(InformationButton));
        InformationButton.click();
    }

    public void clickMyAccount() {
        wdwait.until(ExpectedConditions.visibilityOf(MyAccountButton));
        MyAccountButton.click();
    }

    public void clickStoreInformation() {
        wdwait.until(ExpectedConditions.visibilityOf(StoreInformationButton));
        StoreInformationButton.click();
    }
}




