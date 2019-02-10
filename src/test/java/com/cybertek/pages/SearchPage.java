package com.cybertek.pages;


import com.cybertek.utilities.Driver;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends TestBase {

    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/input")
    WebElement SeachingBox;

//    @FindBy(xpath = "//span[@class='o_searchview_more fa fa-search-plus']")
//    public WebElement MgniffierIcone;

    //=======Filter button==========
    @FindBy(xpath = "//span[@title='Advanced Search...']")
    public WebElement MagniffierIcone;

//    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/button")
//    public static WebElement FilterButton;

    @FindBy(xpath = "(//div[@class='btn-group o_dropdown'])[1]")
    public WebElement FilterButton;

    @FindBy(xpath = "(//span[@class='caret'])[1]")
    public WebElement FilterDropDown;

    //seachBox
    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;
    @FindBy(xpath = "//select[@class='o_input o_searchview_extended_prop_field']")
    public WebElement SelectFromActionNeededButton;

    public void Select_List(int index){
        Select list=new Select(SelectFromActionNeededButton);
        list.selectByIndex(index);
    }


    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_apply_filter']")
    public WebElement ApplyButton;

    //========Group By==================

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/button")
    public  WebElement GroupByButton;

    @FindBy(xpath = "//li[@class='o_add_custom_group o_closed_menu']")
    public WebElement AddCustomDropDownGroup;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_add_group o_select_group']")
    public WebElement applyButtonInGroup;

    @FindBy(xpath = "//select[@class='o_input o_add_group o_group_selector']")
    public WebElement DroupDownListUnderGroupBy;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/ul[1]/li[1]")
    public WebElement SalesPerson;

//     @FindBy(className = "o_column_title")
//     public WebElement UsernameDispalys;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']//button[2]")
    public WebElement ListButton;

    @FindBy(xpath = "//div[@class='table-responsive']")
    public WebElement tableDisplay;

    @FindBy(xpath = "//li[@class='o_user_menu']//a[@class='dropdown-toggle']")
    public WebElement Usernamedisplays;

    @FindBy(xpath = "//a[@data-menu='documentation']")
    public WebElement documentation;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm dropdown-toggle']")
    public WebElement measure;

    @FindBy(xpath = "//a[@data-menu='support']")
    public WebElement supportbtn;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']//button[3]")
    public WebElement Graghbtn;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']//button[4]")
    public WebElement pivot;

    @FindBy(xpath = "//th[@rowspan='2']")
    public WebElement  pivotTable;

    //
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[3]/button[1]")
    public WebElement KanbanButton;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']//button[5]")
    public WebElement CalendarButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/button[1]")
    public WebElement DayDisplay;

    @FindBy(xpath = " /html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[1]/a")
    public WebElement UnreadMessageButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[3]/a")
    public WebElement MyPipelineButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[4]/a")
    public WebElement UnassignedButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[6]/a")
    public WebElement ActivitiesToDoButton;

    @FindBy(partialLinkText = "Los")
    public WebElement LostButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[3]/button[3]")
    public WebElement GraphButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")
    public WebElement BarChartButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[12]/a")
    public WebElement OverdueOpportunitiesButton;


    @FindBy(xpath = "//div[@class='form-group field-login']/input")
    public WebElement emailBox;

    @FindBy(xpath = "//div[@class='form-group field-password']/input")
    public WebElement passwordBox;

    @FindBy(xpath = "//div[@class='clearfix oe_login_buttons']/button")
    public WebElement login_button;



    @FindBy(xpath = "//span[contains(text(),'Lead Tags')]")
    public WebElement  LeadTag;



    @FindBy(xpath = "//a[@title='Conversations']")
    public WebElement  conversation;


    @FindBy(xpath = "//button[contains(text(),'New message')]")
    public WebElement  newMassageBtn;


    @FindBy(xpath = "//div[@class='o_chat_header']")
    public WebElement  newMassagePopUp;



    @FindBy(xpath = "//a[@class='o_chat_window_close fa fa-close']")
    public WebElement  windowCloseBtn;


    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/header/div[1]/ul/li[1]/div/div/div/div[1]")
    public WebElement  webSiteApps;


    @FindBy(xpath = "//body/div[@id='wrapwrap']/header[contains(@class,'o_no_autohide_menu')]/div[contains(@class,'o_main_header_main')]/ul[contains(@class,'o_primary_nav')]/li[1]")
    public WebElement  AppsBtn;


    @FindBy(xpath = "//div[@class='oe_website_login_container flex-grow-1 card mt-5 shadow']")
    public WebElement  signInContaner;


    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    public WebElement  signInBtn;

 //     /html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]


    @FindBy(xpath = "//*[@id=\"top_menu\"]/li[5]/a")
    public WebElement  APIBtn;

    //body/div[@class='has_code_col']/main[@class='container has_code_col']/div[@class='o_content row']/article[contains(@class,'doc-body')]/section[3]/div[1]

    @FindBy(xpath = "//*[@id=\"top_menu\"]/li[5]/a")
    public WebElement  configrationArtical;


    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/header/div[1]/ul/li[5]/a")
    public WebElement  DOCBtn;


    @FindBy(xpath = "//a[@data-menu='account']")
    public WebElement  myAccount;


    @FindBy(xpath = "//div[@class='panel-body']")
    public WebElement  panalBody;

}


