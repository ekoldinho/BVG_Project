package com.bvg.step_definitions;

import com.bvg.pages.LoginPage;
import com.bvg.utilities.ConfigurationReader;
import com.bvg.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();
    @Given("user is on login page")
    public void userIsOnLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
    }

    @Given("user hovers over language preference and selects Deutsch")
    public void userHoversOverLanguagePreferenceAndSelectsDeutsch() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.languagePreference);
        actions.moveToElement(loginPage.DeutschLanguage).click().perform();
    }

    @When("user clicks on email input box and enter email {string}")
    public void userClicksOnEmailInputBoxAndEnterEmail(String validEmail) {
    loginPage.inputEmail.sendKeys(validEmail);
    }

    @And("user clicks to password input box and enter password {string}")
    public void userClicksToPasswordInputBoxAndEnterPassword(String validPassword) {
        loginPage.inputPassword.sendKeys(validPassword);
    }

    @And("user clicks on 'Sign In' button or hit enter key")
    public void userClicksOnSignInButtonOrHitEnterKey() {
        loginPage.signInButton.click();

    }

    @And("user accepts cookies")
    public void userAcceptsCookies() {
        loginPage.acceptCookies.click();
    }

    @Then("user verifies landing on account page")
    public void userVerifiesLandingOnAccountPage() {
        String expectedGreetingMessage= "Herzlich Willkommen in deinem BVG-Konto!";
        String actualGreetingMessage = loginPage.greetingMessage.getText();
        Assert.assertEquals(expectedGreetingMessage,actualGreetingMessage);
    }

    @When("user inserts the following invalid username {string}")
    public void userInsertsTheFollowingInvalidUsername(String invalidUsername) {
        loginPage.inputEmail.sendKeys(invalidUsername);
    }

    @And("user inserts the following invalid password {string}")
    public void userInsertsTheFollowingInvalidPassword(String invalidPassword) {
        loginPage.inputPassword.sendKeys(invalidPassword);
    }

    @Then("user verifies the following warning message {string}")
    public void userVerifiesTheFollowingWarningMessage(String warningMessageForInvalidCredentials) {
        String expectedWarningMessage = warningMessageForInvalidCredentials;
        String actualWarningMessage = loginPage.warningMessage.getText();
        Assert.assertEquals(expectedWarningMessage,actualWarningMessage);
    }


    @Then("user verifies the following warning message or any equivalent message {string}")
    public void userVerifiesTheFollowingWarningMessageOrAnyEquivalentMessage(String warningMessageForNoUsernamOrPassword) {
        String expectedWarningMessage = warningMessageForNoUsernamOrPassword;
        String actualWarningMessage = loginPage.warningMessage.getText();
        Assert.assertEquals(expectedWarningMessage,actualWarningMessage);
    }

    @When("user enters email {string} and password {string}")
    public void userEntersEmailAndPassword(String email, String password) {
        loginPage.inputEmail.sendKeys(email);
        loginPage.inputPassword.sendKeys(password);
    }

    @Then("password must be seen as dots")
    public void passwordMustBeSeenAsDots() {
        String expectedAttribute = "password";
        String actualAttribute = loginPage.inputPassword.getAttribute("type");
        Assert.assertEquals(expectedAttribute,actualAttribute);
    }

    @And("user clicks on the eye button")
    public void clickOnTheEyeButton() {
        loginPage.eyeButton.click();
    }

    @Then("user should see the password explicitly")
    public void userShouldSeeThePasswordExplicitly() {
        String expectedAttribute = "text";
        String actualAttribute = loginPage.inputPassword.getAttribute("type");
        Assert.assertEquals(expectedAttribute,actualAttribute);
    }

    @When("user clicks on 'Passwort Vergessen?' link")
    public void userClicksOnPasswortVergessenLink() {
        loginPage.passwordForgottenLink.click();
    }

    @Then("user is directed to the website to reset password")
    public void userIsDirectedToTheWevsiteToResetPassword() {
        String expectedWebsiteTitle= "Passwort vergessen?";
        String actualWebsiteTitle= loginPage.resetPasswordPageTitle.getText();
        Assert.assertEquals(expectedWebsiteTitle,actualWebsiteTitle);
    }



}
