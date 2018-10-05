package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchPage extends TestBase {


    @FindBy(xpath ="//span[contains(text(), 'Beverly Hills Polo Club BH0012-05 Erkek Kol Saati')]" )
    WebElement firstWatch;

    public WatchPage() {
        PageFactory.initElements(driver, this);
    }

    public String validateWatchPageTitle() {
        return driver.getTitle();
    }

    public WatchDetailsPage selectFirstWatch(){
        firstWatch.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new WatchDetailsPage();
    }

}
