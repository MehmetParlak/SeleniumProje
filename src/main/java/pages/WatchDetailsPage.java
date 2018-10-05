package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchDetailsPage extends TestBase {

    @FindBy(id = "addToCart")
    WebElement addToChart;

    public WatchDetailsPage() {
        PageFactory.initElements(driver, this);
    }

    public String validateWatchPageDetailsTitle() {
        return driver.getTitle();
    }

    public ChartPage addWatchtoChart(){
        addToChart.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ChartPage();
    }
}
