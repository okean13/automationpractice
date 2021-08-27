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
    WebElement QuantityButton;

    public @FindBy(xpath = "//i[@class=\"icon-plus\"]")
    WebElement PlusButton;

    public @FindBy(xpath = "//select[@id=\"group_1\"]")
    WebElement TShirtSizeButton;

    public @FindBy(xpath = "//option[@title=\"S\"]")
    WebElement CheckedSizeButton;

    public @FindBy(xpath = "//li/a[@id=\"color_13\"]")
    WebElement OrangeColourButton;

    public @FindBy(xpath = "//li/a[@id=\"color_14\"]")
    WebElement BlueColourButton;

    public void hoverPlusButton() {
        wdwait.until(ExpectedConditions.elementToBeClickable(PlusButton));
        Actions hover = new Actions(driver);
        hover.moveToElement(PlusButton).perform();
    }

    public void clickPlusButton() {
        wdwait.until(ExpectedConditions.visibilityOf(PlusButton));
        PlusButton.click();
    }

    public boolean successfulCheckingQuantityDisplayed() {
        wdwait.until(ExpectedConditions.visibilityOf(QuantityButton));
        return QuantityButton.isDisplayed();
    }

    public String successfulCheckingQuantityGetText() {
        wdwait.until(ExpectedConditions.visibilityOf(QuantityButton));
        return QuantityButton.getText();
    }

    public void selectTShirtSize(String value) {
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("group_1")));
        Select tShirtSize = new Select(TShirtSizeButton);
        tShirtSize.selectByValue(value);
    }

    public String SuccessfulTShirtSizeSelectionGetText() {
        wdwait.until(ExpectedConditions.visibilityOf(CheckedSizeButton));
        return CheckedSizeButton.getText();
    }

    public void clickBlueColourButton() {
        wdwait.until(ExpectedConditions.visibilityOf(BlueColourButton));
        BlueColourButton.click();
    }
    public void clickOrangeColourButton(){
        wdwait.until(ExpectedConditions.visibilityOf(OrangeColourButton));
        OrangeColourButton.click();
}
    public boolean SuccessfulTShirtColourSelectionDisplayed() {
        wdwait.until(ExpectedConditions.visibilityOf(CheckedSizeButton));
        return CheckedSizeButton.isDisplayed();
    }

    public String SuccessfulTShirtColourSelectionGetText() {
        wdwait.until(ExpectedConditions.visibilityOf(CheckedSizeButton));
        return CheckedSizeButton.getText();
    }
}

