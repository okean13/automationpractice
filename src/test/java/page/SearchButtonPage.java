package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchButtonPage extends BaseTest {
    public SearchButtonPage(){
        PageFactory.initElements(driver,this);
    }
    public @FindBy(xpath ="//span[@class=\"heading-counter\"]")
    WebElement SearchMessage;

    public boolean successfulSearchInputMessageDisplayed(){
        wdwait.until(ExpectedConditions.visibilityOf(SearchMessage));
        return SearchMessage.isDisplayed();
    }
    public String successfulSearchInputMessageGetText(){
        wdwait.until(ExpectedConditions.visibilityOf(SearchMessage));
        return SearchMessage.getText();
    }
}
