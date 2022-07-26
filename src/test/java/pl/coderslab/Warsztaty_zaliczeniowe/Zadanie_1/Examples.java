package pl.coderslab.Warsztaty_zaliczeniowe.Zadanie_1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Examples {


    @FindBy(name = "alias")
    private WebElement aliasInput;
    @FindBy(name = "address1")
    private WebElement addressInput;
    @FindBy(name = "city")
    private WebElement cityInput;
    @FindBy(name = "postcode")
    private WebElement postcodeInput;
    @FindBy(name = "phone")
    private WebElement phoneInput;
    @FindBy(name = "id_country")
    private WebElement countryInput;

    @FindBy(xpath = "//*[contains(text(),\"Save\")]")
    private WebElement saveButton;

    private WebDriver driver;

    public Examples(WebDriver driver) {
    PageFactory.initElements(driver, this);
    }


    public void setPhoneInput(String phoneToInput) {
        phoneInput.sendKeys(phoneToInput);
    }

    public void setPostcodeInput(String postcodeToInput) {
        postcodeInput.sendKeys(postcodeToInput);
    }

    public void setCityInput(String cityToInput) {
        cityInput.sendKeys(cityToInput);
    }

    public void setAddressInput(String addressToInput) {
        addressInput.sendKeys(addressToInput);
    }

    public void setAliasInput(String aliasToInput) {
        aliasInput.sendKeys(aliasToInput);
    }

    public void setCountryInput(String phraseToInput) {
        countryInput.sendKeys(phraseToInput);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

}