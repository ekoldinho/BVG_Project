package com.bvg.pages;

import com.bvg.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public LoginPage () {
    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy (xpath = "//input[@id='username']")
public WebElement inputEmail;

@FindBy (xpath = "//input[@id='password']")
public WebElement inputPassword;

@FindBy (xpath = "//input[@class='btn btn-primary btn-block btn-lg']")
public WebElement signInButton;

@FindBy (xpath = "//p[@class='StageAccount_subheading__B1Q2Y StageAccount_lowercase__1yKkv']")
public WebElement greetingMessage;

@FindBy (xpath = "//span[@class='kc-feedback-text']")
public WebElement warningMessage;

@FindBy (xpath = "//span[@class='visibility-switch']")
public WebElement eyeButton;

@FindBy (xpath = "//a[@id='reset-password-link']")
public WebElement passwordForgottenLink;

@FindBy (xpath = "//h1[@id='kc-page-title']")
public WebElement resetPasswordPageTitle;

@FindBy (xpath = "//a[@id='kc-current-locale-link']")
public WebElement languagePreference;

@FindBy (xpath = "(//li[@class='kc-dropdown-item'])[1]")
public WebElement DeutschLanguage;

@FindBy (xpath = "//span[@id='cmpbntyestxt']")
public WebElement acceptCookies;





}

