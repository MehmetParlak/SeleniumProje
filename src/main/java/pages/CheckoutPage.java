package pages;

import base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends TestBase {

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    public String validateCheckoutPagePageTitle() {
        return driver.getTitle();
    }
}
