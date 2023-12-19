package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.ProductPage;
import com.tutorialsninja.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DesktopPageSteps {
    @And("^I click on show all desktops$")
    public void iClickOnShowAllDesktops() {
        new HomePage().clickOnShowAllDesktop();
    }

    @And("^I select currency \"([^\"]*)\"$")
    public void iSelectCurrency(String currency) {
        new HomePage().clickOnCurrency(currency);
    }

    @And("^I click on sort by position$")
    public void iClickOnSortByPosition() {
        new DesktopPage().clickOnSortByPosition();
    }

    @And("^I select product sort by \"([^\"]*)\"$")
    public void iSelectProductSortBy(String text) {
        new DesktopPage().selectProductSorted(text);
    }

    @Then("^I should see product arrange in alphabetical order successfully$")
    public void iShouldSeeProductArrangeInAlphabeticalOrderSuccessfully() {
        Assert.assertEquals(new DesktopPage().expectedList(), new DesktopPage().getSortedProductList());
    }


    @And("^I select product \"([^\"]*)\"$")
    public void iSelectProduct(String productName) {
        new DesktopPage().clickOnProductHPLP3065(productName);
    }

    @Then("^I should navigate to \"([^\"]*)\" product page$")
    public void iShouldNavigateToProductPage(String productName) {
        Assert.assertEquals(productName, new ProductPage().getProductHPLP3065());

    }

    @And("^I select date \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iSelectDate(String year, String month, String date) {
        new ProductPage().selectDate(year, month, date);
    }

    @And("^I add quantity \"([^\"]*)\" for product$")
    public void iAddQuantityForProduct(String quantity) {
        new ProductPage().addQuantityForProduct(quantity);
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        Thread.sleep(500);
        new ProductPage().clickOnAddToCartButton();
    }

    @Then("^I should see product added successfully message$")
    public void iShouldSeeProductAddedSuccessfullyMessage() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertTrue(new ProductPage().getSuccessText().contains("Success: You have added HP LP3065 to your shopping cart!"));
    }

    @And("^I click on shopping cart button$")
    public void iClickOnShoppingCartButton() throws InterruptedException {
        Thread.sleep(500);
        new ProductPage().clickOnShoppingCartButton();
    }

    @Then("^I should see shopping cart text$")
    public void iShouldSeeShoppingCartText() {
        Assert.assertTrue(new ShoppingCartPage().getShoppingCartText().contains("Shopping Cart"));
    }

    @And("^I should see \"([^\"]*)\" product name$")
    public void iShouldSeeProductName(String productName) {
        Assert.assertEquals("HP LP3065", new ShoppingCartPage().getProductText());

    }

    @And("^I should see \"([^\"]*)\" delivery date$")
    public void iShouldSeeDeliveryDate(String deliveryDate) {
        Assert.assertTrue(new ShoppingCartPage().getDeliveryDateOfProduct().contains("2022-11-30"));

    }

    @And("^I should see \"([^\"]*)\" model name$")
    public void iShouldSeeModelName(String modelName) {
        Assert.assertEquals("Product 21", new ShoppingCartPage().getProductModel());
    }

    @And("^I should see total price$")
    public void iShouldSeeTotalPrice() {
        Assert.assertEquals("£74.73", new ShoppingCartPage().getTotalPrice());
    }
}
