package com.bank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Utility;

public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());
    public CustomerLoginPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath="//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
    WebElement customerLoginTab ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[1]/select[1]")
    WebElement searchCustomer ;
    @CacheLookup
    @FindBy(xpath= "//body[1]/div[3]/div[1]/div[2]/div[1]/form[1]/button[1]")
    WebElement login;
    @CacheLookup
    @FindBy(xpath ="//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/strong[1]/span[1]")
    WebElement loginVerifyText ;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Logout']")
    WebElement logoutButton ;
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Your Name :']")
    WebElement yourNameText;
    public void clickOnCustomerTab(){
        log.info("Click on Customer Tab"+ customerLoginTab.toString());
        clickOnElement(customerLoginTab);
    }
    public void searchForCustomer(String text){
        log.info("Select customer "+searchCustomer.toString());
        selectByContainsTextFromDropDown(searchCustomer,text);
    }
    public void clickOnLoginButton(){
        log.info("Click on Login button"+login.toString());
        clickOnElement(login);
    }
    public String getLoginVerifyText(){

        log.info("Verify Login message"+loginVerifyText.toString());
        String text= getTextFromElement(loginVerifyText);
        System.out.println(text);
        return text;

    }
    public boolean verifyLogoutTabDisplayed(){
        log.info("Verify Logout Tab displayed or not"+logoutButton.toString());
        return verifyThatElementIsDisplayed(logoutButton);
    }
    public void clickOnLogoutButton(){
        log.info("Click on Logout button"+logoutButton.toString());
        clickOnElement(logoutButton);
    }
    public String getYourNameText(){
        log.info("Get your name text"+ yourNameText.toString());
        return getTextFromElement(yourNameText);
    }
}
