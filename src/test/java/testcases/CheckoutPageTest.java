package testcases;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import util.TestUtil;

public class CheckoutPageTest extends TestBase {

    WatchDetailsPage watchDetailsPage;
    WatchPage watchPage;
    TestUtil testUtil;
    HomePage homePage;
    ChartPage chartPage;
    LoginPage loginPage;
    CheckoutPage checkoutPage;

    public CheckoutPageTest() {
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
        loginPage = chartPage.loginToCheckout();
        checkoutPage = loginPage.login(properties.getProperty("email"), properties.getProperty("password"));
    }


    @Test(priority = 1)
    public void checkOutPageTitleTest() {
        String title = checkoutPage.validateCheckoutPagePageTitle();
        Assert.assertEquals(title, "Teslimat Bilgileri");
        System.out.println(title);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
