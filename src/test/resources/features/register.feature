#2. register.feature
#Insideregister.feature create following scenarios
#1. verifyUserShouldNavigateToRegisterPageSuccessfully
#Click on Register Link
#Verify "Register" text
#2.
#verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
#Click on Register Link
#Click on "REGISTER" button
#Verify the error message "First name is required."
#Verify the error message "Last name is required."
#Verify the error message "Email is required."
#Verify the error message "Password is required."
#Verify the error message "Password is required."
#2. verifyThatUserShouldCreateAccountSuccessfully
#Click on Register Link
#Select gender "Female"
#Enter firstname
#Enter lastname
#Select day
#Select month
#Select year
#Enter email
#Enter password
#Enter Confirm Password
#Click on "REGISTER" button
#Verify message "Your registration completed"

Feature: Register feature
  In Order to perform successful register
  As a User
  I have to enter all necessary details

  @sanity @smoke @regression
  Scenario: User should navigate to register page successfully
    Given I am on homepage
    When I click on register link
    Then I should navigate to Register page successfully

  @smoke @regression
  Scenario: Verify that firstname lastname email password and confirm password fields are mandatory
    Given I am on homepage
    When I click on register link
    And I click on register button
    Then I should see the error message "First name is required." in first name field
    And I should see the error message "Last name is required." in last name field
    And I should see the error message "Email is required." in email field
    And I should see the error message "Password is required." in password field
    And I should see the error message "Password is required." in confirm password field

  @regression
  Scenario: User should create account successfully
    Given I am on homepage
    When I click on register link
    And I click on female gender
    And I enter first name "Katy"
    And I enter last name "pery"
    And I select day
    And I select month
    And I select Year
    And I enter emailId "katper@gmail.com"
    And I enter password "Katty321" in password field
    And I confirm password "Katty321"
    And I click on register button
    Then I can see message "Your registration completed"