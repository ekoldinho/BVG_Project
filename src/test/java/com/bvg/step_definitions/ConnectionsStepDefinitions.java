package com.bvg.step_definitions;

import com.bvg.pages.ConnectionsPage;
import com.bvg.utilities.ConfigurationReader;
import com.bvg.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class ConnectionsStepDefinitions {
    ConnectionsPage connectionsPage = new ConnectionsPage();


    @Given("user is on main page")
    public void userIsOnMainPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("connections.url"));
        connectionsPage.acceptCookiesButton.click();
    }


    @When("User inserts the following start address {string}")
    public void userInsertsTheFollowingStartAddress(String startAddress) {
        connectionsPage.startAddressButton.sendKeys(startAddress);
    }

    @And("User inserts the following ziel address {string}")
    public void userInsertsTheFollowingZielAddress(String zielAddress) {
        connectionsPage.zielAddressButton.sendKeys(zielAddress);
    }

    @And("User clicks on Verbindung Finden button")
    public void userClicksOnVerbindungFindenButton() {
        connectionsPage.verbindungFindenButton.click();
    }

    @Then("User verifies the possible connections")
    public void userVerifiesThePossibleConnections() {
        Driver.getDriver().switchTo().frame("HAFAS_WEBAPP_IFRAME_0");
        Assert.assertTrue(connectionsPage.connectionsList.isDisplayed());
    }

    @And("User opens Erweiterte list")
    public void userOpensErweiterteList() {
        connectionsPage.erweiterteList.click();

    }

    @And("User deselects SBahn")
    public void userDeselectsSBahn() {
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        //if (wait.until(ExpectedConditions.elementToBeClickable(connectionsPage.sbahnOption))==null)
        //connectionsPage.sbahnOption.click();
        // Actions action = new Actions(Driver.getDriver());
        // action.moveToElement(connectionsPage.sbahnOption).click().perform();
        try {
            connectionsPage.sbahnOption.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
            executor.executeScript("arguments[0].click();", connectionsPage.sbahnOption);
        }
    }

    @And("User closes Erweiterte list")
    public void userClosesErweiterteList() {
        try {
            connectionsPage.erweiterteList.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
            executor.executeScript("arguments[0].click();", connectionsPage.erweiterteList);
        }
    }


    @Then("User verifies the possible connections without the following SBahn lines")
    public void userVerifiesThePossibleConnectionsWithoutTheFollowingSBahnLines(List<String> sbahnLines) {

        Driver.getDriver().switchTo().frame("HAFAS_WEBAPP_IFRAME_0");

        List<WebElement> overallTextsOfLists = Driver.getDriver().findElements(By.xpath("//ul[@class='lyr_tpOverviewList']"));

        for (int i = 0; i < overallTextsOfLists.size(); i++) {
            for (int j = 0; j < sbahnLines.size(); j++) {
                if (sbahnLines.get(j) == overallTextsOfLists.get(i).getText()) {
                    break;
                }
            }
        }



    }

    @When("User inserts the following invalid start address {string}")
    public void userInsertsTheFollowingInvalidStartAddress(String invalidStartAddress) {
        connectionsPage.startAddressButton.sendKeys(invalidStartAddress);
    }

    @And("User inserts the following invalid ziel address {string}")
    public void userInsertsTheFollowingInvalidZielAddress(String invalidZielAddress) {
        connectionsPage.zielAddressButton.sendKeys(invalidZielAddress);
    }

    @Then("User does not verify a list of connections")
    public void userDoesNotVerifyAListOfConnections() {
        Driver.getDriver().switchTo().frame("HAFAS_WEBAPP_IFRAME_0");
        Assert.assertFalse(connectionsPage.connectionsList.isDisplayed());
    }
}

