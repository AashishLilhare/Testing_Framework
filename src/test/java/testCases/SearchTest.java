package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.SearchPage;
import testbase.webTestBase;

public class SearchTest extends webTestBase {
    HomePage homePage;
    SearchPage searchPage;

    SearchTest(){
        super();

    }
    @BeforeMethod
    public  void preRequisite(){
        initialization();
        homePage =new HomePage();
        searchPage=new SearchPage();

    }
    @Test
    public void verifySearchText() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        homePage.closeFirstAdd();
        searchPage.setSearch(prop.getProperty("searchText"));
        softAssert.assertEquals(driver.getTitle(),"You searched for milk - Campos Coffee","Page title verification  ");
        Thread.sleep(3000);
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
