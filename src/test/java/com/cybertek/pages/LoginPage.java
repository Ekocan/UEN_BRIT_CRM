package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.cybertek.utilities.BrowserUtils.waitForPageToLoad;
import static org.openqa.selenium.support.PageFactory.*;

public class LoginPage extends TestBase {
    public LoginPage(){
        initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='form-group field-login']/input")
    public WebElement emailBox;

    @FindBy(xpath = "//div[@class='form-group field-password']/input")
    public WebElement passwordBox;

    @FindBy(xpath = "//div[@class='clearfix oe_login_buttons']/button")
    public WebElement login_button;



    public void userLogin(){
        //  open();
        emailBox.sendKeys(ConfigurationReader.getProperties("UserEmai"));
        passwordBox.sendKeys(ConfigurationReader.getProperties("UserPassword"));
        login_button.click();
    }


    public void managerLogin(){

        emailBox.sendKeys(ConfigurationReader.getProperties("ManagerEmail"));
        passwordBox.sendKeys(ConfigurationReader.getProperties("ManagerPassword"));
        login_button.click();
    }

    public void open(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        waitForPageToLoad(5);
    }
}
