package page;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends BaseTest {
    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(xpath = "//input[@name=\"qty\"]")
    WebElement QuantityInput;

    public @FindBy(xpath = "//i[@class=\"icon-plus\"]")
    WebElement PlusButton;

    public @FindBy(xpath = "//select[@id=\"group_1\"]")
    WebElement TShirtSize;

    public @FindBy(xpath = "//div[@id=\"uniform-group_1\"]/span")
    WebElement TShirtSizeLabel;

   // public @FindBy(xpath = "//option[@title=\"S\"]")
   // WebElement CheckedSizeButton;

    public @FindBy(xpath = "//li/a[@id=\"color_13\"]")
    WebElement OrangeColourButton;

    public @FindBy(xpath = "//li/a[@id=\"color_14\"]")
    WebElement BlueColourButton;

    public @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement AddToCart2Button;

    public @FindBy(xpath = "//a[@id=\"wishlist_button\"]")
    WebElement AddToWishlistButton;

    public @FindBy(xpath ="//p[@class=\"fancybox-error\"]")
    WebElement MustBeLoggedMessage;


    public void clickPlusButton() {
        wdwait.until(ExpectedConditions.visibilityOf(PlusButton));
        PlusButton.click();
    }

    public boolean successfulCheckingQuantityDisplayed() {
        wdwait.until(ExpectedConditions.visibilityOf(QuantityInput));
        return QuantityInput.isDisplayed();
    }

    public String successfulCheckingQuantityGetAttribute() {
        wdwait.until(ExpectedConditions.visibilityOf(QuantityInput));
        return QuantityInput.getAttribute("title");
    }

    public void selectTShirtSize(String value) {
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("group_1")));
        Select tShirtSize = new Select(TShirtSize);
        tShirtSize.selectByValue(value);
    }

    public void clickBlueColourButton() {
        wdwait.until(ExpectedConditions.visibilityOf(BlueColourButton));
        BlueColourButton.click();
    }
    public void clickOrangeColourButton(){
        wdwait.until(ExpectedConditions.visibilityOf(OrangeColourButton));
        OrangeColourButton.click();
}
    public boolean successfulTShirtSizeSelectionDisplayed() {
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\"uniform-group_1\"]/following::span")));
        return TShirtSizeLabel.isDisplayed();
    }

    public String successfulTShirtSizeSelectionGetText() {
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\"uniform-group_1\"]/following::span")));
        return TShirtSizeLabel.getText();
    }
    public boolean successfulTShirtColourSelectionDisplayed(){
        wdwait.until(ExpectedConditions.visibilityOf(OrangeColourButton));
        return OrangeColourButton.isDisplayed();
    }
    public String successfulTShirtColourSelectionGetAttribute(){
        wdwait.until(ExpectedConditions.visibilityOf(OrangeColourButton));
        return OrangeColourButton.getAttribute("class");
    }
    public void clickAddToCart2Button(){
        wdwait.until(ExpectedConditions.visibilityOf(AddToCart2Button));
        AddToCart2Button.click();
    }
    public void clickAddToWishlistButton(){
        wdwait.until(ExpectedConditions.visibilityOf(AddToWishlistButton));
        AddToWishlistButton.click();
    }
    public boolean unSuccessfulAddingToWishlistIsDisplayed(){
        wdwait.until(ExpectedConditions.visibilityOf(MustBeLoggedMessage));
        return MustBeLoggedMessage.isDisplayed();
    }
    public String unSuccessfulAddingToWishlistGetText(){
        wdwait.until(ExpectedConditions.visibilityOf(MustBeLoggedMessage));
        return MustBeLoggedMessage.getText();
    }
    }

