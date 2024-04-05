package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.webTestBase;

import java.time.Duration;

public class webDriverUtil extends webTestBase {
    public static final long IMPLICIT_WAIT= 40;
    public static final long PAGE_LOAD_TIMEOUT= 40;

    public static final long EXPLICIT_WAIT= 40;
    public static WebDriverWait webDriverWait;
    public static void waitElementUntilClickable(WebElement element){
        webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
}
