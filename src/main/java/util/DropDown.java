package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import testbase.webTestBase;

public class DropDown extends webTestBase {
    public static void dropDownByIndex(WebElement element, int index){
        Select select =new Select(element);
        select.selectByIndex(index);
    }
    public static void dropDownByVisibleText(WebElement element,String visibleText){
        Select select =new Select(element);
        select.selectByVisibleText(visibleText);
    }
    public static void dropDownByValue(WebElement element,String value){
        Select select =new Select(element);
        select.selectByValue(value);
    }
    public void dropDown(WebElement element,String type,String value){
        Select select=new Select(element);

        switch (type){
            case"index":
                select.selectByIndex(Integer.parseInt(value));
                break;
            case "value":
                select.selectByValue(value);
                break;
            case "visibleText":
                select.selectByVisibleText(value);
                break;
            default:
                System.out.println("please enter correct selection criteria");
                break;
        }

    }
}
