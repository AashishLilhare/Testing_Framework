package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.webTestBase;
import util.ActionUtil;
import util.DropDown;
import util.WebElementUtil;

public class AddToCartPage extends webTestBase {
    @FindBy(xpath = "//li[@class='user-controls__ul__li user-controls__ul__li--cart']")
    WebElement cartLogo;
    @FindBy(xpath = "//div[text()='Campos Superior Blend']")
    WebElement selectProduct;

    @FindBy(xpath = "//select[@class='pa_weight']")
    WebElement bagSize;
    @FindBy(xpath = "//div[text()='Whole Beans']")
    WebElement grind;
    @FindBy(xpath = "//span[@class='price']")
    WebElement addToCart;
    @FindBy(xpath = "//div[@class='added-to-cart-modal__title h2']")
    WebElement addedSuccessfullyText;
    @FindBy(xpath = "//a[text()='Checkout']")
    WebElement selectCheckout;

    public AddToCartPage(){
        PageFactory.initElements(driver,this);
    }

    public void selectProduct(){
        WebElementUtil.clickOnElement(selectProduct);
    }
    public void cartLogo(){
        WebElementUtil.clickOnElement(cartLogo);
    }
    public void selectBagSize(){
        DropDown.dropDownByIndex(bagSize,3);
    }
    public void selectGrind(){
        WebElementUtil.clickOnElement(grind);
    }
    public void selectAddToCart(){
        WebElementUtil.clickOnElement(addToCart);
    }
    public String  addedSuccessfully() {
        return WebElementUtil.getTextOfElements(addedSuccessfullyText);
    }
    public void selectCheckout(){
        WebElementUtil.clickOnElement(selectCheckout);
    }

}
