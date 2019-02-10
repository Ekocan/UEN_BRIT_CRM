package com.cybertek.tests.searchingFunctionality;

import com.cybertek.pages.LoginPage;
import com.cybertek.pages.SearchPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.Pages;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BRIT_1469 extends TestBase {

    BRIT_1469() {
        PageFactory.initElements(Driver.getDriver(), SearchPage.class);
    }


    @BeforeMethod
    public void setup() {
        new BRIT_1469();
        pages.loginPage().open();
        pages.landingPage().clickDemobtn();
        pages.loginPage().managerLogin();
        // BrowserUtils.verifyElementDisplayed(pages.homePage().CRMButton);
        wait.until(ExpectedConditions.titleContains("Inbox"));
        pages.homePage().ClickCRM();

        wait.until(ExpectedConditions.titleContains("Pipel"));


    }

    @Test
    public void testDropDown() {

        pages.searchPage().MagniffierIcone.click();
        BrowserUtils.verifyElementDisplayed(pages.searchPage().FilterButton);
    }

    @Test
    public void testKanbanOption() {

        pages.searchPage().KanbanButton.click();

    }

    @Test
    public void testCalendarOption() {

        pages.searchPage().CalendarButton.click();
        Assert.assertTrue(pages.searchPage().DayDisplay.isDisplayed());

    }

    @Test
    public void testUnreadMessageOption() {

        pages.searchPage().MagniffierIcone.click();
        pages.searchPage().FilterButton.click();
        Assert.assertTrue(pages.searchPage().UnreadMessageButton.isDisplayed());
    }

    @Test
    public void testMyPipelineDropdownBar() {

        pages.searchPage().MagniffierIcone.click();
        pages.searchPage().FilterButton.click();
        Assert.assertTrue(pages.searchPage().MyPipelineButton.isDisplayed());
    }

    @Test
    public void testUnassignedDropdown() {

        pages.searchPage().MagniffierIcone.click();
        wait.until(ExpectedConditions.titleContains("Pipe"));
        pages.searchPage().FilterButton.click();
        Assert.assertTrue(pages.searchPage().UnassignedButton.isDisplayed());
    }

    @Test
    public void testActivitiesToDoOption() {

        pages.searchPage().MagniffierIcone.click();
        wait.until(ExpectedConditions.titleContains("Pipe"));
        pages.searchPage().FilterButton.click();
        Assert.assertTrue(pages.searchPage().ActivitiesToDoButton.isDisplayed());
    }

    @Test
    public void GraphOption() {

        pages.searchPage().GraphButton.click();
        pages.searchPage().BarChartButton.click();
    }

    @Test
    public void testOverdueOpportunitiesOption() {

        pages.searchPage().MagniffierIcone.click();
        wait.until(ExpectedConditions.titleContains("Pipe"));
        pages.searchPage().FilterButton.click();
        Assert.assertTrue(pages.searchPage().OverdueOpportunitiesButton.isDisplayed());
    }


    @Test
    public void testLostOption() {
        pages.searchPage().MagniffierIcone.click();
        wait.until(ExpectedConditions.titleContains("Pipe"));
       pages.searchPage().FilterButton.click();
        Assert.assertTrue(pages.searchPage().LostButton.isDisplayed());
    }

}