package com.mycompany.app.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert; // Use Assert from JUnit 4

public class StepDefinitions {

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        // Navigate to the login page
    }

    @When("the user enters correct email and password")
    public void theUserEntersCorrectEmailAndPassword() {
        // Enter correct email and password
    }

    @When("the user enters incorrect email or password")
    public void theUserEntersIncorrectEmailOrPassword() {
        // Enter incorrect email or password
    }

    @When("the user enters correct email or password")
    public void the_user_enters_correct_email_or_password() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("the user clicks the login button")
    public void theUserClicksTheLoginButton() {
        // Click the login button
    }

    @Then("the user should be redirected to the homepage")
    public void theUserShouldBeRedirectedToTheHomepage() {
        // Verify the user is redirected to the homepage
         boolean isRedirectedToHomepage = true; // This would usually be set based on actual logic
        // Failing the test intentionally
        Assert.assertFalse("The user was incorrectly redirected to the homepage.", isRedirectedToHomepage);
    }

    @Then("the user should see an error message")
    public void theUserShouldSeeAnErrorMessage() {
        // Verify the error message is displayed
        Assert.assertTrue(true);  // Replace with actual verification
    }
}
