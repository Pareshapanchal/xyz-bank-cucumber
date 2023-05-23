package com.bank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Utility;

public class BankManagerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankManagerPage.class.getName());
    public BankManagerPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(css = "button[ng-click='manager()']")
    WebElement bankManagerLoginButton ;
    public void clickOnBankManagerLoginButton(){
        log.info("Click on Bank Manger Login button" + bankManagerLoginButton.toString());
        clickOnElement(bankManagerLoginButton);}
}
