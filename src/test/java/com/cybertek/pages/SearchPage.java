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

}
