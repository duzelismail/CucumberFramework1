package com.europe.pages;

import com.europe.utilities.Driver;
import com.europe.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonRegisterPage {

    public AmazonRegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "nav-link-accountList")
    public WebElement registerNav;

    @FindBy(id = "createAccountSubmit")
    public WebElement erstellen;

    @FindBy(id = "nav-flyout-ya-newCust")
    public WebElement startHere;

    @FindBy (id = "ap_customer_name")
    public WebElement nameBox;

    @FindBy(id = "ap_email")
    public WebElement emailBox;

    @FindBy(id = "ap_password")
    public WebElement passwordBox;

    @FindBy(id = "ap_password_check")
    public WebElement passwordCheck;

    @FindBy(id = "continue")
    public WebElement submitButton;

    @FindBy(className = "a-size-large")
    public WebElement puzzleText;



}
