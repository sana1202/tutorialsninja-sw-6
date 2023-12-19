package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement returningCustomerText;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement clickOnLogin;
    @CacheLookup
    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement myAccountText;


    public String getReturningCustomerTextFromLoginPage() {
        log.info("Verify the text “Returning Customer” " + returningCustomerText.toString());
        return getTextFromElement(returningCustomerText);
    }


    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter email " + email + "to email field " + emailField.toString());
    }


    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter password " + password + "to password field " + passwordField.toString());
    }


    public void clickOnLoginButton() {
        clickOnElement(clickOnLogin);
        log.info("Clicking on Login Button " + clickOnLogin.toString());
    }


    public String getMyAccountText() {
        log.info("Verify text “My Account” " + myAccountText.toString());
        return getTextFromElement(myAccountText);
    }
}
