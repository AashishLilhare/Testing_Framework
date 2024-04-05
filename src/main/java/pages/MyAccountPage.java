package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.webTestBase;
import util.WebElementUtil;

public class MyAccountPage extends webTestBase {

    @FindBy(xpath = "//h2[@class='account-title']")
    WebElement myAccountElement;

    @FindBy(xpath = "//a[text()='Confirm and log out']")
    WebElement confirmLogOutBtn;
    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logOutBtn;

    public MyAccountPage(){
        PageFactory.initElements(driver,this);

    }
    public String  getMyAccountElement(){
       return WebElementUtil.getTextOfElements(myAccountElement);

    }
    public void ClickOnLogOut(){
        WebElementUtil.clickOnElement(logOutBtn);
    }
    public void ClickOnConfirmLogOut(){
        WebElementUtil.clickOnElement(confirmLogOutBtn);
    }

}
