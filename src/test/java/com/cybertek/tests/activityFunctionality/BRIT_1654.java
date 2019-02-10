package com.cybertek.tests.activityFunctionality;

import com.cybertek.pages.HomePage;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.Pages;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BRIT_1654 extends TestBase {

    BRIT_1654(){
        PageFactory.initElements(Driver.getDriver(), Pages.class);
    }

    @BeforeMethod
    public void setupLogin(){
        new BRIT_1654();
        pages.loginPage().open();
        pages.landingPage().clickDemobtn();
        pages.loginPage().managerLogin();
        // BrowserUtils.verifyElementDisplayed(pages.homePage().CRMButton);
        pages.homePage().ClickCRM();
    }




    @Test
    public void CrmHomePageClick(){


    new BRIT_1654();
        wait.until(ExpectedConditions.visibilityOf(HomePage.CrmButton));

        HomePage.CrmButton.click();
        wait.until(ExpectedConditions.titleContains("Pipeline - Odoo"));

        Assert.assertEquals(driver.getTitle(), "Pipeline - Odoo");



    }
    @Test
    public void ActivityTypesClick(){

        new BRIT_1654();
        wait.until(ExpectedConditions.visibilityOf(HomePage.CrmButton));
        HomePage.CrmButton.click();


        wait(5);
        wait.until(ExpectedConditions.visibilityOf(HomePage.ActivityTypesButton));

        HomePage.ActivityTypesButton.click();
        wait.until(ExpectedConditions.titleContains("Activity Types - Odoo"));
        wait(2);
        Assert.assertEquals(driver.getTitle(),"Activity Types - Odoo");

    }

    @Test
    public void CreateClick(){
        new BRIT_1654();

        wait(2);
        ActivityTypesClick();

        wait(2);
        HomePage.createButtonCustomer.click();


        HomePage.createButtonCustomer.isDisplayed();
        wait(2);
        HomePage.createTypeNmae.click();
        HomePage.createTypeNmae.sendKeys("Test001");

        new Actions(driver).pause(2000).perform();

        HomePage.buttonSvae.click();


        HomePage.creatAfterSaveClick.click();

        HomePage.creatFindTheNameAfterSave.isDisplayed();


    }
    @Test
    public void moodifyTheActivity(){
        new BRIT_1654();

        wait(2);

        CreateClick();
        wait(2);
        HomePage.creatFindTheNameAfterSave.click();

        wait(2);
        HomePage.creatEditButton.click();
        HomePage.createTypeNmae.click();
        HomePage.createTypeNmae.sendKeys("Test00100");

        new Actions(driver).pause(2000).perform();

        HomePage.buttonSvae.click();


        HomePage.creatAfterSaveClick.click();

        HomePage.creatFindTheNameAfterSave2.isDisplayed();




    }
    // first
    @Test
    public void  recommendedNextActivities (){
        new BRIT_1654();
        ActivityTypesClick();
        wait(2);
        HomePage.creatFindTheNameAfterSave2.click();
        new Actions(driver).pause(2000).perform();
        HomePage.creatEditButton.click();

        HomePage.recommendedNextAcButton.click();



        HomePage.recommededListClick.click();




    }
// second
    @Test
    public void addRecommendedNextAc(){
        new BRIT_1654();
        recommendedNextActivities();

        wait(2);


        HomePage.recommendedNextAcButton.click();
        new Actions(driver).pause(2000).perform();
        //HomePage.recommededListClick2.click();
        HomePage.recommendedNextAcButton.click();
        
        HomePage.buttonSvae.click();

    }

    @Test
    public void editDays(){
        new BRIT_1654();
       ActivityTypesClick();

       wait.until(ExpectedConditions.visibilityOf(HomePage.creatFindTheNameAfterSave2));

       HomePage.creatFindTheNameAfterSave2.click();
       HomePage.creatEditButton.click();
       HomePage.daysButton.click();
       HomePage.daysButton.clear();
       HomePage.daysButton.sendKeys("1");

        wait.until(ExpectedConditions.visibilityOf(HomePage.buttonSvae));

       HomePage.buttonSvae.click();

    }

    @Test
    public void checkBoxSelect(){
        new BRIT_1654();
        ActivityTypesClick();

        HomePage.chekBoxClick.click();
        HomePage.chekBoxClick.isSelected();
        HomePage.checkBoxIsSelect.isSelected();

    }

    @Test
    public void deselectCheckBox(){
        new BRIT_1654();
        ActivityTypesClick();

        HomePage.chekBoxClick.click();
        HomePage.chekBoxClick.click();

        Assert.assertFalse(HomePage.chekBoxClick.isSelected());
        Assert.assertFalse(HomePage.checkBoxIsSelect.isSelected());

    }


   @Test
    public void DeleteAction(){
       new BRIT_1654();
       wait(2);
        ActivityTypesClick();

        HomePage.createButtonCustomer.click();


        HomePage.createButtonCustomer.isDisplayed();
        HomePage.createTypeNmae.click();
        HomePage.createTypeNmae.sendKeys("deleteTest");

        new Actions(driver).pause(2000).perform();

        HomePage.buttonSvae.click();
        HomePage.creatAfterSaveClick.click();

        new Actions(driver).pause(2000).perform();

        wait.until(ExpectedConditions.visibilityOf(HomePage.deleteText));
        HomePage.deleteText.click();

        new Actions(driver).pause(2000).perform();

        HomePage.action.click();
        HomePage.actionDelete.click();
        HomePage.deleteOk.click();

        new Actions(driver).pause(2000).perform();

        HomePage.creatAfterSaveClick.click();

        new Actions(driver).pause(2000).perform();

        String deletTextStr= HomePage.deleteText.getText();

        new Actions(driver).pause(2000).perform();

        Assert.assertFalse(deletTextStr.equals("deleteTest"));


    }
}
