package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

    static public @FindBy(xpath = "//span[@class='oe_menu_text'][contains(text(),'CRM')]")
    WebElement CrmButton;

    static public @FindBy(xpath = "//span[contains(text(),'Activity Types')]")
    WebElement ActivityTypesButton;

    static public @FindBy(xpath ="//button[contains(text(),'Create')]" )
    WebElement createButton;

    static public @FindBy(xpath = "//input[@name='name']")
    WebElement createTypeNmae;

    static public @FindBy(xpath = "//button[@accesskey='s']")
    WebElement buttonSvae;

    static public @FindBy(xpath = "//a[contains(text(),'Activity Types')]")
    WebElement creatAfterSaveClick;

    static  public @FindBy(xpath = "//td[contains(text(),'Test001')]")
    WebElement creatFindTheNameAfterSave;

    static public @FindBy(xpath = "//button[contains(text(),'Edit')]")
    WebElement creatEditButton;

    static  public @FindBy(xpath = "//td[contains(text(),'Test00100')]")
    WebElement creatFindTheNameAfterSave2;

    static public @FindBy(xpath = "//div[@name='next_type_ids']//input[@type='text']")
    WebElement recommendedNextAcButton;

    static  public @FindBy(linkText = "Efi")
    WebElement  recommededListClick;

    static public @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    WebElement  recommededListClick2;

    static public @FindBy(xpath = "//input[@name='days']")
    WebElement daysButton;

    static public @FindBy(xpath = "//th[@class='o_list_record_selector']//input[@type='checkbox']")
    WebElement chekBoxClick;

    static public @FindBy(xpath = "//tbody[@class='ui-sortable']//tr[1]//td[1]//div[1]//input[1]")
    WebElement checkBoxIsSelect;

    static public @FindBy(xpath = "//tbody[@class='ui-sortable']//tr[68]//td[3]")
    WebElement deleteText;

    static public  @FindBy(xpath = "//button[contains(text(),'Action')]")
    WebElement action;

    static public  @FindBy(xpath = "//a[@data-index='0']")
    WebElement actionDelete;
    static  public  @FindBy(xpath = "//span[contains(text(),'Ok')]")
    WebElement deleteOk;

//====elements for Customers Functionality=======
    static  public  @FindBy(xpath = "//span[.='ADA']")
    WebElement name_ADA_kanban;
    static  public  @FindBy(xpath = "//td[.='ADA']")
    WebElement name_ADA_list;
    static public @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    WebElement Edit_ADA;
    static public @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    WebElement Save_ADA;

    static  public  @FindBy(linkText = "Save")
    WebElement SaveAfterEdit;

    static public @FindBy(xpath = "//input[@name='name']")
    WebElement nameEditBox;

    static public @FindBy(xpath = "//span[@name='name']")
    WebElement nameAfetrSavedBox;

    static public @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    WebElement createButtonCustomer;

    static public @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div/div[3]/div[2]")
    WebElement individualTextLink;

    static public @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input'][1]")
    WebElement companyBoxForNewAccnt;

    static public @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div/div[3]/div[2]/div[2]/label")
    WebElement companyRadioButtonText;

    static public @FindBy(xpath = "(//button[@class='fa fa-external-link btn btn-default o_external_button'])[1]")
    WebElement existCompanyNameLink;

    static public @FindBy(xpath = "//label[contains(text(),'Job Position')]")
    WebElement jobPositionInNewaccnt;

    static public @FindBy(xpath = "//label[contains(text(),'Title')]")
    WebElement titleTextLinkInNewaccnt;




    public static void ClickCRM(){
        wait.until(ExpectedConditions.elementToBeClickable(CRMButton));
        CRMButton.click();
        wait.until(ExpectedConditions.titleContains("Pipelin"));
    }
}
