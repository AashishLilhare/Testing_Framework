package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testbase.webTestBase;

public class MyAccountTest extends webTestBase {
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
     MyAccountTest(){
        super();
    }
    @BeforeMethod
    public void preRequisite(){
         initialization();
         homePage=new HomePage();
         loginPage=new LoginPage();
         myAccountPage=new MyAccountPage();
    }
    @Test
    public void verifyLogOut(){
         homePage.closeFirstAdd();
         homePage.loginAndRegister();
        loginPage.setLogin(prop.getProperty("registerUserName"), prop.getProperty("registerPassword") );
        myAccountPage.ClickOnLogOut();
        myAccountPage.ClickOnConfirmLogOut();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
