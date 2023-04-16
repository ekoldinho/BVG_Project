package com.bvg.step_definitions;

import com.bvg.pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegistrationStepDefinitions {


    RegistrationPage registrationPage = new RegistrationPage();

    @When("user clicks on Registirieren button")
    public void userClicksOnRegistirieren() {
        registrationPage.registrationButton.click();
    }

    @And("user verifies landing on Registrierung page")
    public void userVerifiesLandingOnRegistrierungPage() {
        String expectedPageTitle = "Registrierung";
        String actualPageTitle = registrationPage.pageTitle.getText();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);
    }

    @And("user inserts Nachname {string}")
    public void userInsertsNachname(String nachname) {
        registrationPage.inputNachname.sendKeys(nachname);
    }

    @And("user inserts unregistered E-Mail {string}")
    public void userInsertsUnregisteredEMail(String email) {
        registrationPage.inputEmail.sendKeys(email);
    }

    @And("user inserts Passwort {string}")
    public void userInsertsPasswort(String password) {
        registrationPage.inputPassword.sendKeys(password);
    }

    @And("user inserts the same password to Passwort Bestätigen {string}")
    public void userInsertsTheSamePasswordToPasswortBestätigen(String passwordToConfirm) {
        registrationPage.inputPasswordConfirmation.sendKeys(passwordToConfirm);
    }

    @And("user clicks on Jetzt Registrieren button")
    public void userClicksOnJetztRegistrierenButton() {
        registrationPage.jetztRegistrierenButton.click();
    }

    @Then("user is warned to insert Vorname {string}")
    public void userIsWarnedToInsertVorname(String vornameWarningMessage) {
        Assert.assertTrue(registrationPage.warningMessage.getText().contains(vornameWarningMessage));
    }

    @And("user inserts Vorname {string}")
    public void userInsertsVorname(String vorname) {
        registrationPage.inputVorname.sendKeys(vorname);
    }

    @Then("user is warned to insert Nachname {string}")
    public void userIsWarnedToInsertNachname(String nachnameWarningMessage) {
        Assert.assertTrue(registrationPage.warningMessage.getText().contains(nachnameWarningMessage));
    }

    @Then("user is warned to insert E-Mail through following message {string}")
    public void userIsWarnedToInsertEMailThroughFollowingMessage(String emailWarningMessage) {
        Assert.assertTrue(registrationPage.warningMessage.getText().contains(emailWarningMessage));
    }

    @Then("user is warned to insert Passwort through following message {string}")
    public void userIsWarnedToInsertPasswortThroughFollowingMessage(String passwordWarningMessage) {
        Assert.assertTrue(registrationPage.warningMessage.getText().contains(passwordWarningMessage));
    }

    @Then("user is warned to confirm password through following message {string}")
    public void userIsWarnedToConfirmPasswordThroughFollowingMessage(String passwordToConfirmWarningMessage) {
        Assert.assertTrue(registrationPage.warningMessage.getText().contains(passwordToConfirmWarningMessage));
    }

    @And("user inserts non-identical password to Passwort Bestätigen {string}")
    public void userInsertsNonIdenticalPasswordToPasswortBestätigen(String nonIdenticalPassword) {
        registrationPage.inputPassword.sendKeys(nonIdenticalPassword);
    }

    @Then("user is warned to insert an identical password through following message {string}")
    public void userIsWarnedToInsertAnIdenticalPasswordThroughFollowingMessage(String identicalPasswordWarningMessage) {
        Assert.assertTrue(registrationPage.warningMessage.getText().contains(identicalPasswordWarningMessage));
    }

    @And("user inserts registered E-Mail {string}")
    public void userInsertsRegisteredEMail(String registeredEmail) {
        registrationPage.inputEmail.sendKeys(registeredEmail);
    }

    @Then("user is warned to insert unregistered E-Mail through following message {string}")
    public void userIsWarnedToInsertUnregisteredEMailThroughFollowingMessage(String unregisteredEmailWarningMessage) {
        Assert.assertTrue(registrationPage.warningMessage.getText().contains(unregisteredEmailWarningMessage));
    }

    @And("user inserts invalidPasswortOne {string}")
    public void userInsertsInvalidPasswortOne(String invalidPasswort1) {
        registrationPage.inputPassword.sendKeys(invalidPasswort1);
    }

    @Then("user is warned to insert valid password with at least one special character through following message {string}")
    public void userIsWarnedToInsertValidPasswordWithAtLeastOneSpecialCharacterThroughFollowingMessage(String validPasswordWarningMessage) {
        Assert.assertTrue(registrationPage.warningMessage.getText().contains(validPasswordWarningMessage));
    }

    @And("user inserts invalidPasswortTwo {string}")
    public void userInsertsInvalidPasswortTwo(String invalidPasswort2) {
        registrationPage.inputPassword.sendKeys(invalidPasswort2);
    }

    @Then("user is warned to insert valid password with at least one upper-case letter through following message {string}")
    public void userIsWarnedToInsertValidPasswordWithAtLeastOneUpperCaseLetterThroughFollowingMessage(String validPasswordWarningMessage) {
        Assert.assertTrue(registrationPage.warningMessage.getText().contains(validPasswordWarningMessage));
    }

    @And("user inserts invalidPasswortThree {string}")
    public void userInsertsInvalidPasswortThree(String invalidPasswort3) {
        registrationPage.inputPassword.sendKeys(invalidPasswort3);
    }

    @Then("user is warned to insert valid password with at least eight characters through following message {string}")
    public void userIsWarnedToInsertValidPasswordWithAtLeastEightCharactersThroughFollowingMessage(String validPasswordWarningMessage) {
        Assert.assertTrue(registrationPage.warningMessage.getText().contains(validPasswordWarningMessage));
    }

    @And("user inserts invalidPasswortFour {string}")
    public void userInsertsInvalidPasswortFour(String invalidPasswort4) {
        registrationPage.inputPassword.sendKeys(invalidPasswort4);
    }

    @Then("user is warned to insert valid password with at least one digit through following message {string}")
    public void userIsWarnedToInsertValidPasswordWithAtLeastOneDigitThroughFollowingMessage(String validPasswordWarningMessage) {
        Assert.assertTrue(registrationPage.warningMessage.getText().contains(validPasswordWarningMessage));
    }

    @And("user inserts invalidPasswortFive {string}")
    public void userInsertsInvalidPasswortFive(String invalidPasswort5) {
        registrationPage.inputPassword.sendKeys(invalidPasswort5);
    }

    @Then("user is warned to insert valid password with at least one lower-case letter through following message {string}")
    public void userIsWarnedToInsertValidPasswordWithAtLeastOneLowerCaseLetterThroughFollowingMessage(String validPasswordWarningMessage) {
        Assert.assertTrue(registrationPage.warningMessage.getText().contains(validPasswordWarningMessage));
    }

    @And("user inserts invalidPasswortSix {string}")
    public void userInsertsInvalidPasswortSix(String invalidPasswort6) {
        registrationPage.inputPassword.sendKeys(invalidPasswort6);
    }

    @Then("user is warned to insert unregistered E-Mail, valid password and confirm the password through following messages {string} {string} {string}")
    public void userIsWarnedToInsertUnregisteredEMailValidPasswordAndConfirmThePasswordThroughFollowingMessages(String unregisteredEmailWarningMessage, String validPasswordWarningMessage, String identicalPasswordWarningMessage) {
        Assert.assertTrue(registrationPage.warningMessage.getText().contains(unregisteredEmailWarningMessage));
        Assert.assertTrue(registrationPage.warningMessage.getText().contains(validPasswordWarningMessage));
        Assert.assertTrue(registrationPage.warningMessage.getText().contains(identicalPasswordWarningMessage));
    }


}
