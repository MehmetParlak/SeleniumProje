package testcases;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import util.TestUtil;

public class ChartPageTest extends TestBase {

    WatchDetailsPage watchDetailsPage;
    WatchPage watchPage;
    TestUtil testUtil;
    HomePage homePage;
    ChartPage chartPage;
    LoginPage loginPage;

    public ChartPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        init();
        testUtil = new TestUtil();
        homePage = new HomePage();
        chartPage = new ChartPage();
        loginPage = new LoginPage();
        watchPage = homePage.clickOnKolSaatleri();
        watchDetailsPage = watchPage.selectFirstWatch();
        chartPage = watchDetailsPage.addWatchtoChart();
    }

    @Test(priority = 1)
    public void chartPageTitleTest() {
        String title = chartPage.validateChartPageTitle();
        Assert.assertEquals(title, "Sepetim");
    }

    @Test(priority = 2)
    public void loginToCheckoutTest() {
        loginPage = chartPage.loginToCheckout();
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
