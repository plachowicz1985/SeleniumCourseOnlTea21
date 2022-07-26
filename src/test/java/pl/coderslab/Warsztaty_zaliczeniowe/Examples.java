package pl.coderslab.Warsztaty_zaliczeniowe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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


    public Examples(WebDriver driver) {
    PageFactory.initElements(driver, this);
    }


    //public void searchPhrase(String phraseToSearch) {
    // searchInput.sendKeys(phraseToSearch);
    // searchInput.submit();
    //}

    public void setPhoneInput(String phraseToInput) {
        phoneInput.sendKeys(phraseToInput);
    }

    public void setPostcodeInput(String phraseToInput) {
        postcodeInput.sendKeys(phraseToInput);
    }

    public void setCityInput(String phraseToInput) {
        cityInput.sendKeys(phraseToInput);
    }

    public void setAddressInput(String phraseToInput) {
        addressInput.sendKeys(phraseToInput);
    }

    public void setAliasInput(String phraseToInput) {
        aliasInput.sendKeys(phraseToInput);
    }

    public void setCountryInput(String phraseToInput) {
        countryInput.sendKeys(phraseToInput);
    }


    public void clickSaveButton() {
        saveButton.click();
    }

   /* public List<String> yourAddresses() {
        List<String> result = new ArrayList<>();
        List<WebElement> resultsAddresses = driver.findElements(By.cssSelector(".address-body"));
        for (int i = 0; i < resultsAddresses.size(); i++) {
            String headertext = resultsAddresses.get(i).getText();
            result.add(headertext);
        }


        return result;
    }*/

}