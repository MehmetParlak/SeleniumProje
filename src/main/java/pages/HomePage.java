package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {


    @FindBy(id = "hepsimoda")
    public WebElement hepsiModa;

    @FindBy(linkText = "Kol Saatleri")
    public WebElement kol_saatleri;


    public HomePage() {
        PageFactory.initElements(driver,this);
    }


    public String validateHomePageTitle() {
        return driver.getTitle();
    }

    public WatchPage clickOnKolSaatleri(){
        Actions actions=new Actions(driver);
        actions.moveToElement(hepsiModa).build().perform();
        kol_saatleri.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new WatchPage();
    }
}
