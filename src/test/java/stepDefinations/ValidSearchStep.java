package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidSearchStep extends Pages{

    @Given("^user opens RSComponents website landing page$")
    public void user_opens_RSComponents_website_landing_page() throws Throwable{
        searchPage.open();
    }

    @When("^user enter valid text and clicks search$")
    public void user_enter_valid_text_and_clicks_search() throws Throwable{
        searchPage.validTxt();
        searchPage.clckSrch();
    }

    @Then("^user is navigated to the products page$")
    public void user_is_navigated_to_the_products_page() throws Throwable{
        searchPage.vrfyTitle();
        searchPage.goToProd();
    }

    @Then("^user is displayed with products viewing page$")
    public void user_is_displayed_with_products_viewing_page() throws Throwable {
        searchPage.viewProd();
        driver.close();
    }
}
