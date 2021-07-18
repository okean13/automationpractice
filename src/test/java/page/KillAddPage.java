package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class KillAddPage extends BaseTest {
    public KillAddPage(){
        PageFactory.initElements(driver,this);
    }
    public @FindBy(xpath = "//div[@class=\"close-news\"]")
    WebElement CloseAddButton;

    public void clickCloseAdd(){
        wdwait.until(ExpectedConditions.visibilityOf(CloseAddButton));
        CloseAddButton.click();
    }
}
