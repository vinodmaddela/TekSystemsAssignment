package pages;

import config.TestConfig;
import lib.WebDriverLib;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectedOrderPage {

    WebDriver driver;
    WebDriverLib lib;
    public SelectedOrderPage(WebDriver driver){
        this.driver=driver;
        lib=new WebDriverLib(this.driver);
    }

    @FindBy(xpath = "//a[@class='menu brands-menu']")
    public WebElement brandsMenu;

    @FindBy(xpath = "//a[contains(@title, 'All Brands')]")
    public WebElement allBrands;

    @FindBy(xpath = "//a[contains(@class, 'brands') and contains(@title, 'S')]")
    public WebElement brandLetters;

    @FindBy(xpath = "//a[contains(.,'Siemens')]")
    public WebElement brandTitle;

    @FindBy(xpath = "//img[@title='Siemens']")
    public WebElement titleLogo;

    @FindBy(xpath = "//a[contains(.,'SIMATIC IOT2020 - The Industrial Gateway')]")
    public WebElement featuredProducts;

    @FindBy(xpath = "//a[contains(@class, 'btn btn-block btn-primary')]")
    public WebElement buyProduct;

    @FindBy(xpath = "//*[@class='add-to-basket-container']/div[1]/button")
    public WebElement addToBasket;

    @FindBy(xpath = "//button[contains(.,'View Basket')]")
    public WebElement viewCart;

    @FindBy(xpath = ".//*[@id='checkoutSecurelyAndPuchBtn']")
    public WebElement productCheckout;

    public void open() {
        driver.get(TestConfig.url);
    }

    public void ourBrands()
    {
        lib.elementClick(brandsMenu);
    }

    public void allBrands(){
        lib.elementClick(allBrands);
    }

    public void brandsByLetters(){
        lib.elementClick(brandLetters);
    }

    public void selectBrand(){
        lib.elementClick(brandTitle);
    }

    public void brandLogo()

    {
        lib.waitForElementVisible(titleLogo);
    }

    public void productClick()

    {
        lib.elementClick(featuredProducts);
    }

    public void buyNow()
    {
        lib.elementClick(buyProduct);
    }

    public void addToBasket()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",addToBasket);
        lib.elementClick(addToBasket);
    }

    public void viewCart()
    {
        lib.elementClick(viewCart);
    }

    public void checkout()
    {
        lib.elementClick(productCheckout);
    }

}
