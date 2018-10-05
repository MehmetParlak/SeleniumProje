package testcases;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import util.TestUtil;

public class LoginPageTest extends TestBase {

    WatchDetailsPage watchDetailsPage;
    WatchPage watchPage;
    TestUtil testUtil;
    HomePage homePage;
    ChartPage chartPage;
    LoginPage loginPage;
    CheckoutPage checkoutPage;

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        init();
        testUtil = new TestUtil();
        homePage = new HomePage();
        chartPage = new ChartPage();
        loginPage = new LoginPage();
        checkoutPage=new CheckoutPage();
        watchPage = homePage.clickOnKolSaatleri();
        watchDetailsPage = watchPage.selectFirstWatch();
        chartPage = watchDetailsPage.addWatchtoChart();
        loginPage = chartPage.loginToCheckout();
    }

    @Test(priority = 1)
    public void loginPageTitleTest() {
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title, "Üye Giriş Sayfası – Hepsiburada.com");
        System.out.println(title);
    }

    @Test(priority = 2)
    public void loginTest() {
        checkoutPage = loginPage.login(properties.getProperty("email"), properties.getProperty("password"));
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
