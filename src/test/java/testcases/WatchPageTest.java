package testcases;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.WatchDetailsPage;
import pages.WatchPage;
import util.TestUtil;

public class WatchPageTest extends TestBase {

    WatchDetailsPage watchDetailsPage;
    WatchPage watchPage;
    TestUtil testUtil;
    HomePage homePage;

    public WatchPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        init();
        testUtil=new TestUtil();
        homePage=new HomePage();
        watchPage = homePage.clickOnKolSaatleri();
    }

    @Test(priority = 1)
    public void validateWatchPageTitleTest() {
        String title = watchPage.validateWatchPageTitle();
        Assert.assertEquals(title, "Kol Saatlerinde % 70 indirim & Kampanyalı Fiyatlar");
    }

    @Test(priority = 2)
    public void selectFirstWatchTest() {
        watchDetailsPage = watchPage.selectFirstWatch();
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
