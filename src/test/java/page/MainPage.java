package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BaseTest {

    public MainPage()

    {
        PageFactory.initElements(driver,this);
    }

    public @FindBy(id ="header_logo")
    WebElement YourLogoLink;

    public @FindBy(xpath ="//div[@class=\"shopping_cart\"]")
    WebElement CartLink;

    public @FindBy(xpath ="//form[@id=\"searchbox\"]")
    WebElement SearchButton;

    public @FindBy(xpath ="//div[[id=\"newsletter_block_left\"]")
    WebElement NewsletterButton;

    public @FindBy(xpath ="//@input[id=\"newsletter-input\"]")
    WebElement EnterYourEmailfield;

    public @FindBy(id ="social_block")
    WebElement FollowUsButton;

    public @FindBy(className =".blockcategories_footer.footer-block.col-xs-12.col-sm-2")
    WebElement CategoriesButton;

    public @FindBy(className =".footer-block.col-xs-12.col-sm-2")
    WebElement InformationButton;

    public @FindBy(xpath ="//section[4]/h4[contains(text(),'My account')]")
    WebElement MyAccountButton;

    public @FindBy(xpath ="//section[5]/h4[contains(text(),'Store information')]")
    WebElement StoreInformationButton;

    public void clickYourLogoLink(){
    wdwait.until(ExpectedConditions.visibilityOf(YourLogoLink));
    YourLogoLink.click();
}
    public void cartLinkClick(){
        wdwait.until(ExpectedConditions.visibilityOf(CartLink));
        CartLink.click();
    }
    public void inputSearchButton(String keyword){
        wdwait.until(ExpectedConditions.elementToBeClickable(SearchButton));
        SearchButton.clear();
        SearchButton.sendKeys(keyword);
    }
    public void newsLetterButtonClick(){
        wdwait.until(ExpectedConditions.visibilityOf(NewsletterButton));
        NewsletterButton.click();
    }
    public void inputEnterYourEmail(String email){
        wdwait.until(ExpectedConditions.visibilityOf(EnterYourEmailfield));
        EnterYourEmailfield.clear();
        EnterYourEmailfield.sendKeys(email);
    }
    public void clickFollowUsButton(){
        wdwait.until(ExpectedConditions.visibilityOf(FollowUsButton));
        FollowUsButton.click();
    }
    public void clickCategories(){
        wdwait.until(ExpectedConditions.visibilityOf(CategoriesButton));
        CategoriesButton.click();
    }
    public void clickInformation(){
        wdwait.until(ExpectedConditions.visibilityOf(InformationButton));
        InformationButton.click();
    }
    public void clickMyAccount(){
        wdwait.until(ExpectedConditions.visibilityOf(MyAccountButton));
        MyAccountButton.click();
    }
    public void clickStoreInformation(){
        wdwait.until(ExpectedConditions.visibilityOf(StoreInformationButton));
        StoreInformationButton.click();
    }
    }




