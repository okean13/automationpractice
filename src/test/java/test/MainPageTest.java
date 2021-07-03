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

}