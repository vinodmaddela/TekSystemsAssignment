package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RecentSearchSteps extends Pages{

    @Given("^user opens RS Components website Homepage$")
    public void user_opens_RS_Components_website_Homepage() throws Throwable {
        searchPage.open();
    }

    @When("^user enters random text and clicks search$")
    public void user_enters_random_text_and_clicks_search() throws Throwable {
        searchPage.recentSrch();
        searchPage.clckSrch();
    }

    @Then("^user is displayed with recent searches$")
    public void user_is_displayed_with_recent_searches() throws Throwable {
        searchPage.searchHistory();
    }

    @Then("^user clicks on recent search item$")
    public void user_clicks_on_recent_search_item() throws Throwable {
        searchPage.repeatSearch();
        driver.close();
    }
}
