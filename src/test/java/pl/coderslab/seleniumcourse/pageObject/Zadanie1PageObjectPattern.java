package pl.coderslab.seleniumcourse.pageObject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static pl.coderslab.seleniumcourse.Tools.*;

public class Zadanie1PageObjectPattern {
    private WebDriver driver;
    private MainHotelTestlabPage mainPage;
    private LoginHotelTestlabPage loginPage;
    private CreateAnAccountHotelTestlabPage createAccountPage;
    private MyAccountHotelTestlabPage myAccountPage;

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.mainPage = new MainHotelTestlabPage(driver);
        this.loginPage = new LoginHotelTestlabPage(driver);
        this.createAccountPage = new CreateAnAccountHotelTestlabPage(driver);
        this.myAccountPage = new MyAccountHotelTestlabPage(driver);

    }

    @Test
    public void shouldFillRegisterUserForm() {

        driver.get("https://hotel-testlab.coderslab.pl/en/");

        mainPage.clickSignIn();
        String email = generateRandomEmail();
        loginPage.attemptAccountCreationForEmail(email);
        UserDetailsDto userDetails = new UserDetailsDto()
                        .setFirstName("ala")
                        .setLastName("makota")
                        .setPassword("supertajnehaslo");

        //        String actual = createAccountPage.getUserEmail();
        //assertEquals(email, actual);


        //sleep(100);
        //assertTrue(myAccountPage.isAccountCreationSuccessful());
        createAccountPage.attemptAccountCreationForUserDetails(userDetails);
        // then



/*
        MainHotelTestlabPage mainPage = new MainHotelTestlabPage(driver);
        mainPage.clickSignIn();

        WebElement signInButton = driver.findElement(By.cssSelector("a.user_login.navigation-link"));
        signInButton.click();

        WebElement emailInput = driver.findElement(By.cssSelector("#email_create"));
        assertDisplayedAndEnabled(emailInput);
        fillInput(emailInput, generateRandomEmail());
        WebElement createAnAccountButton = driver.findElement(By.cssSelector("#SubmitCreate"));
        assertDisplayedAndEnabled(createAnAccountButton);
        createAnAccountButton.click();

        WebElement customerFirstnameInput = driver.findElement(By.id("customer_firstname"));
        assertDisplayedAndEnabled(customerFirstnameInput);
        fillInput(customerFirstnameInput, "ala");
        WebElement customerLastnameInput = driver.findElement(By.id("customer_lastname"));
        assertDisplayedAndEnabled(customerLastnameInput);
        fillInput(customerLastnameInput, "makota");
        WebElement customerEmailInput = driver.findElement(By.id("email"));
        assertDisplayedAndEnabled(customerEmailInput);
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        assertDisplayedAndEnabled(passwordInput);
        fillInput(passwordInput, "supertajnehaslo");

        WebElement submitButton = driver.findElement(By.id("submitAccount"));
        assertDisplayedAndEnabled(submitButton);
        submitButton.click();
        driver.quit();
        */

        //driver.quit();
    }

}
