package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import testbase.webTestBase;
import util.WebElementUtil;

public class HomePageTest extends webTestBase {

    HomePage homePage;
    HomePageTest(){
        super();
    }
    @BeforeMethod
    public  void preRequisite(){
        initialization();
        homePage =new HomePage();
    }
    @Test
    public void scrollDownTest() throws InterruptedException {
        homePage.closeFirstAdd();
        homePage.pageScroll();
        Thread.sleep(2000);
    }

    @Test
    public void verifyOurStoryDropDown() throws InterruptedException {
        homePage.closeFirstAdd();
        homePage.clickOnOurStory();
        homePage.clickOnOurCoffee();
        WebElementUtil.backNavigation();
        Thread.sleep(2000);
        homePage.closeFirstAdd();
        homePage.clickOnOurStory();
        homePage.clickOnOurMission();
        WebElementUtil.backNavigation();
    }
    @Test
    public void verifySubscriptionDropDown() throws InterruptedException {
        homePage.closeFirstAdd();
        homePage.clickOnSubscription();
        homePage.clickOnCapsules();
        Thread.sleep(2000);
        WebElementUtil.backNavigation();
        Thread.sleep(2000);

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }


}
