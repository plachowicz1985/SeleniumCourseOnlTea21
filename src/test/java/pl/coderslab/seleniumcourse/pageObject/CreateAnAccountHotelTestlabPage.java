package pl.coderslab.seleniumcourse.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static pl.coderslab.seleniumcourse.Tools.fillInput;

public class CreateAnAccountHotelTestlabPage {
    private WebDriver driver;

    //private By customerFirstNameLocator = By.id("customer_firstname");
    @FindBy(id = "customer_firstname")
    private WebElement customerFirstnameInput;

    //private By customerLastNameLocator = By.id("customer_lastname");
    @FindBy(id = "customer_lastname")
    private WebElement customerLastnameInput;

    //private By customerPasswordLocator = By.id("passwd");
    @FindBy(id = "passwd")
    private WebElement passwordInput;

    //private By submitButtonLocator = By.id("submitAccount");
    @FindBy(id = "submitAccount")
    private  WebElement submitButton;

    //private By emailInputLocator = By.id("email");
    @FindBy(id = "email")
    private WebElement emailInput;


    public CreateAnAccountHotelTestlabPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void attemptAccountCreationForUserDetails(UserDetailsDto userDetails) {
        //WebElement customerFirstnameInput = driver.findElement(customerFirstNameLocator);
        fillInput(customerFirstnameInput, userDetails.getFirstName());
        //WebElement customerLastnameInput = driver.findElement(customerLastNameLocator);
        fillInput(customerLastnameInput, userDetails.getLastName());
        //WebElement passwordInput = driver.findElement(customerPasswordLocator);
        fillInput(passwordInput, userDetails.getPassword());

        //WebElement submitButton = driver.findElement(submitButtonLocator);
        submitButton.click();
    }

    public String getUserEmail() {
        //WebElement emailInput = driver.findElement(emailInputLocator);
        return emailInput.getAttribute("value");
    }


}
