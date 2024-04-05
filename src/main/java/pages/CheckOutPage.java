package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.webTestBase;
import util.WebElementUtil;


public class CheckOutPage extends webTestBase {
    @FindBy(xpath = "//a[@class='checkout-steps__step checkout-steps__step--payment checkout__go-to-step']")
    WebElement payment;

    @FindBy(xpath = "//a[@class='checkout-steps__step checkout-steps__step--delivery checkout__go-to-step']")
    WebElement delivery;
    @FindBy(xpath = "//div[@class='cart__remove__icon']")
    WebElement removeFromCart;

    public CheckOutPage(){
        PageFactory.initElements(driver,this);
    }
    public  void  goToPayment(){
        WebElementUtil.clickOnElement(payment);
    }

    public  void  goToDelivery(){
        WebElementUtil.clickOnElement(delivery);
    }

    public  void  removeFromCart(){
        WebElementUtil.clickOnElement(removeFromCart);
    }


}
