package test;

import base.BaseTest;
import org.junit.Before;
import org.junit.Test;
import page.AlreadyRegisteredPage;

public class AlreadyRegisteredPageTest extends BaseTest {

    AlreadyRegisteredPage AlreadyRegisteredPageWorkClass;

    @Before
    public void setUp3() {
        AlreadyRegisteredPageWorkClass = new AlreadyRegisteredPage();
    }

    @Test
    public void alreadyRegisteredSuccessfulTest() {

        AlreadyRegisteredPageWorkClass.clickSignInField();
        AlreadyRegisteredPageWorkClass.inputEmail("prvoslav@gmail.com");
        AlreadyRegisteredPageWorkClass.inputPassword("kikiriki123");
        AlreadyRegisteredPageWorkClass.clickForgotYourPasswordLink();
        AlreadyRegisteredPageWorkClass.clickSignInButton();
    }

    @Test
    public void alreadyRegisteredFailEmailDataTest1() {
        AlreadyRegisteredPageWorkClass.clickSignInField();
        AlreadyRegisteredPageWorkClass.inputEmail("nekimailgamail.com");
        AlreadyRegisteredPageWorkClass.inputPassword("123456");
        AlreadyRegisteredPageWorkClass.clickSignInButton();
        // Due to bug this test fails for now.
    }
    @Test
    public void alreadyRegisteredFailEmailDataTest2() {
        AlreadyRegisteredPageWorkClass.clickSignInField();
        AlreadyRegisteredPageWorkClass.inputEmail(" nekimail@gmail.com");
        AlreadyRegisteredPageWorkClass.inputPassword("1234567");
        AlreadyRegisteredPageWorkClass.clickSignInButton();
        //Due to bug this test fails for now.
    }
    @Test
    public void alreadyRegisteredFailEmailDataTest3() {
        AlreadyRegisteredPageWorkClass.clickSignInField();
        AlreadyRegisteredPageWorkClass.inputEmail("nekimail@@gmail.com");
        AlreadyRegisteredPageWorkClass.inputPassword("1234567");
        AlreadyRegisteredPageWorkClass.clickSignInButton();
        //Due to bug this test fails for now.
    }
    @Test
    public void alreadyRegisteredFailPasswordDataTest() {
        AlreadyRegisteredPageWorkClass.clickSignInField();
        AlreadyRegisteredPageWorkClass.inputEmail("nekimail@gmail.com");
        AlreadyRegisteredPageWorkClass.inputPassword(" ");
        AlreadyRegisteredPageWorkClass.clickSignInButton();
        // Due to bug this test fails for now.
    }
}