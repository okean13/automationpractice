package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.contactUsPage;

public class ContactUsTest extends BaseTest {

    contactUsPage ContactUsPage;

    @Before
    public void setUp2(){
        ContactUsPage = new contactUsPage();
    }

    @Test
    public void tearDown2() {
        ContactUsPage.clickContactUsButton();
        ContactUsPage.selectHeading("2");
        ContactUsPage.inputEmailAddress("prvoslav@gmail.com");
         ContactUsPage.inputOrderReference(1133);
        ContactUsPage.clickAttachFileButton();
        ContactUsPage.inputMessage("Tralala");
        ContactUsPage.clickSendButton();
        Assert.assertTrue(ContactUsPage.successAlertDisplayed());
        Assert.assertEquals("Your message has been successfully sent to our team.",ContactUsPage.successAlertText());
    }
}
