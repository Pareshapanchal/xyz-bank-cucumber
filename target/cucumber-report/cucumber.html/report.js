$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("banksteps.feature");
formatter.feature({
  "line": 1,
  "name": "xyz Bank Test",
  "description": "",
  "id": "xyz-bank-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6375200900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Bank manager should add customer successfully.",
  "description": "",
  "id": "xyz-bank-test;bank-manager-should-add-customer-successfully.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@smoke"
    },
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click On Bank Manager Login Tab",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click On Add Customer Tab on Bank Manager page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter following customers details",
  "rows": [
    {
      "cells": [
        "Shital",
        "Patel",
        "HA5 5DU"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click On Add Customer Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify message \"Customer added successfully\" on Bank Manager Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "BankSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 47574000,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iClickOnBankManagerLoginTab()"
});
formatter.result({
  "duration": 579492600,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iClickOnAddCustomerTabOnBankManagerPage()"
});
formatter.result({
  "duration": 374304400,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iEnterFollowingCustomersDetails(DataTable)"
});
formatter.result({
  "duration": 542728800,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iClickOnAddCustomerButton()"
});
formatter.result({
  "duration": 42749700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer added successfully",
      "offset": 18
    }
  ],
  "location": "BankSteps.iVerifyMessageOnBankManagerLoginPage(String)"
});
formatter.result({
  "duration": 4683852200,
  "status": "passed"
});
formatter.after({
  "duration": 123200,
  "status": "passed"
});
formatter.before({
  "duration": 3984618400,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "BankM manager should open Account successfully.",
  "description": "",
  "id": "xyz-bank-test;bankm-manager-should-open-account-successfully.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@sanity"
    },
    {
      "line": 11,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I click On Bank Manager Login Tab",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I click On Open Account Tab option",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I search customer that created in first test \"Harry Potter\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select currency \"Pound\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on process button after currency",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I verify message \"Account created successfully\" after creating account",
  "keyword": "Then "
});
formatter.match({
  "location": "BankSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 47700,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iClickOnBankManagerLoginTab()"
});
formatter.result({
  "duration": 745747500,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iClickOnOpenAccountTabOption()"
});
formatter.result({
  "duration": 398607100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter",
      "offset": 46
    }
  ],
  "location": "BankSteps.iSearchCustomerThatCreatedInFirstTest(String)"
});
formatter.result({
  "duration": 506187900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pound",
      "offset": 19
    }
  ],
  "location": "BankSteps.iSelectCurrency(String)"
});
formatter.result({
  "duration": 90624700,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iClickOnProcessButtonAfterCurrency()"
});
formatter.result({
  "duration": 56697400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account created successfully",
      "offset": 18
    }
  ],
  "location": "BankSteps.iVerifyMessageAfterCreatingAccount(String)"
});
formatter.result({
  "duration": 4022666200,
  "status": "passed"
});
formatter.after({
  "duration": 623267100,
  "status": "passed"
});
formatter.uri("customersteps.feature");
formatter.feature({
  "line": 1,
  "name": "xyz Bank customer Test",
  "description": "",
  "id": "xyz-bank-customer-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4476605600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on a homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on \"Customer Login\" Tab",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I search customer that you created.",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on \"Login\" Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify Welcome message",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerSteps.iAmOnAHomepage()"
});
formatter.result({
  "duration": 30100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer Login",
      "offset": 12
    }
  ],
  "location": "CustomerSteps.iClickOnTab(String)"
});
formatter.result({
  "duration": 631184100,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.iSearchCustomerThatYouCreated()"
});
formatter.result({
  "duration": 449353500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 12
    }
  ],
  "location": "CustomerSteps.iClickOnButton(String)"
});
formatter.result({
  "duration": 43182500,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.iVerifyWelcomeMessage()"
});
formatter.result({
  "duration": 368994300,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Customer should Login and Logout suceessfully.",
  "description": "",
  "id": "xyz-bank-customer-test;customer-should-login-and-logout-suceessfully.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    },
    {
      "line": 9,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I verify \"Logout\" Tab displayed.",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on \"Logout\" on right",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify \"Your Name\" text displayed after logout.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Logout",
      "offset": 10
    }
  ],
  "location": "CustomerSteps.iVerifyTabDisplayed(String)"
});
formatter.result({
  "duration": 49872200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logout",
      "offset": 12
    }
  ],
  "location": "CustomerSteps.iClickOnOnRight(String)"
});
formatter.result({
  "duration": 44713300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Name",
      "offset": 10
    }
  ],
  "location": "CustomerSteps.iVerifyTextDisplayedAfterLogout(String)"
});
formatter.result({
  "duration": 22293700,
  "status": "passed"
});
formatter.after({
  "duration": 604493700,
  "status": "passed"
});
formatter.before({
  "duration": 4325215600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on a homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on \"Customer Login\" Tab",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I search customer that you created.",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on \"Login\" Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify Welcome message",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerSteps.iAmOnAHomepage()"
});
formatter.result({
  "duration": 17600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer Login",
      "offset": 12
    }
  ],
  "location": "CustomerSteps.iClickOnTab(String)"
});
formatter.result({
  "duration": 799747100,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.iSearchCustomerThatYouCreated()"
});
formatter.result({
  "duration": 493387500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 12
    }
  ],
  "location": "CustomerSteps.iClickOnButton(String)"
});
formatter.result({
  "duration": 70466200,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.iVerifyWelcomeMessage()"
});
formatter.result({
  "duration": 484799400,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Customer should Withdraw money successfully",
  "description": "",
  "id": "xyz-bank-customer-test;customer-should-withdraw-money-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@smoke"
    },
    {
      "line": 21,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I click on \"Deposit\" Tab on login page",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I enter deposit amount \"1000\" on Deposit option",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on \"Deposit\" Button after depositing amount",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on \"Withdrawl\" Tab on customer login page",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I enter withdrawl amount \"50\" on withdrawl option",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on \"Withdraw\" Button after entering withdrawl amount",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I verify message \"Transaction Successful\" on page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Deposit",
      "offset": 12
    }
  ],
  "location": "CustomerSteps.iClickOnTabOnLoginPage(String)"
});
formatter.result({
  "duration": 1057902600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000",
      "offset": 24
    }
  ],
  "location": "CustomerSteps.iEnterDepositAmountOnDepositOption(String)"
});
formatter.result({
  "duration": 2148745800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deposit",
      "offset": 12
    }
  ],
  "location": "CustomerSteps.iClickOnButtonAfterDepositingAmount(String)"
});
formatter.result({
  "duration": 1111915300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Withdrawl",
      "offset": 12
    }
  ],
  "location": "CustomerSteps.iClickOnTabOnCustomerLoginPage(String)"
});
formatter.result({
  "duration": 2093026300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 26
    }
  ],
  "location": "CustomerSteps.iEnterWithdrawlAmountOnWithdrawlOption(String)"
});
formatter.result({
  "duration": 2126445000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Withdraw",
      "offset": 12
    }
  ],
  "location": "CustomerSteps.iClickOnButtonAfterEnteringWithdrawlAmount(String)"
});
formatter.result({
  "duration": 2072303200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Transaction Successful",
      "offset": 18
    }
  ],
  "location": "CustomerSteps.iVerifyMessageOnPage(String)"
});
formatter.result({
  "duration": 24013400,
  "status": "passed"
});
formatter.after({
  "duration": 723627700,
  "status": "passed"
});
});