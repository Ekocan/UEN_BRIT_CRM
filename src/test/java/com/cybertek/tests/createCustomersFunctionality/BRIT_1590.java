package com.cybertek.tests.createCustomersFunctionality;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.Pages;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BRIT_1590 extends TestBase {
    BRIT_1590(){
        PageFactory.initElements(Driver.getDriver(), Pages.class);
    }

    @BeforeMethod
    public void setupLogin(){
        new BRIT_1590();
        pages.loginPage().open();
        pages.landingPage().clickDemobtn();
        pages.loginPage().managerLogin();
        pages.homePage().ClickCRM();
    }

    @Test(groups = "ekrem")
    public void BRIT_1591(){
        new BRIT_1590();
        pages.homePage().customersElement.click();
        wait.until(ExpectedConditions.titleContains("Custome"));
        pages.homePage().createButtonCustomer.click();
        pages.homePage().nameEditBox.sendKeys("ADA");
        boolean editable;
        editable= pages.homePage().nameEditBox.isEnabled();
        Assert.assertTrue(editable);


    }

    @Test
    //System should be able to display exist company names in
    // "Company" dropdown box when individual selected.
    public void BRIT_1726(){
        new BRIT_1590();
        pages.homePage().customersElement.click();
        wait.until(ExpectedConditions.titleContains("Custome"));
        pages.homePage().createButtonCustomer.click();
        wait.until(ExpectedConditions.titleContains("New"));
        Assert.assertTrue(pages.homePage().companyBoxForNewAccnt.isDisplayed());
    }

    @Test
    //System should be able to choose an exist company name
    // from "Company" drop down box when individual selected.
    public void BRIT_1850(){
        new BRIT_1590();
        pages.homePage().customersElement.click();
        wait.until(ExpectedConditions.titleContains("Custome"));
        pages.homePage().createButtonCustomer.click();
        wait.until(ExpectedConditions.titleContains("New"));
        pages.homePage().individualTextLink.click();
        wait(2);
        Assert.assertTrue(pages.homePage().companyBoxForNewAccnt.isDisplayed());
        pages.homePage().companyBoxForNewAccnt.click();
        wait(2);
        pages.homePage().companyBoxForNewAccnt.sendKeys("ACD"+ Keys.ENTER);
        wait(2);
        Assert.assertTrue(pages.homePage().existCompanyNameLink.isDisplayed());

    }

    @Test
    //System should be able to click on
    // company radio button when create new account.
    public void BRIT_1858(){
        new BRIT_1590();
        pages.homePage().customersElement.click();
        wait.until(ExpectedConditions.titleContains("Custome"));
        pages.homePage().createButtonCustomer.click();
        wait.until(ExpectedConditions.titleContains("New"));
        pages.homePage().companyRadioButtonText.click();
        wait(2);
        Assert.assertFalse(pages.homePage().existCompanyNameLink.isDisplayed());
    }

    @Test
    //System should be able hide "Job Position"
    // when create new company account.
    public void BRIT_1873(){
        new BRIT_1590();
        pages.homePage().customersElement.click();
        wait.until(ExpectedConditions.titleContains("Custome"));
        pages.homePage().createButtonCustomer.click();
        wait.until(ExpectedConditions.titleContains("New"));
        pages.homePage().companyRadioButtonText.click();
        wait(2);
        Assert.assertFalse(pages.homePage().jobPositionInNewaccnt.isDisplayed());
    }

    @Test
    //System should be able hide "Job Position"
    // when create new company account.
    public void BRIT_1884(){
        new BRIT_1590();
        pages.homePage().customersElement.click();
        wait.until(ExpectedConditions.titleContains("Custome"));
        pages.homePage().createButtonCustomer.click();
        wait.until(ExpectedConditions.titleContains("New"));
        pages.homePage().companyRadioButtonText.click();
        wait(2);
        Assert.assertFalse(pages.homePage().titleTextLinkInNewaccnt.isDisplayed());
    }
}
