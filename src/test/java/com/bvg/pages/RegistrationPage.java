package com.bvg.pages;

import com.bvg.utilities.Driver;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    public RegistrationPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@value='Registrieren']")
    public WebElement registrationButton;

    @FindBy (xpath = "//h1[@id='kc-page-title']")
    public WebElement pageTitle;

    @FindBy (xpath = "//input[@id='firstName']")
    public WebElement inputVorname;

    @FindBy (xpath = "//input[@id='lastName']")
    public WebElement inputNachname;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement inputEmail;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement inputPassword;

    @FindBy (xpath = "//input[@id='password-confirm']")
    public WebElement inputPasswordConfirmation;

    @FindBy (xpath = "//input[@class='btn btn-primary btn-block btn-lg']")
    public WebElement jetztRegistrierenButton;

    @FindBy (xpath = "//span[@class='kc-feedback-text']")
    public WebElement warningMessage;

}
