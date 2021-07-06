package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.EmptySearchButtonPage;
import page.MainPage;
import sun.applet.Main;


    public class MainPageTest extends BaseTest {

        MainPage MainPageWorkClass;
        EmptySearchButtonPage EmptySearchButtonPageWorkClass;

        @Before
        public void SetUp5() {
            MainPageWorkClass = new MainPage();
            EmptySearchButtonPageWorkClass = new EmptySearchButtonPage();
        }

        @Test
        public void UnSuccessfulSearchTest() {
            MainPageWorkClass.clickYourLogoLink();
            MainPageWorkClass.cartLinkClick();
            MainPageWorkClass.inputSearchButton(" ");
            Assert.assertTrue(EmptySearchButtonPageWorkClass.successAlertDisplayed());
            Assert.assertEquals("0 results have been found.", EmptySearchButtonPageWorkClass.successAlertText());
        }


        @Test
        public void SuccessfulSearchTest() {
            MainPageWorkClass.clickYourLogoLink();
            MainPageWorkClass.cartLinkClick();
            MainPageWorkClass.inputSearchButton("Dresses");
        }

        @Test
        public void SuccessfulNewsletterSubscriptionTest() {
            MainPageWorkClass.newsLetterButtonClick();
            MainPageWorkClass.inputEnterYourEmail("trecitest@gmail.com");
            Assert.assertTrue(MainPageWorkClass.successfulNewsletterSubscriptionAlertDisplayed());
            Assert.assertEquals("Newsletter : You have successfully subscribed to this newsletter.", MainPageWorkClass.successfulNewsletterSubscriptionAlertGetText());
        }
        @Test
        public void UnsuccessfulNewsletterSubscriptionTest(){
            MainPageWorkClass.newsLetterButtonClick();
            MainPageWorkClass.inputEnterYourEmail("prvoslav@gmail.com");
            Assert.assertTrue(MainPageWorkClass.unsuccessfulNewsletterSubscriptionDisplayed());
            Assert.assertEquals("Newsletter : This email address is already registered.", MainPageWorkClass.unsuccessfulNewsletterSubscriptionGetText());
        }
    }
