package com.bank.steps;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.BankManagerPage;
import com.bank.pages.OpenAccountPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class BankSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click On Bank Manager Login Tab$")
    public void iClickOnBankManagerLoginTab() {
        new BankManagerPage().clickOnBankManagerLoginButton();
    }

    @And("^I click On Add Customer Tab on Bank Manager page$")
    public void iClickOnAddCustomerTabOnBankManagerPage() {
        new AddCustomerPage().clickOnAddCustomerTab();
    }

    @And("^I enter following customers details$")
    public void iEnterFollowingCustomersDetails(DataTable dataTable) {
        List<List<String >> data = dataTable.cells(0);
        new AddCustomerPage().sendFirstName(data.get(0).get(0));
        new AddCustomerPage().sendLastName(data.get(0).get(1));
        new AddCustomerPage().sendPostCode(data.get(0).get(2));
    }

    @And("^I click On Add Customer Button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @Then("^I verify message \"([^\"]*)\" on Bank Manager Login Page$")
    public void iVerifyMessageOnBankManagerLoginPage(String arg0) throws InterruptedException {
        new AddCustomerPage().verifyCustomerAddedSuccesfullyMessage();
    }

    @And("^I click On Open Account Tab option$")
    public void iClickOnOpenAccountTabOption() {
        new OpenAccountPage().clickOnOpenAccountTab();
    }

    @And("^I search customer that created in first test \"([^\"]*)\"$")
    public void iSearchCustomerThatCreatedInFirstTest(String customerName)  {
        new OpenAccountPage().searchForCustomerNameOpenAccount(customerName);
    }

    @And("^I select currency \"([^\"]*)\"$")
    public void iSelectCurrency(String currency) {
        new OpenAccountPage().selectCurrencyOpenAccount(currency);

    }

    @And("^I click on process button after currency$")
    public void iClickOnProcessButtonAfterCurrency() {
        new OpenAccountPage().clickProcessButtonOpenAccount();
    }

    @Then("^I verify message \"([^\"]*)\" after creating account$")
    public void iVerifyMessageAfterCreatingAccount(String arg0) throws InterruptedException {
        new OpenAccountPage().verifyAccountCreatedSuccesfully();
    }

}
