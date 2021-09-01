package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OrderPage extends BaseTest {
    public OrderPage(){

        PageFactory.initElements(driver,this);
    }
    public @FindBy(xpath = "//span[@class=\"heading-counter\"]")
    WebElement ProceedToCheckoutMessage;

    public boolean successfulProceedToCheckoutIsDisplayed(){
        wdwait.until(ExpectedConditions.visibilityOf(ProceedToCheckoutMessage));
        return ProceedToCheckoutMessage.isDisplayed();
    }
    public String successfulProceedToCheckoutGetText(){
        wdwait.until(ExpectedConditions.visibilityOf(ProceedToCheckoutMessage));
        return ProceedToCheckoutMessage.getText();
    }
}

