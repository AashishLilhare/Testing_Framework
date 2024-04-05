package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AddToCartPage;
import pages.HomePage;
import testbase.webTestBase;

public class AddToCartTest extends webTestBase {
    HomePage homePage;
    AddToCartPage addToCartPage;

    AddToCartTest(){
        super();
    }
    @BeforeMethod
    public void preRequisite(){
        initialization();
        homePage =new HomePage();
        addToCartPage=new AddToCartPage();
    }
    @Test
    public void verifyProductIsSelectable(){
        homePage.closeFirstAdd();
        addToCartPage.cartLogo();
        homePage.closeFirstAdd();
        addToCartPage.selectProduct();
    }

    @Test
    public void verifyProductIsAddedToCart(){
       SoftAssert softAssert=new SoftAssert();
        homePage.closeFirstAdd();
        addToCartPage.cartLogo();
        homePage.closeFirstAdd();
        addToCartPage.selectProduct();
        addToCartPage.selectBagSize();
        addToCartPage.selectGrind();
        addToCartPage.selectAddToCart();
        addToCartPage.selectCheckout();
        softAssert.assertEquals(driver.getTitle(),"Checkout - Campos Coffee");
        softAssert.assertAll();


    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

}
