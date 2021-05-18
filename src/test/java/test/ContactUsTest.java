package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.ContactUsPage;

public class ContactUsTest extends BaseTest {

    page.ContactUsPage ContactUsPageWorkClass;

    @Before
    public void setUp2()
    {
        ContactUsPageWorkClass = new ContactUsPage();
        
    }

    @Test
    public void contactUsValidDataInMandatoryFieldsTest1() {
        ContactUsPageWorkClass.clickContactUsButton();
        ContactUsPageWorkClass.selectHeading("2");
        ContactUsPageWorkClass.inputEmailAddress("prvoslav@gmail.com");
        ContactUsPageWorkClass.inputOrderReference(1133);
        ContactUsPageWorkClass.clickAttachFileButton();
        ContactUsPageWorkClass.inputMessage("Tralala");
        ContactUsPageWorkClass.clickSendButton();
        Assert.assertTrue(ContactUsPageWorkClass.successAlertDisplayed());
        Assert.assertEquals("Your message has been successfully sent to our team.",ContactUsPageWorkClass.successAlertText());
    }
    @Test
    public void contactUsInvalidDataInSubjectHeadingTest() {
        ContactUsPageWorkClass.clickContactUsButton();
        ContactUsPageWorkClass.selectHeading("0");
        ContactUsPageWorkClass.inputEmailAddress("prvoslav@gmail.com");
        ContactUsPageWorkClass.inputOrderReference(11133);
        ContactUsPageWorkClass.inputMessage("test broj 2");
        ContactUsPageWorkClass.clickSendButton();
        Assert.assertTrue(ContactUsPageWorkClass.failedAlertDisplayed());
        Assert.assertEquals("There is 1 error\n" +
                "Please select a subject from the list provided.",ContactUsPageWorkClass.failedAlertText());
    }

    @Test
    public void contactUsValidDataInMandatoryFieldsTest2() {
        ContactUsPageWorkClass.clickContactUsButton();
        ContactUsPageWorkClass.selectHeading("1");
        ContactUsPageWorkClass.inputEmailAddress("prvoslav@gmail.com");
        ContactUsPageWorkClass.inputOrderReference(11133);
        ContactUsPageWorkClass.inputMessage("test broj 3");
        ContactUsPageWorkClass.clickSendButton();
        Assert.assertTrue(ContactUsPageWorkClass.successAlertDisplayed());
        Assert.assertEquals("Your message has been successfully sent to our team.",ContactUsPageWorkClass.successAlertText());
    }
    @Test
    public void contactUsInvalidDataEmailAddressFieldTest() {
        ContactUsPageWorkClass.clickContactUsButton();
        ContactUsPageWorkClass.selectHeading("1");
        ContactUsPageWorkClass.inputEmailAddress("prvoslavgmail.com");
        ContactUsPageWorkClass.inputOrderReference(11133);
        ContactUsPageWorkClass.inputMessage("test broj 4");
        ContactUsPageWorkClass.clickSendButton();
        Assert.assertTrue(ContactUsPageWorkClass.failedAlertDisplayed());
        Assert.assertEquals("There is 1 error\n" +
                "Invalid email address.",ContactUsPageWorkClass.failedAlertText());
    }

    @Test
    public void contactUsInvalidDataMessageFieldTest() {
        ContactUsPageWorkClass.clickContactUsButton();
        ContactUsPageWorkClass.selectHeading("1");
        ContactUsPageWorkClass.inputEmailAddress("prvoslav@gmail.com");
        ContactUsPageWorkClass.inputOrderReference(11133);
        ContactUsPageWorkClass.clickSendButton();
        Assert.assertTrue(ContactUsPageWorkClass.failedAlertDisplayed());
        Assert.assertEquals("There is 1 error\n" +
                "The message cannot be blank.",ContactUsPageWorkClass.failedAlertText());
    }

    @Test
    public void contactUsInvalidDataOrderReferenceTest() {
        ContactUsPageWorkClass.clickContactUsButton();
        ContactUsPageWorkClass.selectHeading("1");
        ContactUsPageWorkClass.inputEmailAddress("prvoslav@gmail.com");
        ContactUsPageWorkClass.inputOrderReference(-11133);
        ContactUsPageWorkClass.inputMessage("test broj 5");
        ContactUsPageWorkClass.clickSendButton();
        // Due to bug this test fails for now.
        Assert.assertTrue(ContactUsPageWorkClass.failedAlertDisplayed());
        Assert.assertEquals("There is 1 error\n" +
                "The Order reference is invalid.",ContactUsPageWorkClass.failedAlertText());
    }
}

