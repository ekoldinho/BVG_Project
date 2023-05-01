package com.bvg.pages;

import com.bvg.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConnectionsPage {

    public ConnectionsPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[@id='cmpbntyestxt']")
    public WebElement acceptCookiesButton;

    @FindBy(xpath = "//input[@id='qa-ConnectionForm-inputStart']")
    public WebElement startAddressButton;

    @FindBy(xpath = "//input[@id='qa-ConnectionForm-inputDest']")
    public WebElement zielAddressButton;

    @FindBy (xpath = "//button[@id='qa-ConnectionForm-buttonSubmit']")
    public WebElement verbindungFindenButton;

    @FindBy (xpath = "//ul[@class='lyr_tpOverviewList']")
    public WebElement connectionsList;

    @FindBy (xpath = "//div[@class='MultiSelect2_selectionDisplay__UTy2d']")
    public WebElement erweiterteList;

    @FindBy (xpath = "//input[@name='sbahn']")
    public WebElement sbahnOption;

    @FindBy (xpath = "//div[@class='lyr_atomOptionInfoText']")
    public WebElement optionInfoTitle;

}
