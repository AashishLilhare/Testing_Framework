package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.RegisterPage;
import testbase.webTestBase;

public class LoginTest extends webTestBase {
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    LoginTest(){
        super();

    }
    @BeforeMethod
    public  void preRequisite(){
        initialization();
        homePage =new HomePage();
        loginPage=new LoginPage();
        myAccountPage= new MyAccountPage();
    }
    @Test
    public void verifyLoginWithValidUserNameAndPassword(){
        SoftAssert softAssert=new SoftAssert();
        homePage.closeFirstAdd();
        homePage.loginAndRegister();
        loginPage.setLogin(prop.getProperty("registerUserName"), prop.getProperty("registerPassword") );
        softAssert.assertEquals(myAccountPage.getMyAccountElement(),"MY ACCOUNT","MY ACCOUNT should be matched");
        softAssert.assertAll();
    }
    @Test
    public void verifyLoginWithValidUserNameAndInValidPassword(){
        SoftAssert softAssert=new SoftAssert();
        homePage.closeFirstAdd();
        homePage.loginAndRegister();
        loginPage.setInvalidLogin(prop.getProperty("userName"), prop.getProperty("password") );
        softAssert.assertEquals(loginPage.getError(),"ERROR: The username or password you entered is incorrect. Lost your password?","verify Error msg");
        softAssert.assertAll();
    }
    @Test
    public void verifyLoginWithValidUserNameAndNoPassword(){
        SoftAssert softAssert=new SoftAssert();
        homePage.closeFirstAdd();
        homePage.loginAndRegister();
        loginPage.setValidUser(prop.getProperty("userName"));
        softAssert.assertEquals(loginPage.getError(),"Error: The password field is empty.","verify Error msg");
        softAssert.assertAll();
    }
    @Test
    public void verifyLoginWithNoUserNameAndValidPassword(){
        SoftAssert softAssert=new SoftAssert();
        homePage.closeFirstAdd();
        homePage.loginAndRegister();
        loginPage.setValidPassword(prop.getProperty("password"));
        softAssert.assertEquals(loginPage.getError(),"Error: Username is required.","verify Error msg");
        softAssert.assertAll();
    }
    @Test
    public void verifyLoginWithValidUserNameAndMultipleInvalidPassword(){
        SoftAssert softAssert=new SoftAssert();
        homePage.closeFirstAdd();
        homePage.loginAndRegister();
        loginPage.setLogin(prop.getProperty("userName"),prop.getProperty("password"));
        loginPage.setValidPassword(prop.getProperty("password1"));
        loginPage.setValidPassword(prop.getProperty("password2"));
        loginPage.setValidPassword(prop.getProperty("password3"));
        loginPage.setValidPassword(prop.getProperty("password4"));
        softAssert.assertEquals(loginPage.getError(),"Error: The password field is empty.","verify Error msg");
        softAssert.assertAll();
    }
    @Test
    public void verifyRememberMeIsClickable(){
        homePage.closeFirstAdd();
        homePage.loginAndRegister();
        loginPage.clickOnRememberMe();
    }
    @Test
    public void verifyLostPassword(){
        homePage.closeFirstAdd();
        homePage.loginAndRegister();
        loginPage.clickLostPassword();
        loginPage.setUserEmail(prop.getProperty("userName"));
    }


    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
