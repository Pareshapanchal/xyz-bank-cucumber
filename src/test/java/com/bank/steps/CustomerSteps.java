package com.bank.steps;

import com.bank.pages.CustomerLoginPage;
import com.bank.pages.CustomersPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CustomerSteps {
    @Given("^I am on a homepage$")
    public void iAmOnAHomepage() {
    }

    @When("^I click on \"([^\"]*)\" Tab$")
    public void iClickOnTab(String arg0)  {
        new CustomerLoginPage().clickOnCustomerTab();
    }

    @And("^I search customer that you created\\.$")
    public void iSearchCustomerThatYouCreated() {
        new CustomerLoginPage().searchForCustomer("Harry Potter");
    }

    @And("^I click on \"([^\"]*)\" Button$")
    public void iClickOnButton(String arg0)  {
        new CustomerLoginPage().clickOnLoginButton();
    }
    @Then("^I verify Welcome message$")
    public void iVerifyWelcomeMessage() {
        Assert.assertEquals(new CustomerLoginPage().getLoginVerifyText(),"Harry Potter","Welcome message not displayed");
    }

    @And("^I verify \"([^\"]*)\" Tab displayed\\.$")
    public void iVerifyTabDisplayed(String arg0)  {
        Assert.assertTrue(new CustomerLoginPage().verifyLogoutTabDisplayed(),"Logout tab is not visible");
    }

    @And("^I click on \"([^\"]*)\" on right$")
    public void iClickOnOnRight(String arg0)  {
        new CustomerLoginPage().clickOnLogoutButton();

    }

    @Then("^I verify \"([^\"]*)\" text displayed after logout\\.$")
    public void iVerifyTextDisplayedAfterLogout(String arg0)  {
        Assert.assertEquals(new CustomerLoginPage().getYourNameText(),"Your Name :","Your Name : not displayed");
    }
    @And("^I click on \"([^\"]*)\" Tab on login page$")
    public void iClickOnTabOnLoginPage(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        new CustomersPage().clickOnDeposit();
    }

    @And("^I enter deposit amount \"([^\"]*)\" on Deposit option$")
    public void iEnterDepositAmountOnDepositOption(String amt)  throws InterruptedException{
        Thread.sleep(2000);
        new CustomersPage().sendAmountForDeposit(amt);

    }
    @And("^I click on \"([^\"]*)\" Button after depositing amount$")
    public void iClickOnButtonAfterDepositingAmount(String arg0)  throws InterruptedException{
        Thread.sleep(1000);
        new CustomersPage().clickOnDepositButton();
    }

    @Then("^I verify message \"([^\"]*)\" on customer login page$")
    public void iVerifyMessageOnCustomerLoginPage(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(new CustomersPage().getDepositSuccessText(),"Deposit Successful","Amount has not been deposited");
    }
    @And("^I click on \"([^\"]*)\" Tab on customer login page$")
    public void iClickOnTabOnCustomerLoginPage(String arg0) throws InterruptedException{
        Thread.sleep(2000);
        new CustomersPage().clickWithdrawl();
    }

    @And("^I enter withdrawl amount \"([^\"]*)\" on withdrawl option$")
    public void iEnterWithdrawlAmountOnWithdrawlOption(String amt)  throws InterruptedException{
        Thread.sleep(2000);
        new CustomersPage().sendWithdrawalAmount("50");
    }
    @And("^I click on \"([^\"]*)\" Button after entering withdrawl amount$")
    public void iClickOnButtonAfterEnteringWithdrawlAmount(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        new CustomersPage().clickOnWithdrawButton();
    }
    @Then("^I verify message \"([^\"]*)\" on page$")
    public void iVerifyMessageOnPage(String arg0)  {

        Assert.assertEquals(new CustomersPage().verifyWithdrawTransaction(),"Transaction successful","Withdrawl not successful");
    }

}
