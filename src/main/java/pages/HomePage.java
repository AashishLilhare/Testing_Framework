package pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.webTestBase;
import util.BootStrapDropDownUtil;
import util.DropDown;
import util.WebElementUtil;
import util.webDriverUtil;

import java.util.List;

public class HomePage extends webTestBase {
    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement closedAdd;

    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
            WebElement loginLogo;
    @FindBy(xpath = "//div[text()='Campos Coffee']")
    WebElement lastElement;
    @FindBy(xpath = "//li[@id='menu-item-372795']//child::li/a")
    List<WebElement> ourStoryElements;
    @FindBy(xpath = "//div[@class='menu__ul__li__icon accordion__toggle'][1]")
    WebElement ourStoryLogo;

    @FindBy(xpath = "//li[@id='menu-item-359695']//child::div")
    WebElement clickOnSubscription;
    @FindBy(xpath = "//li[@id='menu-item-359695']//child::li/a")
    List<WebElement> subscriptionElements;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    public void closeFirstAdd(){
        //closedAdd.click(); or
        webDriverUtil.waitElementUntilClickable(closedAdd);
    }
    public void loginAndRegister(){
        webDriverUtil.waitElementUntilClickable(loginLogo);
    }
    public void pageScroll(){
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",lastElement);
    }

    public void clickOnOurStory(){
        webDriverUtil.waitElementUntilClickable(ourStoryLogo);
    }
    public void clickOnOurCoffee(){
        BootStrapDropDownUtil.bootstrapDropDown(ourStoryElements,"Our Coffee");
    }
    public void clickOnOurMission(){
        BootStrapDropDownUtil.bootstrapDropDown(ourStoryElements,"Our Mission");
    }
    public void clickOnSubscription(){
        webDriverUtil.waitElementUntilClickable(clickOnSubscription);
    }
    public void clickOnCapsules(){
        BootStrapDropDownUtil.bootstrapDropDown(subscriptionElements,"Capsules");
    }



}
