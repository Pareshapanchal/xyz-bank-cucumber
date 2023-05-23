Feature: xyz Bank Test
@smoke@regression
Scenario: Bank manager should add customer successfully.
  Given  I am on homepage
  When   I click On Bank Manager Login Tab
  And    I click On Add Customer Tab on Bank Manager page
  And    I enter following customers details
          |Shital|Patel|HA5 5DU|
  And    I click On Add Customer Button
  Then   I verify message "Customer added successfully" on Bank Manager Login Page
@sanity@regression
Scenario: BankM manager should open Account successfully.
  Given  I am on homepage
  When   I click On Bank Manager Login Tab
  And    I click On Open Account Tab option
  And    I search customer that created in first test "Harry Potter"
  And    I select currency "Pound"
  And    I click on process button after currency
  Then   I verify message "Account created successfully" after creating account

