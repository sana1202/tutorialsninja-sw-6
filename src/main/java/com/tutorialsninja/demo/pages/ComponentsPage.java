package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComponentsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComponentsPage.class.getName());

    public ComponentsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componentText;

    public String getComponentText() {
        log.info("Verify the text ‘Components’ " + componentText.toString());
        return getTextFromElement(componentText);
    }
}
