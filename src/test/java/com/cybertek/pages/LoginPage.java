package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.Pages;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.cybertek.utilities.BrowserUtils.waitForPageToLoad;

import static org.openqa.selenium.support.PageFactory.*;

public class LoginPage extends TestBase {
    public LoginPage(){
        initElements(Driver.getDriver(), SearchPage.class);
    }

    SearchPage obj=new SearchPage();


    public void userLogin(){

        //  open();
       obj.emailBox.sendKeys(ConfigurationReader.getProperties("UserEmai"));
       obj.passwordBox.sendKeys(ConfigurationReader.getProperties("UserPassword"));
        obj.login_button.click();
    }


    public void managerLogin(){

        obj.emailBox.sendKeys(ConfigurationReader.getProperties("ManagerEmail"));
        obj.passwordBox.sendKeys(ConfigurationReader.getProperties("ManagerPassword"));
        obj.login_button.click();
    }

    public void open(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        waitForPageToLoad(5);
    }
}
