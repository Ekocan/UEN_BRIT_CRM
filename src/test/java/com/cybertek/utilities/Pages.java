package com.cybertek.utilities;


import com.cybertek.pages.*;

public class Pages {


    private HomePage homePage;
    private LoginPage loginPage;
    private SearchPage searchPage;
    private TopNavigationBar navigationBar;
    private LandingPage landingPage;
    //-------------------------------------------------------

    public LandingPage landingPage(){
        if(landingPage==null){
            landingPage = new LandingPage();
        }
        return landingPage;
    }

    public LoginPage loginPage(){
        if(loginPage==null){
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public HomePage homePage(){
        if(homePage==null){
            homePage = new HomePage();
        }
        return homePage;
    }

    public SearchPage searchPage(){
        if(searchPage==null){
            searchPage = new SearchPage();
        }
        return searchPage;
    }

    public TopNavigationBar navigationBar(){
        if(navigationBar==null){
            navigationBar = new TopNavigationBar();
        }
        return navigationBar;
    }


}
