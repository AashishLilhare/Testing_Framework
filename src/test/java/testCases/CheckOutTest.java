package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.CheckOutPage;
import pages.HomePage;
import testbase.webTestBase;

public class CheckOutTest extends webTestBase {
    HomePage homePage;
    AddToCartPage addToCartPage;
    CheckOutPage checkOutPage;

    CheckOutTest(){
        super();
    }

    @BeforeMethod
    public void preRequisite(){
        initialization();
        homePage =new HomePage();
        addToCartPage=new AddToCartPage();
        checkOutPage=new CheckOutPage();
    }
    @Test
    public void verifyPaymentTab(){
        homePage.closeFirstAdd();
        addToCartPage.cartLogo();
        homePage.closeFirstAdd();
        addToCartPage.selectProduct();
        addToCartPage.selectBagSize();
        addToCartPage.selectGrind();
        addToCartPage.selectAddToCart();
        addToCartPage.selectCheckout();
        checkOutPage.goToPayment();

    }
    @Test
    public void verifyDeliveryTab(){
        homePage.closeFirstAdd();
        addToCartPage.cartLogo();
        homePage.closeFirstAdd();
        addToCartPage.selectProduct();
        addToCartPage.selectBagSize();
        addToCartPage.selectGrind();
        addToCartPage.selectAddToCart();
        addToCartPage.selectCheckout();
        checkOutPage.goToDelivery();

    }
    @Test
    public void verifyRemoveFromCart(){
        homePage.closeFirstAdd();
        addToCartPage.cartLogo();
        homePage.closeFirstAdd();
        addToCartPage.selectProduct();
        addToCartPage.selectBagSize();
        addToCartPage.selectGrind();
        addToCartPage.selectAddToCart();
        addToCartPage.selectCheckout();
        checkOutPage.removeFromCart();

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
