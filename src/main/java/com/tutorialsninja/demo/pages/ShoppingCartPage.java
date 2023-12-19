package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDate;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement productDesktopModel;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//div[@class='input-group btn-block']/input[@type='text']")
    WebElement quantityField;
    @CacheLookup
    @FindBy(xpath = "//i[@class = 'fa fa-refresh']")
    WebElement updateButton;
    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement updateSuccessText;
    @CacheLookup
    @FindBy(css = "a.btn.btn-primary")
    WebElement checkoutButton;

    public String getShoppingCartText() {
        log.info(" Verify the text Shopping Cart " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public String getProductText() {
        log.info("Verify the Product name HP LP3065 " + productText.toString());
        return getTextFromElement(productText);
    }

    public String getDeliveryDateOfProduct() {
        log.info("Verify the Delivery Date 2022-11-30 " + deliveryDate.toString());
        return getTextFromElement(deliveryDate);
    }

    public String getProductModel() {
        log.info("Verify the Model Product21 " + productDesktopModel.toString());
        return getTextFromElement(productDesktopModel);
    }

    public String getTotalPrice() {
        log.info("Verify the Total £74.73 " + totalPrice.toString());
        return getTextFromElement(totalPrice);
    }

    public void changeQuantityForProduct(String text) {
        quantityField.clear();
        sendTextToElement(quantityField, text);
        log.info("Change Quantity " + text + " to quantity field " + quantityField.toString());
    }

    public void clickOnUpdateQuantity() {
        clickOnElement(updateButton);
        log.info(" Click on “Update” Tab " + updateButton.toString());
    }

    public String getUpdateSuccessfullyText() {
        log.info("Getting welcome back text " + updateSuccessText.toString());
        return getTextFromElement(updateSuccessText);
    }

    public void clickOnCheckoutButton() {
        clickOnElement(checkoutButton);
        log.info("Click on “Checkout” button " + checkoutButton.toString());
    }
}
