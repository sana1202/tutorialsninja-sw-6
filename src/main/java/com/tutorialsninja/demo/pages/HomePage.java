package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*")
    List<WebElement> topMenuTabs;
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopTab;
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopAndNotebookTab;
    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentsTab;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllComponents']")
    WebElement showAllComponents;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllDesktops']")
    WebElement showAllDesktopTab;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllLaptops & Notebooks']")
    WebElement showAllLaptopAndNotebookTab;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Currency']")
    WebElement currencyLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'dropdown-menu']/li")
    List<WebElement> currencyList1;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li")
    List<WebElement> myAccountOptions;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountLink;


    public void selectMenu(String menu) {
        List<WebElement> topMenuList = topMenuTabs;
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = topMenuTabs;
        }
        log.info("Click " + menu + " from homepage Top menu  " + topMenuTabs.toString());
    }

    public void navigateToDesktopPage() {
        clickOnElement(desktopTab);
        clickOnElement(showAllDesktopTab);
        log.info("Mouse hover on “Desktops” Tab and click " + desktopTab.toString());
    }

    public void navigateToLaptopAndNotebooksPage() {
        clickOnElement(laptopAndNotebookTab);
        clickOnElement(showAllLaptopAndNotebookTab);
        log.info("Mouse hover on “Laptops & Notebooks” Tab and click " + laptopAndNotebookTab.toString());
    }

    public void navigateToComponentsPage() {
        clickOnElement(componentsTab);
        clickOnElement(showAllComponents);
        log.info(" Mouse hover on “Components” Tab and click " + componentsTab.toString());

    }

    public void clickOnShowAllDesktop() {
        clickOnElement(desktopTab);
        clickOnElement(showAllDesktopTab);
        log.info("Click on Show All Desktop tab " + showAllDesktopTab.toString());
    }

    public void clickOnShowAllLaptopAndNoteBook() {
        clickOnElement(laptopAndNotebookTab);
        clickOnElement(showAllLaptopAndNotebookTab);
        log.info("Click on Show All LaptopAndNotebook Tab " + showAllLaptopAndNotebookTab.toString());
    }

    public void clickOnCurrency(String text) {

        clickOnElement(currencyLink);
        log.info("Clicking on Currency on top of page " + currencyLink.toString());
        List<WebElement> currencyList = currencyList1;
        for (WebElement e : currencyList) {
            if (e.getText().equalsIgnoreCase(text)) {
                e.click();
                break;
            }
        }
        log.info("Select " + text + " from currency drop down list " + currencyList1.toString());
    }

    public void selectMyAccountOptions(String option) {

        List<WebElement> myAccountList = myAccountOptions;
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = myAccountOptions;
        }
        log.info("Select " + option + " from myAccount drop down list " + myAccountOptions.toString());
    }

    public void clickOnMyAccountLink() {
        Reporter.log("Clicking on My Account Link " + myAccountLink.toString());
        clickOnElement(myAccountLink);
    }
}
