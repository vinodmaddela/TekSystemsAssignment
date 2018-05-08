package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidSearchStep extends Pages{

    @Given("^user opens RS Components website landing page$")
    public void user_opens_RS_Components_website_landing_page() throws Throwable{
        searchPage.open();
    }

    @When("^user enters invalid text and clicks search$")
    public void user_enters_invalid_text_and_clicks_search() throws Throwable {
        searchPage.invalidTxt();
        searchPage.clckSrch();
    }

    @Then("^user is displayed invalid message with search text box$")
    public void user_is_displayed_invalid_message_with_search_text_box() throws Throwable {
        searchPage.dsplyMsg();
        searchPage.newSrchTxt();
        driver.close();

    }
}
