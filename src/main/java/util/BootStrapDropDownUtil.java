package util;

import org.openqa.selenium.WebElement;

import java.util.List;

public class BootStrapDropDownUtil {
    public static void bootstrapDropDown(List<WebElement> elements, String value){
        for (WebElement e: elements){
            if (e.getText().trim().equalsIgnoreCase(value)) {
                e.click();
                break;
            }
        }
    }
}
