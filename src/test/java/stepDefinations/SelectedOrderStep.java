package stepDefinations;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class SelectedOrderStep extends Pages{

    @Given("^user is on RS Components website landing page$")
    public void user_is_on_RS_Components_website_landing_page() throws Throwable {
        selectedOrder.open();
    }

    @Then("^user clicks on brands menu tab$")
    public void user_clicks_on_brands_menu_tab() throws Throwable {
       selectedOrder.ourBrands();
    }

    @Then("^user clicks on All Brands$")
    public void user_clicks_on_All_Brands() throws Throwable {
        selectedOrder.allBrands();
    }

    @Then("^user clicks on Letter S and selects siemens brand$")
    public void user_clicks_on_Letter_S_and_selects_siemens_brand() throws Throwable {
        selectedOrder.brandsByLetters();
        selectedOrder.selectBrand();

    }

    @Then("^user should be directed to the siemens products page$")
    public void user_should_be_directed_to_the_siemens_products_page() throws Throwable {
        selectedOrder.brandLogo();

    }

    @Then("^user clicks on the product and clicks buy$")
    public void user_clicks_on_the_product_and_clicks_buy() throws Throwable {
        selectedOrder.productClick();
        selectedOrder.buyNow();

    }

    @Then("^user clicks on add to basket$")
    public void user_clicks_on_add_to_basket() throws Throwable {
        selectedOrder.addToBasket();
    }

    @Then("^user clicks on view basket$")
    public void user_clicks_on_view_basket() throws Throwable {
        selectedOrder.viewCart();
    }

    @Then("^clicks on checkout button for purchase$")
    public void clicks_on_checkout_button_for_purchase() throws Throwable {
        selectedOrder.checkout();

    }

    @After
    public void embedScreenshot(Scenario scenario)
    {
        scenario.write("Current Page URL is " + driver.getCurrentUrl());
        try {
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        driver.close();
    }
}
