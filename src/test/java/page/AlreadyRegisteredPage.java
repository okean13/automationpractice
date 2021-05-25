package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlreadyRegisteredPage extends BaseTest{

    public AlreadyRegisteredPage(){

        PageFactory.initElements(driver,this);
   }
    public @FindBy(xpath ="//a[@class=\"login\"]")
    WebElement SignInField;

    public @FindBy(id ="email")
    WebElement EmailField;

    public @FindBy(id="passwd")
    WebElement PasswordField;

    public @FindBy(xpath ="//button[@id=\"SubmitLogin\"]")
    WebElement SignInButton;

    public @FindBy(css = ".lost_password.form-group")
    WebElement ForgotYourPasswordLink;

    public void clickSignInField(){
    wdwait.until(ExpectedConditions.elementToBeClickable(SignInField));
    SignInField.click();
    }
    public void inputEmail(String Email){
    wdwait.until(ExpectedConditions.visibilityOf(EmailField));
    EmailField.clear();
    EmailField.sendKeys(Email);
    }
    public void inputPassword(String Password){
    wdwait.until(ExpectedConditions.visibilityOf(PasswordField));
    PasswordField.clear();
    PasswordField.sendKeys(Password);
    }
    public void clickSignInButton(){
    wdwait.until(ExpectedConditions.visibilityOf(SignInButton));
    SignInButton.click();
    }
    public void clickForgotYourPasswordLink(){
    wdwait.until(ExpectedConditions.visibilityOf(ForgotYourPasswordLink));
    ForgotYourPasswordLink.click();
    }
}
