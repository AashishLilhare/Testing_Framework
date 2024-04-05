package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.webTestBase;
import util.WebElementUtil;
import util.webDriverUtil;

public class LoginPage extends webTestBase {

    @FindBy(id="username")
    WebElement userNameTestBox;
    @FindBy(id="password")
    WebElement passWordTextBox;

    @FindBy(name="login")
    WebElement login;
    @FindBy(xpath = "//div[@class='wc-block-components-notice-banner__content']")
    WebElement Error;
    @FindBy(id = "rememberme")
    WebElement rememberMe;
    @FindBy(xpath = "//a[text()='Lost your password?']")
    WebElement lostPassword;
    @FindBy(id ="user_login")
    WebElement emailUserId;
    @FindBy(xpath = "//input[@value='Reset password']")
    WebElement resetPassword;


    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    public void setLogin(String registerUserName,String registerPassword){
        WebElementUtil.sendKeysOnElement(userNameTestBox,registerUserName);
        WebElementUtil.sendKeysOnElement(passWordTextBox,registerPassword);
        webDriverUtil.waitElementUntilClickable(login);
    }

    public void setInvalidLogin(String userName,String password){
        WebElementUtil.sendKeysOnElement(userNameTestBox,userName);
        WebElementUtil.sendKeysOnElement(passWordTextBox,password);
        webDriverUtil.waitElementUntilClickable(login);
    }
    public void setValidUser(String userName){
        WebElementUtil.sendKeysOnElement(userNameTestBox,userName);
        webDriverUtil.waitElementUntilClickable(login);
    }
    public void setValidPassword(String password){
        WebElementUtil.sendKeysOnElement(passWordTextBox,password);
        webDriverUtil.waitElementUntilClickable(login);
    }

    public String getError () {
        return WebElementUtil.getTextOfElements(Error);
    }
    public void clickOnRememberMe(){
        WebElementUtil.clickOnElement(rememberMe);
    }
    public void clickLostPassword(){
        WebElementUtil.clickOnElement(lostPassword);
    }
    public void setUserEmail(String userName){
        WebElementUtil.sendKeysOnElement(emailUserId,userName);
        webDriverUtil.waitElementUntilClickable(resetPassword);
    }

}
