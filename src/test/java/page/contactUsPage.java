package page;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class contactUsPage extends BaseTest {

    public contactUsPage() {
        PageFactory.initElements(driver, this);

    }

    public @FindBy(id = "contact-link")
    WebElement ContactUsButton;

    public @FindBy(id = "id_contact")
    WebElement SubjectHeadingCheckBoxButton;

    public @FindBy(xpath = "//input[@id=\"email\"]")
    WebElement EmailAddressField;

    public @FindBy(xpath = "//input[@id=\"id_order\"]")
    WebElement OrderReferenceField;

    public @FindBy(xpath = "//div[@class=\"uploader\"]")
    WebElement AttachFileButton;

    public @FindBy(id = "submitMessage")
    WebElement SendButton;

    public @FindBy(id = "message")
    WebElement MessageField;

    public @FindBy(xpath ="//p[@class=\"alert alert-success\"]")
    WebElement SuccessfulMessage;

    public void clickContactUsButton() {
        wdwait.until(ExpectedConditions.visibilityOf(ContactUsButton));
        ContactUsButton.click();
    }

    public void selectHeading(String value) {
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_contact")));
        Select headingCheckBox = new Select(SubjectHeadingCheckBoxButton);
        headingCheckBox.selectByValue(value);
    }

    public void inputEmailAddress(String email) {
        wdwait.until(ExpectedConditions.visibilityOf(EmailAddressField));
        EmailAddressField.clear();
        EmailAddressField.sendKeys(email);
    }

    public void inputOrderReference(long number) {
        wdwait.until(ExpectedConditions.visibilityOf(OrderReferenceField));
        OrderReferenceField.clear();
        OrderReferenceField.sendKeys(String.valueOf(number));
    }

    public void clickAttachFileButton() {
        wdwait.until(ExpectedConditions.elementToBeClickable(AttachFileButton));
        AttachFileButton.click();
    }

    public void inputMessage(String message) {
        wdwait.until(ExpectedConditions.visibilityOf(MessageField));
        MessageField.clear();
        MessageField.sendKeys(message);
    }

    public void clickSendButton() {
        wdwait.until(ExpectedConditions.visibilityOf(SendButton));
        SendButton.click();
    }
    public boolean successAlertDisplayed(){
        wdwait.until(ExpectedConditions.visibilityOf(SuccessfulMessage));
        return SuccessfulMessage.isDisplayed();
    }

    public String successAlertText(){
        wdwait.until(ExpectedConditions.visibilityOf(SuccessfulMessage));
        return SuccessfulMessage.getText();
    }
}
