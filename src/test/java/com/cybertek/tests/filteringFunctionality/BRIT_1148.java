package com.cybertek.tests.filteringFunctionality;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.Pages;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class BRIT_1148 extends TestBase {

    BRIT_1148(){
        PageFactory.initElements(Driver.getDriver(), Pages.class);
    }

    @BeforeMethod
    public void setupLogin(){
        new BRIT_1148();
        pages.loginPage().open();
        pages.landingPage().clickDemobtn();
        pages.loginPage().managerLogin();
        // BrowserUtils.verifyElementDisplayed(pages.homePage().CRMButton);
        pages.homePage().ClickCRM();
    }

    @Test
    public void testDropdaown(){
      //  new BRIT_1148();
        pages.searchPage().MagniffierIcone.click();
        BrowserUtils.verifyElementDisplayed(pages.searchPage().GroupByButton);
    }

    //test Link button
    @Test
    public void testListOption(){
      //  new BRIT_1148();
        pages.searchPage().ListButton.click();
        //tabel will display on the page
        Assert.assertTrue(pages.searchPage().tableDisplay.isDisplayed());
    }

    //test documentation

    @Test
    public void testDocumantation() throws InterruptedException {
      //  new BRIT_1148();
        pages.searchPage().Usernamedisplays.click();
        Thread.sleep(3);
        pages.searchPage().documentation.click();
        driver.navigate().to("https://www.odoo.com/documentation/user/12.0/");
       Assert.assertTrue(driver.getTitle().equals("Odoo User Documentation — Odoo 12.0 documentation"));
    }

    @Test
    public void testGrapghbtn(){
      //  new BRIT_1148();
        pages.searchPage().Graghbtn.click();
        Assert.assertTrue(pages.searchPage().measure.isDisplayed());
    }

    @Test
    public void testsupport(){
      //  new BRIT_1148();
        pages.searchPage().Usernamedisplays.click();
        pages.searchPage().supportbtn.click();
        driver.navigate().to("https://www.odoo.com/pricing#pl=67&num_users=1&hosting=on_premise&odoosh_workers=1&odoosh_storage=1&odoosh_staging=1&implementation_service=self&pack=25&force_country=US&integrating_partner_id=0&price_by=yearly");
       // BrowserUtils.waitForClickablility(pages.searchPage().AppsBtn,5);
        pages.searchPage().signInBtn.click();
        BrowserUtils.verifyElementDisplayed(pages.searchPage().signInContaner);
    }


    @Test
    public void testPivot(){
       // new BRIT_1148();
        pages.searchPage().pivot.click();
        Assert.assertTrue(pages.searchPage().pivotTable.isDisplayed());
    }


    @Test
    public void testLeads(){
     //   new BRIT_1148();
        pages.homePage().LeadsOpportunities.click();
        BrowserUtils.verifyElementDisplayed(pages.searchPage().LeadTag);
    }

    @Test
    public void testMassage(){
     //   new BRIT_1148();
        pages.searchPage().conversation.click();
        pages.searchPage().newMassageBtn.click();
        BrowserUtils.verifyElementDisplayed(pages.searchPage().newMassagePopUp);
        pages.searchPage().windowCloseBtn.click();
    }

    @Test
    public void test(){
        pages.searchPage().Usernamedisplays.click();
        pages.searchPage().myAccount.click();
        BrowserUtils.verifyElementDisplayed(pages.searchPage().panalBody);
    }

    @Test
    public void testGithub(){
        System.out.println("testing the fork ");
    }


}
