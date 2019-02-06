package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class CreateOppPage {
    public CreateOppPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
