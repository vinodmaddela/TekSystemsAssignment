package pages;

import config.TestConfig;
import lib.WebDriverLib;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

    WebDriver driver;
    WebDriverLib lib;

    public SearchPage(WebDriver driver){
        this.driver=driver;
        lib=new WebDriverLib(this.driver);
    }

    @FindBy(id = "searchTerm")
    public WebElement srch_txtbox;

    @FindBy(id = "btnSearch")
    public WebElement srchBtn;

    @FindBy(xpath = "//*[@id='zeroResultBody']/h2[1]")
    public WebElement dispMsg;

    @FindBy(id = "zeroResultSearchForm:searchTermOnZeroResultPage")
    public WebElement newSrchTxtBox;

    @FindBy(xpath = "//*[@class='productTab']")
    public WebElement rcntSrch;

    @FindBy(xpath = "//a[@title='Click to repeat search']")
    public WebElement rptSrch;

    @FindBy(xpath = "//a[@title='connectors']")
    public WebElement verifyTitle;

    @FindBy(xpath = "//*[contains(.,'Go to products')]")
    public WebElement products;

    @FindBy(xpath = "//*[@class='viewProdDiv']")
    public WebElement viewProd;

    public void open()
    {
        driver.get(TestConfig.url);
    }

    public void invalidTxt(){
        lib.elementSendValue(srch_txtbox,"123-xyz");
    }

    public void clckSrch()
    {
        lib.elementClick(srchBtn);
    }

    public void dsplyMsg(){
        lib.isElementPresent(dispMsg);
    }

    public void newSrchTxt(){
        lib.isElementPresent(newSrchTxtBox);
    }

    public void validTxt(){
        lib.elementSendValue(srch_txtbox,"connectors");
    }

    public void vrfyTitle(){
        lib.isElementPresent(verifyTitle);
    }

    public void goToProd(){
        lib.elementClick(products);
    }

    public void viewProd(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",viewProd);
        lib.isElementPresent(viewProd);
    }

    public void recentSrch(){
        lib.elementSendValue(srch_txtbox,"adhesives");
    }

    public void searchHistory(){
        lib.isElementPresent(rcntSrch);
    }

    public void repeatSearch(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",rcntSrch);
        lib.elementClick(rptSrch);
    }
}
