package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testbase.webTestBase;

import java.util.List;

public class WebElementUtil extends webTestBase {
    public static void clickOnElement(WebElement element){
        element.click();
    }
    public static  void sendKeysOnElement(WebElement element,String text){
        element.sendKeys(text);
    }
    public static  String getTextOfElements(WebElement webElement){
       return webElement.getText();

    }
    public static void isSelectOnElement(WebElement element){
        element.isSelected();
    }
    public static  String getTitleOfElements(){
        return driver.getTitle().trim();

    }
    public static  void backNavigation(){
        driver.navigate().back();
    }

}
