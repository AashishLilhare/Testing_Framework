package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.webTestBase;
import util.WebElementUtil;
import util.webDriverUtil;

public class RegisterPage extends webTestBase {
    @FindBy(xpath = "")
    WebElement login;
    @FindBy(xpath = "//a[text()='Click here']")
    WebElement RegisterLink;
    @FindBy(xpath = "//input[@id='reg_email']")
    WebElement registerUserNameTextBox;
    @FindBy(xpath = "//input[@id='reg_password']")
    WebElement registerPasswordTextBox;
    @FindBy(xpath = "//input[@name='register']")
    WebElement registerButton;

   public RegisterPage(){
       PageFactory.initElements(driver,this);
   }
   public void setRegister(String registerUserName,String registerPassword){
       WebElementUtil.sendKeysOnElement(registerUserNameTextBox,registerUserName);
       WebElementUtil.sendKeysOnElement(registerPasswordTextBox,registerPassword);
       WebElementUtil.clickOnElement(registerButton);

   }
   public void registerLink(){
       webDriverUtil.waitElementUntilClickable(RegisterLink);
   }

}
