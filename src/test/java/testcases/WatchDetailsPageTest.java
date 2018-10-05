package testcases;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ChartPage;
import pages.HomePage;
import pages.WatchDetailsPage;
import pages.WatchPage;
import util.TestUtil;

public class WatchDetailsPageTest extends TestBase {
    WatchDetailsPage watchDetailsPage;
    WatchPage watchPage;
    TestUtil testUtil;
    HomePage homePage;
    ChartPage chartPage;

    public WatchDetailsPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        init();
        testUtil = new TestUtil();
        homePage = new HomePage();
        chartPage = new ChartPage();
        watchPage = homePage.clickOnKolSaatleri();
        watchDetailsPage = watchPage.selectFirstWatch();
    }

    @Test(priority = 1)
    public void validateWatchDetailsPageTitleTest() {
        String title = watchPage.validateWatchPageTitle();
        Assert.assertEquals(title, "Beverly Hills Polo Club BH0012-05 Erkek Kol Saati Fiyatı");
        System.out.println(title);
    }

    @Test(priority = 2)
    public void addWatchtoChartTest() {
        chartPage = watchDetailsPage.addWatchtoChart();
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
