package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChartPage extends TestBase{

    @FindBy(xpath ="//span[contains(text(), 'Alışverişi Tamamla')]" )
    WebElement continueCheckout;

    public ChartPage() {
        PageFactory.initElements(driver, this);
    }

    public String validateChartPageTitle() {
        return driver.getTitle();
    }

    public LoginPage loginToCheckout(){
        continueCheckout.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new LoginPage();
    }
}
