package com.bank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Utility;

public class CustomersPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomersPage.class.getName());
    public CustomersPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath="//body[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement depositButton ;

    @FindBy(xpath="//input[@placeholder='amount']")
    WebElement amount ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement deposit;
    @CacheLookup
    @FindBy(xpath ="//body[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/span[1]")
    WebElement depositSuccessText ;
    @CacheLookup
    @FindBy(xpath= "//body[1]/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]")
    WebElement withdrawl ;

    @FindBy(xpath= "//body[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement amountWithdrawTextbox ;
    @CacheLookup
    @FindBy(xpath= "(//button[normalize-space()='Withdraw'])[1]")
    WebElement withdrawButton ;
    @CacheLookup
    @FindBy(xpath="(//span[@class='error ng-binding'])[1]")
    WebElement transactionSuccessText ;
    public void clickOnDepositButton(){
        log.info("Click on Deposit button"+ depositButton.toString());
        clickOnElement(depositButton);
    }
    public void sendAmountForDeposit(String amount1){

        log.info("Enter Deposit Amount "+amount.toString());
        sendTextToElement(amount,amount1);
    }
    public void clickOnDeposit() {
        log.info("Click on Deposit button"+deposit.toString());
        clickOnElement(deposit);
    }
    public void clickWithdrawl() {
        log.info("Click on withdrawl"+withdrawl.toString());
        clickOnElement(withdrawl);
    }
    public String getDepositSuccessText(){
        log.info("Get deposit success text"+depositSuccessText.toString());
        return getTextFromElement(depositSuccessText);
    }
    public void sendWithdrawalAmount(String amount){
        log.info("Enter Withdrawal Amount"+ amountWithdrawTextbox.toString());
        sendTextToElement(amountWithdrawTextbox,amount);
    }
    public void clickOnWithdrawButton(){

        log.info("Click on Withdraw button"+ withdrawButton.toString());
        clickOnElement(withdrawButton);
    }
    public String verifyWithdrawTransaction(){
        log.info("Verify Withdrawl Transaction text"+transactionSuccessText.toString());
        return getTextFromElement(transactionSuccessText);
    }
}
