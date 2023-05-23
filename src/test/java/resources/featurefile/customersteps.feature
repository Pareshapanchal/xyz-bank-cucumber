Feature: xyz Bank customer Test

  Background:
    Given I am on a homepage
    When  I click on "Customer Login" Tab
    And   I search customer that you created.
    And   I click on "Login" Button
    Then  I verify Welcome message
  @smoke@regression
  Scenario: Customer should Login and Logout suceessfully.
    And   I verify "Logout" Tab displayed.
    And   I click on "Logout" on right
    Then  I verify "Your Name" text displayed after logout.
  @sanityregression

  Scenario: Customer should Deposit Money successfully.
    And   I click on "Deposit" Tab on login page
    And   I enter deposit amount "100" on Deposit option
    And   I click on "Deposit" Button after depositing amount
    Then  I verify message "Deposit Successful" on customer login page
  @smoke@regression
  Scenario: Customer should Withdraw money successfully
    And   I click on "Deposit" Tab on login page
    And   I enter deposit amount "1000" on Deposit option
    And   I click on "Deposit" Button after depositing amount
    And   I click on "Withdrawl" Tab on customer login page
    And   I enter withdrawl amount "50" on withdrawl option
    And   I click on "Withdraw" Button after entering withdrawl amount
    Then  I verify message "Transaction Successful" on page