package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    public
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement checkOutText;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement newCustomerText;
    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckOut;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(id = "input-payment-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "input-payment-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "input-payment-telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(id = "input-payment-address-1")
    WebElement address;
    @CacheLookup
    @FindBy(id = "input-payment-city")
    WebElement city;
    @CacheLookup
    @FindBy(id = "input-payment-postcode")
    WebElement postcode;
    @CacheLookup
    @FindBy(id = "input-payment-country")
    WebElement country;
    @CacheLookup
    @FindBy(id = "input-payment-zone")
    WebElement region;
    @CacheLookup
    @FindBy(id = "button-guest")
    WebElement continueButton1;
    @CacheLookup
    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement textArea;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]")
    WebElement termsCondition;
    @CacheLookup
    @FindBy(id = "button-payment-method")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    WebElement warningMessage;


    public String getCheckoutText() {
        log.info("Verify the text “Checkout” " + checkOutText.toString());
        return getTextFromElement(checkOutText);
    }


    public String getNewCustomerText() {
        log.info("Verify the Text “New Customer” " + newCustomerText.toString());
        return getTextFromElement(newCustomerText);
    }


    public void clickOnGuestCheckOutRadioButton() {
        clickOnElement(guestCheckOut);
        log.info("Click on “Guest Checkout” radio button " + guestCheckOut.toString());
    }


    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("Click on “Continue” tab " + continueButton.toString());
    }


    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
        log.info("Enter firstname " + name + " to firstname field " + firstName.toString());
    }


    public void enterLastName(String name) {
        sendTextToElement(lastName, name);
        log.info("Enter lastname " + name + " to lastname field " + lastName.toString());
    }


    public void enterEmailId(String email) {
        sendTextToElement(emailField, email + getRandomString(3) + "@gmail.com");
        log.info("Enter email " + email + " to email field " + emailField.toString());
    }


    public void enterTelephone(String phoneNumber) {
        sendTextToElement(telephone, phoneNumber);
        log.info("Enter phoneNumber " + phoneNumber + " to phoneNumber field " + telephone.toString());
    }


    public void enterAddressLine1(String addressLine) {
        sendTextToElement(address, addressLine);
        log.info("Enter address Line 1 " + addressLine + " to address field " + address.toString());
    }


    public void enterCity(String cityName) {
        sendTextToElement(city, cityName);
        log.info("Enter city " + cityName + " to city field " + city.toString());
    }


    public void enterPostCode(String postCode) {
        sendTextToElement(postcode, postCode);
        log.info("Enter postcode " + postCode + " to postcode field " + postcode.toString());
    }


    public void selectCountry(String countryName) {
        selectByVisibleTextFromDropDown(country, countryName);
        log.info("Select country " + countryName + " to country field " + country.toString());

    }


    public void selectRegion(String regionName) {
        selectByVisibleTextFromDropDown(region, regionName);
        log.info("Select state " + regionName + " to state field " + region.toString());
    }


    public void clickOnContinue() {
        clickOnElement(continueButton1);
        log.info(" Click on continue button " + continueButton1.toString());
    }


    public void addCommentsToTextArea(String text) {
        sendTextToElement(textArea, text);
        log.info("Enter comments " + text + " in to text area " + textArea.toString());
    }


    public void checkTermsAndConditionCheckBox() throws InterruptedException {
        clickOnElement(termsCondition);
        log.info(" Check the Terms & Conditions check box " + termsCondition.toString());
    }


    public void clickContinue() throws InterruptedException {
        clickOnElement(continueButton2);
        log.info("Click on “Continue” button " + continueButton2.toString());
    }


    public boolean getWarningMessage() throws InterruptedException {
        log.info("Verify the message “Warning: Payment method required!” " + warningMessage.toString());
        return getTextFromElement(warningMessage).contains("Warning: Payment method required!");
    }
}
