package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    public static  @FindBy(xpath = "//span[@class='oe_menu_text'][contains(text(),'CRM')]")
    WebElement CRMButton;

    //=======elements on the left=========

    static public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[14]/span")
    WebElement pipelinet;

    static public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[15]/span")
    WebElement Quotations;

    static public @FindBy(xpath ="(//a[@class='oe_menu_leaf']//span)[16]")
    WebElement customersElement;

    static  public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[17]/span")
    WebElement reporting;

    static  public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[18]/span")
    WebElement Activities;

    static  public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[19]/span")
    WebElement SalesChannels;

    static  public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[20]/span")
    WebElement configuration;

    static  public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[21]/span")
    WebElement configurationActivityTypesElement;

    static  public  @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[5]/ul[3]/li[3]/a/span")
    WebElement LeadsOpportunities;




    public static void ClickCRM(){
        CRMButton.click();
    }
}
