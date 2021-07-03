package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EmptySearchButtonPage extends BaseTest {

    public EmptySearchButtonPage()
    {
        PageFactory.initElements(driver,this);
    }

    public @FindBy(xpath ="//div/h1/span[@class=\"heading-counter\"]")
    WebElement WarningMessage;

    public @FindBy(xpath ="//div/h1/p[@class=\"alert alert-warning\"]")
    WebElement NewMessage;

    public boolean successAlertDisplayed(){
        wdwait.until(ExpectedConditions.visibilityOf(WarningMessage));
        return WarningMessage.isDisplayed();
    }
    public String successAlertText(){
        wdwait.until(ExpectedConditions.visibilityOf(WarningMessage));
        return WarningMessage.getText();
    }
}
