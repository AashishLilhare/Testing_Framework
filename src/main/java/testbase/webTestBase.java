package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import util.webDriverUtil;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class webTestBase {
    public Properties prop;
    public static WebDriver driver;
    public webTestBase(){
        //to access config.properties we are using fileInputStream,properties.
        FileInputStream fileInputStream=null;
        try{
            fileInputStream =new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/properties/config.properties");
        }catch(Exception e){
            e.printStackTrace();
        }

         prop= new Properties();

        try{
            prop.load(fileInputStream);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void initialization(){
        //to initialize browser
        String browserName=prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/browsers/chromedrivernew.exe");
            driver=new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"/src/main/resources/browsers/msedgedriver.exe");
            driver=new EdgeDriver();
        }else {
            throw new RuntimeException("enter valid browser");
        }
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(webDriverUtil.PAGE_LOAD_TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(webDriverUtil.IMPLICIT_WAIT));
        driver.manage().deleteAllCookies();
    }

}
