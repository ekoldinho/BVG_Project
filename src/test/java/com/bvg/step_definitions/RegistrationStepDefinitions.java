package com.bvg.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepDefinitions {


    @When("user clicks on {string}")
    public void userClicksOnRegistirieren() {
    }


    @And("user verifies landing on {string} page")
    public void userVerifiesLandingOnRegistrierungPage() {
    }

    @And("user inserts {string} {string}")
    public void userInsertsNachname(String arg0) {
    }

    @And("user inserts unregistered {string} {string}")
    public void userInsertsUnregisteredEMail(String arg0) {
    }

    @And("user inserts the same password to {string} {string}")
    public void userInsertsTheSamePasswordToPasswortBestätigen(String arg0) {
    }

    @Then("user is warned to insert {string} {string}")
    public void userIsWarnedToInsertVorname(String arg0) {
    }

    @Then("user is warned to insert {string} through following message {string}")
    public void userIsWarnedToInsertEMailThroughFollowingMessage(String arg0) {
    }

    @Then("user is warned to confirm password through following message {string}")
    public void userIsWarnedToConfirmPasswordThroughFollowingMessage(String arg0) {
    }

    @And("user inserts non-identical password to {string} {string}")
    public void userInsertsNonIdenticalPasswordToPasswortBestätigen(String arg0) {
    }

    @Then("user is warned to insert an identical password through following message {string}")
    public void userIsWarnedToInsertAnIdenticalPasswordThroughFollowingMessage(String arg0) {
    }

    @And("user inserts registered {string} {string}")
    public void userInsertsRegisteredEMail(String arg0) {
    }

    @Then("user is warned to insert unregistered {string} through following message {string}")
    public void userIsWarnedToInsertUnregisteredEMailThroughFollowingMessage(String arg0) {
    }

    @Then("user is warned to insert valid password with at least one special character through following message {string}")
    public void userIsWarnedToInsertValidPasswordWithAtLeastOneSpecialCharacterThroughFollowingMessage(String arg0) {
    }

    @Then("user is warned to insert valid password with at least one upper-case letter through following message {string}")
    public void userIsWarnedToInsertValidPasswordWithAtLeastOneUpperCaseLetterThroughFollowingMessage(String arg0) {
    }

    @Then("user is warned to insert valid password with at least {int} characters through following message {string}")
    public void userIsWarnedToInsertValidPasswordWithAtLeastCharactersThroughFollowingMessage(int arg0, String arg1) {
    }

    @Then("user is warned to insert valid password with at least {int} digit through following message {string}")
    public void userIsWarnedToInsertValidPasswordWithAtLeastDigitThroughFollowingMessage(int arg0, String arg1) {
    }

    @Then("user is warned to insert valid password with at least {int} lower-case letter through following message {string}")
    public void userIsWarnedToInsertValidPasswordWithAtLeastLowerCaseLetterThroughFollowingMessage(int arg0, String arg1) {
    }

    @Then("user is warned to insert unregistered {string}, valid password and confirm the password through following messages {string} {string} {string}")
    public void userIsWarnedToInsertUnregisteredEMailValidPasswordAndConfirmThePasswordThroughFollowingMessages(String arg0, String arg1, String arg2) {
    }
}
