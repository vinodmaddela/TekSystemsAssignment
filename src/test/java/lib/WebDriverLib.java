package lib;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class WebDriverLib {

    WebDriver driver;
    public WebDriverLib(WebDriver driver)
    {
        this.driver=driver;
    }

    public void waitForElementVisible(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,15);
        final WebElement el=element;
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver){
                return el.isDisplayed();
            }
        });
    }

    public void elementClick(WebElement element){
        try {
            waitForElementVisible(element);
            element.click();
        }catch (NoSuchElementException e){
            System.out.println(element.toString()+"No Such WebElement Found");
        }
    }

    public void elementSendValue(WebElement element, String value){
        try {
            waitForElementVisible(element);
            element.sendKeys(value);
        }catch (NoSuchElementException e){
            System.out.println(element.toString()+"No Such WebElement Found");
        }
    }

    public String getText(WebElement element){
        try {
            waitForElementVisible(element);
            return element.getText();
        }catch (NoSuchElementException e){
            System.out.println(element.toString()+"No Such WebElement Found");
            return null;
        }
    }

    public boolean isElementPresent(WebElement element){
        try {
            waitForElementVisible(element);
            return element.isDisplayed();
        }catch (NoSuchElementException e){
            System.out.println(element.toString()+"No Such WebElement Found");
            return false;
        }
    }

    public void selectByElementValue(WebElement element, String value){
        try {
            waitForElementVisible(element);
            new Select(element).selectByValue(value);
        }catch (NoSuchElementException e){
            System.out.println(element.toString()+"No Such WebElement Found");
        }
    }

    public void selectByElementValue(WebElement element, int value){
        try {
            waitForElementVisible(element);
            new Select(element).selectByIndex(value);
        }catch (NoSuchElementException e){
            System.out.println(element.toString()+"No Such WebElement Found");
        }
    }

    public void ChangeWindow() {

        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            driver.switchTo().window(window);
        }

    }
    public void selectByVisibleElement(WebElement element, String value){
        try {
            waitForElementVisible(element);
            new Select(element).selectByVisibleText(value);
        }catch (NoSuchElementException e){
            System.out.println(element.toString()+"No Such WebElement Found");
        }
    }

    public void deSelectAll(WebElement element){
        try {
            waitForElementVisible(element);
            new Select(element).deselectAll();
        }catch (NoSuchElementException e){
            System.out.println(element.toString()+"No Such WebElement Found");
        }
    }

    public void getElementsList(WebElement element){
        try {
            waitForElementVisible(element);
            new Select(element).getAllSelectedOptions();
        }catch (NoSuchElementException e){
            System.out.println(element.toString()+"No Such WebElement Found");
        }
    }


}
