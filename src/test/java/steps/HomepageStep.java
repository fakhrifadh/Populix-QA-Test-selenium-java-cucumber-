package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageobjects.HomepagePO;
import utilities.Constants;
import utilities.SeleniumHelpers;
import utilities.ThreadManager;


public class HomepageStep {
    private final WebDriver driver = ThreadManager.getDriver();
    private final HomepagePO homepage = new HomepagePO(driver);
    private final SeleniumHelpers selenium = new SeleniumHelpers(driver);

    @Given("user access to {string}")
    public void userNavigate(String url){
        if (url.equalsIgnoreCase("youtube-homepage")){
            url = Constants.YOUTUBE_HOMEPAGE;
        }
        selenium.navigateToPage(url);
    }

    @When("user input search with {string}")
    public void userInputKeyword(String keyword){
        homepage.fillSearch(keyword);
    }

    @When("user click on youtube shorts menu")
    public void userClickShorts() throws InterruptedException{
        homepage.clickShorts();
    }

    @And("user click search button")
    public void useClickSearch() throws InterruptedException {
        homepage.clickSearch();
    }

    @And("user click on {string} video")
    public void userClickVideo(String title) throws InterruptedException{
        homepage.clickTitle(title);
    }

    @Then("user should be at the {string} video page")
    public void userAtVideoPage(String title){
        Assert.assertTrue(homepage.getPageTitle().contains(title));
    }

    @Then("user should be at the {string} page")
    public void userAtShortsPage(String url){
        if (url.equalsIgnoreCase("youtube-shorts")){
            url = Constants.YOUTUBE_SHORTS_PAGE;
        }

        Assert.assertTrue(homepage.getCurrentUrl().contains(url));
    }


}
