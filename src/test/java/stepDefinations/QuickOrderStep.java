package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class QuickOrderStep extends Pages{

    @Given("^user is on RS Componets website landing page$")
    public void user_is_on_RS_Componets_website_landing_page() throws Throwable {
        quickOrder.open();
    }

    @Then("^user enters RS Stock number and selects quantity$")
    public void user_enters_RS_Stock_number_and_selects_quantity() throws Throwable {
        quickOrder.enterStockNo();
        quickOrder.enterQty();
    }

    @Then("^user clicks on Add to Basket$")
    public void user_clicks_on_Add_to_Basket() throws Throwable {
        quickOrder.orderBtn();
    }

    @Then("^user is naviagated to the checkout page$")
    public void user_is_naviagated_to_the_checkout_page() throws Throwable {
        quickOrder.verifyStockNo();
    }

    @Then("^user is displayed product availability$")
    public void user_is_displayed_product_availability() throws Throwable {
        quickOrder.stockAvblty();
    }

    @Then("^user should be displayed with updated results$")
    public void user_should_be_displayed_with_updated_results() throws Throwable {
        quickOrder.orderChkOut();
        driver.close();
    }
}
