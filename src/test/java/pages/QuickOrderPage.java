package pages;

import config.TestConfig;
import lib.WebDriverLib;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickOrderPage {

    WebDriver driver;
    WebDriverLib lib;

    public QuickOrderPage(WebDriver driver){
        this.driver=driver;
        lib=new WebDriverLib(this.driver);
    }

    @FindBy(xpath = ".//form[@class='quickOrder']/div[2]/input[1]")
    public WebElement orderTextBox;

    @FindBy(xpath = ".//form[@class='quickOrder']/div[2]/input[2]")
    public WebElement orderQty;

    @FindBy(xpath = ".//*[@id='quickOrderBtn']")
    public WebElement orderBtn;

    @FindBy(xpath = ".//span[@class='textTitle']")
    public WebElement rs_stock_no;

    @FindBy(xpath = ".//span[@class='atpIcon instock']")
    public WebElement stock_availblty;

    @FindBy(id="checkoutSecurelyAndPuchBtn")
    public WebElement chkOutBtn;

    public void open() {
        driver.get(TestConfig.url);
    }

    public void enterStockNo(){
        lib.elementSendValue(orderTextBox,"241-7652");
    }

    public void enterQty(){
        lib.elementSendValue(orderQty,"5");
    }

    public void orderBtn(){
        lib.elementClick(orderBtn);
    }

    public void verifyStockNo(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",rs_stock_no);
        lib.getText(rs_stock_no);
    }

    public void stockAvblty(){
        lib.isElementPresent(stock_availblty);
    }

    public void orderChkOut(){
        lib.elementClick(chkOutBtn);
    }
}
