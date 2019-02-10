package com.cybertek.tests.createCustomersFunctionality;

import com.cybertek.pages.LandingPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BRIT_2031 extends TestBase {

    BRIT_2031(){
        PageFactory.initElements(Driver.getDriver(), Pages.class);
    }

    @BeforeMethod
    public void setupLogin(){
        new BRIT_2031();
        pages.loginPage().open();
        pages.landingPage().clickDemobtn();
        pages.loginPage().managerLogin();
        // BrowserUtils.verifyElementDisplayed(pages.homePage().CRMButton);

        pages.homePage().ClickCRM();

    }

    @Test
    //User can click on Customers text link from left side on CRM Homepage.
    public void BRIT_2033() throws InterruptedException {
        new BRIT_2031();
        //step1 and step2 are in the setupLogin Method

        // step3: Click on the Customers text link from left side
        pages.homePage().customersElement.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.titleIs("Customers - Odoo"));
        Assert.assertEquals(driver.getTitle(),"Customers - Odoo");
        }

    @Test
    //User should be able to select any customer from CRM Kanban interface
    public void BRIT_2036(){
        new BRIT_2031();
        // step3: Click on the Customers text link from left side
        pages.homePage().customersElement.click();

        wait.until(ExpectedConditions.titleContains("Custome"));

        System.out.println(Driver.getDriver().getCurrentUrl());
        //step4: Click on the Customer "ADA"
        if(Driver.getDriver().getCurrentUrl().contains("list")){
           pages.homePage().name_ADA_list.click();
        }else if(Driver.getDriver().getCurrentUrl().contains("kanban")){
            System.out.println("kanban");
            pages.homePage().name_ADA_kanban.click();
        }
        //step5: Verity that title contains ADA
        //Assert.assertEquals(driver.getTitle(),"ADA - Odoo");
        BrowserUtils.wait(5);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("ADA"));

    }

    @Test
    public void BRIT_2038(){
        new BRIT_2031();
        // step3: Click on the Customers text link from left side
        pages.homePage().customersElement.click();
        wait.until(ExpectedConditions.titleContains("Custome"));
        //step4: Click on the Customer "ADA"
        if(Driver.getDriver().getCurrentUrl().contains("list")){
            pages.homePage().name_ADA_list.click();
        }else if(Driver.getDriver().getCurrentUrl().contains("kanban")){
            System.out.println("kanban");
            pages.homePage().name_ADA_kanban.click();
        }
        //step5: Verity that title contains ADA
        BrowserUtils.wait(5);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("ADA"));
        //step6: Click on the Edit button on ADA's homepage
        pages.homePage().Edit_ADA.click();
        //after click on the edit, then save Button shows
        Assert.assertTrue(pages.homePage().Save_ADA.isDisplayed());

    }

    @Test
    public void BRIT_2040(){
        new BRIT_2031();
        // step3: Click on the Customers text link from left side
        pages.homePage().customersElement.click();
        wait.until(ExpectedConditions.titleContains("Customers"));
        //step4: Click on the Customer "ADA"
        if(Driver.getDriver().getCurrentUrl().contains("list")){
            pages.homePage().name_ADA_list.click();
        }else if(Driver.getDriver().getCurrentUrl().contains("kanban")){
            System.out.println("kanban");
            pages.homePage().name_ADA_kanban.click();
        }
        //step5: Verity that title contains ADA
        BrowserUtils.wait(5);
        new Actions(driver).pause(1500).perform();
        //step6: Click on the Edit button on ADA's homepage
        pages.homePage().Edit_ADA.click();
        //chane name ADA to ADAs
        pages.homePage().nameEditBox.sendKeys("s");

        pages.homePage().Save_ADA.click();

        Assert.assertTrue(pages.homePage().nameAfetrSavedBox.getText().contains("ADAs"));
        pages.homePage().Edit_ADA.click();
        pages.homePage().nameEditBox.sendKeys(Keys.BACK_SPACE);
        pages.homePage().Save_ADA.click();
        pages.homePage().Edit_ADA.click();
        pages.homePage().Save_ADA.click();

    }

}
