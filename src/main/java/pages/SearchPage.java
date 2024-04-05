package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.webTestBase;
import util.ActionUtil;
import util.WebElementUtil;

public class SearchPage extends webTestBase {
    @FindBy(xpath = "//input[@id='s']")
    WebElement searchTextBox;

    @FindBy(xpath = "//input[@id='searchsubmit']")
    WebElement clickOnSearchElement;
    public SearchPage(){
        PageFactory.initElements(driver,this);

    }
    public void setSearch(String searchText){
        WebElementUtil.clickOnElement(searchTextBox);
        WebElementUtil.sendKeysOnElement(searchTextBox,searchText);
        WebElementUtil.clickOnElement(clickOnSearchElement);
    }

}
