package pl.coderslab.Warsztaty_zaliczeniowe.Zadanie_1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.fail;

public class Zaliczenie_Zadanie_1_CucumberSteps {
    private WebDriver driver;
    private Examples examples;


    @Given("^Browser with open page at address (.*)$")
    public void browserCodersLab(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        this.driver = new ChromeDriver();
        this.driver.get(url);
        this.examples = new Examples(driver);
    }

    //będzie logować się na tego stworzonego użytkownika,
    @When("Signed in with created user")
    public void signedIn() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement SignInButton = driver.findElement(By.xpath("//*[contains(text(),\"Sign in\")]"));
        SignInButton.click();
        WebElement loginEmail = driver.findElement(By.name("email"));
        loginEmail.sendKeys("test_marzec@o2.pl");
        WebElement loginPassword = driver.findElement(By.name("password"));
        loginPassword.sendKeys("test_marzec@o2.pl");
        WebElement loginSignInButton = driver.findElement(By.id("submit-login"));
        loginSignInButton.click();
    }

    //wejdzie klikając w kafelek Addresses po zalogowaniu (adres, na którym powinniśmy się znaleźć
// to: https://mystore-testlab.coderslab.pl/index.php?controller=addresses ),
    @And("Checked current URL")
    public void address_checked() {
        String currentURL = driver.getCurrentUrl();
        String expectedUrl = "https://mystore-testlab.coderslab.pl/index.php?controller=addresses";
        Assert.assertEquals(currentURL, expectedUrl);
        System.out.println("Gratulacje, adres URL jest poprawny");
    }

    @And("Addresses clicked")
    public void addresses_clicked() {
        WebElement addressesIcons = driver.findElement(By.id("addresses-link"));
        addressesIcons.click();
    }

    //kliknie w + Create new address,
    @And("Create new address clicked")
    public void create_new_address_clicked() {
        WebElement CreateNewAddressButton = driver.findElement(By.xpath("//*[contains(text(),\"Create new address\")]"));
        CreateNewAddressButton.click();
    }

    //wypełni formularz New address - dane powinny być pobierane z tabeli Examples w Gherkinie (alias, address, city, zip/postal code, country, phone),
    @And("^I add alias (.*)$")
    public void aliasAdd(String aliasToInput) { examples.setAliasInput(aliasToInput);}

    @And("^I add address (.*)$")
    public void addressAdd(String addressToInput) {
        examples.setAddressInput(addressToInput);
    }

    @And("^I add city (.*)$")
    public void cityAdd(String cityToInput) {
        examples.setCityInput(cityToInput);
    }

    @And("^I add postalcode (.*)$")
    public void postalcodeAdd(String postcodeToInput) {
        examples.setPostcodeInput(postcodeToInput);
    }

    @And("^I add phone (.*)$")
    public void phoneAdd(String phoneToInput) {
        examples.setPhoneInput(phoneToInput);
    }

    @And("^I set country (.*)$")
    public void countryAdd(String countryToInput) {
        examples.setCountryInput(countryToInput);
    }

    @And("Click save")
    public void saveButtonClick() {
        examples.clickSaveButton();
    }

    @And("Checked if adress was add")
    public void checkIfAddressWasAdd(){
        String notifications = driver.findElement(By.id("notifications")).getText();
        String expectedNotifications = "Address successfully added!";
        Assert.assertEquals(expectedNotifications, notifications);
    }

    @Then("Checked the added addresses")
    public void checked_the_added_addresses() {

        WebElement updateButton = driver.findElement(By.xpath("//*[@id=\"address-26956\"]/div[2]/a[1]"));
        updateButton.click();

        String aliasExpected = "Mój adres";
        String addressExpected = "Marszałkowska";
        String cityExpected = "Warszawa";
        String postcodeExpected = "00-017";
        String phoneExpected = "225513333";
        String countryExpected = "United Kingdom";

        String alias = driver.findElement(By.name("alias")).getText();
        Assert.assertEquals(aliasExpected, alias);

        String address = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[6]/div[1]/input")).getText();
        Assert.assertEquals(addressExpected, address);

        String city = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[8]/div[1]/input")).getText();
        Assert.assertEquals(cityExpected, city);

        String postcode = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[9]/div[1]/input")).getText();
        Assert.assertEquals(postcodeExpected, postcode);

        String phone = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[11]/div[1]/input")).getText();
        Assert.assertEquals(phoneExpected, phone);

        String country = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select")).getText();
        Assert.assertEquals(countryExpected, country);
    }
}