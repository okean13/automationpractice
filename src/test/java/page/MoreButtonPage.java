package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MoreButtonPage extends BaseTest {

    public MoreButtonPage() {
        PageFactory.initElements(driver, this);
    }


    public @FindBy(xpath = "//select[@id=\"group_1\"]")
    WebElement SizeButton;

    public @FindBy(xpath = "//li[@class=\"selected\" and title=\"Orange\"]")
    WebElement colorButton;

    public @FindBy(xpath = "//div[@id=\"short_description_content\"]/p")
    WebElement DescriptionButton;


    public boolean successfulTShirtDescriptionDisplayed(){
        wdwait.until(ExpectedConditions.visibilityOf(DescriptionButton));
        return DescriptionButton.isDisplayed();
    }
    public String successfulTShirtDescriptionGetText(){
        wdwait.until(ExpectedConditions.visibilityOf(DescriptionButton));
        return DescriptionButton.getText();
    }
    }
