package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import testbase.webTestBase;

public class RegisterTest extends webTestBase {
    HomePage homePage;
    RegisterPage registerPage;

    RegisterTest(){
        super();
    }
    @BeforeMethod
    public void preRequisite(){
        initialization();
        homePage=new HomePage();
        registerPage=new RegisterPage();
    }
    @Test
    public void verifyRegistrationPage(){
        homePage.closeFirstAdd();
        homePage.loginAndRegister();
        registerPage.registerLink();
        registerPage.setRegister(prop.getProperty("registerUserName"), prop.getProperty("registerPassword"));
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
