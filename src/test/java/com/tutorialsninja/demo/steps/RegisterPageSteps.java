package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.RegisterPage;
import com.tutorialsninja.demo.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class RegisterPageSteps {
    @Then("^I should navigate to register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        Assert.assertEquals("Register Account", new RegisterPage().getRegisterText());
    }

    @And("^I filled all mandatory field of registration$")
    public void iFilledAllMandatoryFieldOfRegistration() {
        new RegisterPage().enterFirstName("Iama");
        new RegisterPage().enterLastName("Patel");
        new RegisterPage().enterEmail("patel" + new Utility().getRandomString(4) + "@gmail.com");
        new RegisterPage().enterTelephone("01234567890");
        new RegisterPage().enterPassword("Hellonum1");
        new RegisterPage().enterConfirmPassword("Hellonum1");
        new RegisterPage().clickOnSubscribeRadioButton("Yes");
        new RegisterPage().clickOnPrivacyPolicyCheckBox();
    }

    @And("^I click on continue button of registration page$")
    public void iClickOnContinueButtonOfRegistrationPage() throws InterruptedException {
        Thread.sleep(500);
        new RegisterPage().clickOnContinueButton();
    }

    @Then("^I should see account successfully created message$")
    public void iShouldSeeAccountSuccessfullyCreatedMessage() {
        Assert.assertEquals("Your Account Has Been Created!", new RegisterPage().getAccountCreatedMessage());
    }

    @And("^I click on continue$")
    public void iClickOnContinue() {
        new RegisterPage().clickOnContinue();
    }
}
