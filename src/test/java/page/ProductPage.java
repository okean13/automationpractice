package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BaseTest {
    public ProductPage(){
        PageFactory.initElements(driver,this);
    }

    public @FindBy(xpath = "//input[@id=\"quantity_wanted\"]")
    WebElement QuantityButton;

    public @FindBy(xpath = "//i[@class=\"icon-plus\"]")
    WebElement PlusButton;

    public void hoverPlusButton(){
    wdwait.until(ExpectedConditions.elementToBeClickable(PlusButton));
        Actions hover = new Actions(driver);
        hover.moveToElement(PlusButton).perform();
}
    public void clickPlusButton(){
        wdwait.until(ExpectedConditions.visibilityOf(PlusButton));
        PlusButton.click();
    }
    public boolean SuccessfulCheckingQuantityDisplayed(){
        wdwait.until(ExpectedConditions.visibilityOf(QuantityButton));
        return QuantityButton.isDisplayed();
    }
    public String SuccessfulCheckingQuantityGetText(){
        wdwait.until(ExpectedConditions.visibilityOf(QuantityButton));
        return QuantityButton.getText();
    }
}

