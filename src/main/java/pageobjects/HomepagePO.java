package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.Constants;
import utilities.SeleniumHelpers;

public class HomepagePO {
    WebDriver driver;
    SeleniumHelpers selenium;

    public HomepagePO(WebDriver driver){
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);

        PageFactory.initElements(new AjaxElementLocatorFactory(driver, Constants.PAGEFACTORY_WAIT_DURATION), this);
    }

    @FindBy(name = "search_query")
    private WebElement searchText;

    @FindBy(xpath = "//*[@id=\"search-icon-legacy\"]")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@title=\"Shorts\"]")
    private WebElement shortsMenu;


    public void clickTitle(String title) throws InterruptedException {
        WebElement video = driver.findElement(By.xpath("//a[@title=\""+title+"\"]"));
        selenium.clickOn(video);
    }

    public void fillSearch(String keyword){
        selenium.enterText(searchText,keyword,false);
    }

    public void clickSearch() throws InterruptedException{
        selenium.clickOn(searchButton);
    }

    public void clickShorts() throws InterruptedException{
        selenium.clickOn(shortsMenu);
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }



}
