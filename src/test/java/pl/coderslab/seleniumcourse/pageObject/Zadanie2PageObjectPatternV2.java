package pl.coderslab.seleniumcourse.pageObject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static pl.coderslab.seleniumcourse.Tools.generateRandomEmail;

public class Zadanie2PageObjectPatternV2 {
    private WebDriver driver;
    private MainHotelTestlabPage mainPage;
    private AlreadyRegisteredHotelTestlabPage alreadyRegisteredPage;
    private ReturnToMainPage returnMainPage;


    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.mainPage = new MainHotelTestlabPage(driver);
        this.alreadyRegisteredPage = new AlreadyRegisteredHotelTestlabPage(driver);
        this.returnMainPage = new ReturnToMainPage(driver);



    }

    @Test
    public void shouldFillRegisterUserForm() {

        driver.get("https://hotel-testlab.coderslab.pl/en/");

        mainPage.clickSignIn();
        alreadyRegisteredPage.attemptRegister();
        returnMainPage.clickLogo();


        //driver.quit();
    }
}
