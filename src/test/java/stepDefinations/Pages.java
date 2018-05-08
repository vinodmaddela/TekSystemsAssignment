package stepDefinations;

import config.BrowserCreator;
import org.openqa.selenium.support.PageFactory;
import pages.*;

public class Pages extends BrowserCreator{

    public QuickOrderPage quickOrder;
    public SelectedOrderPage selectedOrder;
    public SearchPage searchPage;

    public Pages(){
        getBrowser();
        quickOrder= PageFactory.initElements(driver, QuickOrderPage.class);
        selectedOrder=PageFactory.initElements(driver, SelectedOrderPage.class);
        searchPage=PageFactory.initElements(driver,SearchPage.class);
    }
}
