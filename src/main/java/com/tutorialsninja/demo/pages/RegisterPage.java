package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerText;
    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephoneField;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPasswordField;
    @CacheLookup
    @FindBy(xpath = "//fieldset[3]//input")
    List<WebElement> subscribeButton;
    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement privacyPolicyCheckBox;
    @CacheLookup
    @FindBy(xpath = "//input[@type='submit']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
    WebElement accountCreatedMessage;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueButton1;

    public String getRegisterText() {
        log.info("Verify the text “Register Account”. " + registerText.toString());
        return getTextFromElement(registerText);
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
        log.info("Enter Firstname " + firstName + " to Firstname field " + firstNameField.toString());
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
        log.info("Enter Lastname " + lastName + " to Lastname field " + lastNameField.toString());
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter email " + email + " to email field " + emailField.toString());
    }

    public void enterTelephone(String telephone) {
        sendTextToElement(telephoneField, telephone);
        log.info("Enter Telephone " + telephone + " to Telephone field " + telephoneField.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter Password " + password + " to Password field " + passwordField.toString());
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
        log.info("Enter ConfirmPassword " + confirmPassword + " to ConfirmPassword field " + confirmPasswordField.toString());
    }

    public void clickOnSubscribeRadioButton(String text) {

        List<WebElement> radioButtons = subscribeButton;
        for (WebElement e : radioButtons) {
            if (e.getText().equals(text)) {
                e.click();
                break;
            }
        }
        log.info("Select Subscribe " + text + " radio button " + subscribeButton.toString());
    }

    public void clickOnPrivacyPolicyCheckBox() {
        clickOnElement(privacyPolicyCheckBox);
        log.info("Click on Privacy Policy check box " + privacyPolicyCheckBox.toString());
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("Clicking on Continue Button " + continueButton.toString());
    }

    public String getAccountCreatedMessage() {
        log.info("Verify the message “Your Account Has Been Created!” " + accountCreatedMessage.toString());
        return getTextFromElement(accountCreatedMessage);
    }

    public void clickOnContinue() {
        clickOnElement(continueButton1);
        log.info("Clicking on Continue Button " + continueButton1.toString());
    }
}
