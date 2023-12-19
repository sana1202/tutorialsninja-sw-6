package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.ComponentsPage;
import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopAndNotebookPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover and click on desktop tab$")
    public void iMouseHoverAndClickOnDesktopTab() {
        new HomePage().navigateToDesktopPage();
    }

    @And("^I select menu \"([^\"]*)\"$")
    public void iSelectMenu(String menu) {
        new HomePage().selectMenu(menu);

    }

    @Then("^I should navigate to desktop page successfully$")
    public void iShouldNavigateToDesktopPageSuccessfully() {
        Assert.assertEquals("Desktops", new DesktopPage().getDesktopText());
    }

    @When("^I mouse hover and click on laptop and notebook tab$")
    public void iMouseHoverAndClickOnLaptopAndNotebookTab() {
        new HomePage().navigateToLaptopAndNotebooksPage();
    }

    @Then("^I should navigate to laptop and notebook page successfully$")
    public void iShouldNavigateToLaptopAndNotebookPageSuccessfully() {
        Assert.assertEquals("Laptops & Notebooks", new LaptopAndNotebookPage().getLaptopAndNotebookText());
    }

    @When("^I mouse hover and click on component tab$")
    public void iMouseHoverAndClickOnComponentTab() {
        new HomePage().navigateToComponentsPage();
    }

    @Then("^I should navigate to component page successfully$")
    public void iShouldNavigateToComponentPageSuccessfully() {
        Assert.assertEquals("Components", new ComponentsPage().getComponentText());
    }
}
