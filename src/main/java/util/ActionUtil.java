package util;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import testbase.webTestBase;

public class ActionUtil extends webTestBase {
    public static void enterButton(WebElement element){
        Actions actions=new Actions(driver);
        actions.moveToElement(element).sendKeys(Keys.ENTER);

    }



}
