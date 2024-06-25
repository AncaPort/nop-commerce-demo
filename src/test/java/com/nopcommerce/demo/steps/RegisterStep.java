package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterStep {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("registration successful")
    public void registrationSuccessful() {
        String expectedText = "Register";
        String actualText = new RegisterPage().getRegisterText();
        Assert.assertEquals(actualText, expectedText);
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
    }

    @Then("I should see the error message {string} in first name field")
    public void iShouldSeeTheErrorMessageInFirstNameField(String arg0) {
    }

    @And("I should see the error message {string} in last name field")
    public void iShouldSeeTheErrorMessageInLastNameField(String arg0) {
    }

    @And("I should see the error message {string} in email field")
    public void iShouldSeeTheErrorMessageInEmailField(String arg0) {
    }

    @And("I should see the error message {string} in password field")
    public void iShouldSeeTheErrorMessageInPasswordField(String arg0) {
    }

    @And("I should see the error message {string} in confirm password field")
    public void iShouldSeeTheErrorMessageInConfirmPasswordField(String arg0) {
    }

    @Then("I should navigate to Register page successfully")
    public void iShouldNavigateToRegisterPageSuccessfully() {
    }

    @And("I click on female gender")
    public void iClickOnFemaleGender() {
    }

    @And("I enter first name {string}")
    public void iEnterFirstName(String arg0) {
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String arg0) {
    }

    @And("I select day")
    public void iSelectDay() {
    }

    @And("I select month")
    public void iSelectMonth() {
    }

    @And("I select Year")
    public void iSelectYear() {
    }

    @And("I enter emailId {string}")
    public void iEnterEmailId(String arg0) {
    }

    @And("I enter password {string} in password field")
    public void iEnterPasswordInPasswordField(String arg0) {
    }

    @And("I confirm password {string}")
    public void iConfirmPassword(String arg0) {
    }

    @Then("I can see message {string}")
    public void iCanSeeMessage(String arg0) {
    }
}
