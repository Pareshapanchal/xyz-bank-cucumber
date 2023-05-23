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

public class AddCustomerPage extends Utility{
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());
    public AddCustomerPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath= "//button[normalize-space()='Add Customer']")
    WebElement addCustomerTab ;
    @CacheLookup
    @FindBy(css="input[placeholder='First Name']")
    WebElement firstName ;
    @CacheLookup
    @FindBy(xpath="//input[@placeholder='Last Name']")
    WebElement lastName ;
    @CacheLookup
    @FindBy(xpath="//input[@placeholder='Post Code']")
    WebElement postCode ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement addCustomerButton ;
    public void clickOnAddCustomerTab(){

        log.info("Click on Add Customer tab "+ addCustomerTab.toString());
        clickOnElement(addCustomerTab); }
    public void sendFirstName(String firstname){
        log.info("Enter First name "+ firstName.toString());
        sendTextToElement(firstName,firstname);}
    public void sendLastName(String lastname){
        log.info("Enter Last name  "+lastname.toString());
        sendTextToElement(lastName,lastname);}
    public void sendPostCode(String postcode){
        log.info("Enter Postcode "+postCode.toString());
        sendTextToElement(postCode,postcode);}
    public void clickOnAddCustomerButton(){
        log.info("Click on Add Customer button "+addCustomerButton.toString());
        clickOnElement(addCustomerButton);}
    public void verifyCustomerAddedSuccesfullyMessage()throws InterruptedException{
        Alert alert = driver.switchTo().alert();
        String actualMessage = alert.getText();
        System.out.println(actualMessage);
        String expectedMessage ="Customer added successfully with customer id :6";
        boolean message = actualMessage.contains(expectedMessage.trim());
        Assert.assertTrue(message);
        Thread.sleep(2000);
        //click on "ok" button on popup.
        alert.accept();
        Thread.sleep(2000);
        driver.quit();
    }
}
