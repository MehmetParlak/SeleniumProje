package testcases;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.WatchPage;
import util.TestUtil;

public class HomePageTest extends TestBase {
    HomePage homePage;
    WatchPage watchPage;
    TestUtil testUtil;


    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        init();
        testUtil=new TestUtil();
        homePage = new HomePage();
    }


    @Test(priority = 1)
    public void validateHomePageTitleTest() {
        String title = homePage.validateHomePageTitle();
        Assert.assertEquals(title, "Türkiye'nin En Büyük Online Alışveriş Sitesi Hepsiburada.com");
        System.out.println(title);
    }

    @Test(priority = 2)
    public void clickTest() {
        watchPage = homePage.clickOnKolSaatleri();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
