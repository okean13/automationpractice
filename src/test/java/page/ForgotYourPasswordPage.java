package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ForgotYourPasswordPage extends BaseTest {

   public ForgotYourPasswordPage() {
       
       PageFactory.initElements(driver,this);
   }

   public @FindBy(id ="email")
    WebElement EmailField;

   public @FindBy(xpath ="//p[@class=\"submit\"]")
    WebElement RetrievePasswordButton;

   public @FindBy(xpath = "//a[@title=\"Back to Login\"]")
    WebElement BackToLoginButton;

   public void inputEmailField(String Email){
       wdwait.until(ExpectedConditions.visibilityOf(EmailField));
       EmailField.clear();
       EmailField.sendKeys(Email);
   }
   public void clickRetrievePasswordButton(){
       wdwait.until(ExpectedConditions.visibilityOf(RetrievePasswordButton));
       RetrievePasswordButton.click();
   }
   public void clickBackToLoginButton(){
       wdwait.until(ExpectedConditions.visibilityOf(BackToLoginButton));
       BackToLoginButton.click();
   }
}
