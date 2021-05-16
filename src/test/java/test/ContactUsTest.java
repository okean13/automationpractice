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
    public void contactUsValidDataInMandatoryFieldsTest1() {
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
    @Test
    public void contactUsInvalidDataInSubjectHeadingTest() {
        ContactUsPage.clickContactUsButton();
        ContactUsPage.selectHeading("0");
        ContactUsPage.inputEmailAddress("prvoslav@gmail.com");
        ContactUsPage.inputOrderReference(11133);
        ContactUsPage.inputMessage("test broj 2");
        ContactUsPage.clickSendButton();
        Assert.assertTrue(ContactUsPage.failedAlertDisplayed());
        Assert.assertEquals("There is 1 error\n" +
                "Please select a subject from the list provided.",ContactUsPage.failedAlertText());
    }

    @Test
    public void contactUsValidDataInMandatoryFieldsTest2() {
        ContactUsPage.clickContactUsButton();
        ContactUsPage.selectHeading("1");
        ContactUsPage.inputEmailAddress("prvoslav@gmail.com");
        ContactUsPage.inputOrderReference(11133);
        ContactUsPage.inputMessage("test broj 3");
        ContactUsPage.clickSendButton();
        Assert.assertTrue(ContactUsPage.successAlertDisplayed());
        Assert.assertEquals("Your message has been successfully sent to our team.",ContactUsPage.successAlertText());
    }
    @Test
    public void contactUsInvalidDataEmailAddressFieldTest() {
        ContactUsPage.clickContactUsButton();
        ContactUsPage.selectHeading("1");
        ContactUsPage.inputEmailAddress("prvoslavgmail.com");
        ContactUsPage.inputOrderReference(+11133);
        ContactUsPage.inputMessage("test broj 4");
        ContactUsPage.clickSendButton();
        Assert.assertTrue(ContactUsPage.failedAlertDisplayed());
        Assert.assertEquals("There is 1 error\n" +
                "Invalid email address.",ContactUsPage.failedAlertText());
    }
    @Test
    public void contactUsInvalidDataOrderReferenceTest() {
        ContactUsPage.clickContactUsButton();
        ContactUsPage.selectHeading("1");
        ContactUsPage.inputEmailAddress("prvoslav@gmail.com");
        ContactUsPage.inputOrderReference(-11133);
        ContactUsPage.inputMessage("test broj 5");
        ContactUsPage.clickSendButton();
        Assert.assertTrue(ContactUsPage.failedOrderReferenceDisplayed());
        Assert.assertEquals("500 Server Error\n" +
                "Oops, something went wrong.\n" +
                "\n" +
                "Try to refresh this page or feel free to contact us if the problem persists.", ContactUsPage.failedOrderReferenceText());
    }
}

