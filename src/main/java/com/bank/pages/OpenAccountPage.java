package com.bank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Utility;

public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());
    public OpenAccountPage(){         PageFactory.initElements(driver,this);    }
    @CacheLookup
    @FindBy(xpath="//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccountTab ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/select[1]")
    WebElement customerDropdownOpenAccount ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/select[1]")
    WebElement currencyDropdown ;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Process']")
    WebElement processButton ;
    public void clickOnOpenAccountTab(){
        log.info("Click on Open Account Tab "+openAccountTab.toString());
        clickOnElement(openAccountTab);}
    public void searchForCustomerNameOpenAccount(String customerName){
        log.info("Select Customer name  "+customerDropdownOpenAccount.toString());
        selectByContainsTextFromDropDown(customerDropdownOpenAccount,customerName);}
    public void selectCurrencyOpenAccount(String currency){
        log.info("Select Currency "+currencyDropdown.toString());
        selectByContainsTextFromDropDown(currencyDropdown,currency);}
    public void clickProcessButtonOpenAccount(){
        log.info("Click on process button "+processButton.toString());
        clickOnElement(processButton);
    }
    public void verifyAccountCreatedSuccesfully()throws InterruptedException{
        Thread.sleep(2000);
        Alert alert =driver.switchTo().alert();
        String actualMessage= alert.getText();
        String expectedMessage ="Account created successfully with account Number :1016";
        boolean message = actualMessage.contains(expectedMessage.trim());
        Assert.assertTrue(message);
        Thread.sleep(2000);
        //	click on "ok" button on popup.
        alert.accept();
    }
}
