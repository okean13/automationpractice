package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CategoryPage extends BaseTest {
    public CategoryPage(){
        PageFactory.initElements(driver,this);
    }

    public @FindBy(xpath = "//div[@class=\"rte\"]")
    WebElement TopsText;

    public boolean successfulTopsAlertDisplayed(){
        wdwait.until(ExpectedConditions.visibilityOf(TopsText));
        return TopsText.isDisplayed();
    }
    public String successfulTopsAlertGetText(){
        wdwait.until(ExpectedConditions.visibilityOf(TopsText));
        return TopsText.getText();
    }
    }
