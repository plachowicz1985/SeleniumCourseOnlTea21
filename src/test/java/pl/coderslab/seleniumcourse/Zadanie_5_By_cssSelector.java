package pl.coderslab.seleniumcourse;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadanie_5_By_cssSelector {
    @Test
    public void shouldFindElementsByClassName() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelSignInClass = driver.findElement(By.className("hide_xs"));
        hotelSignInClass.click();
        WebElement hotelRegisteredEmail = driver.findElement(By.cssSelector("#email.is_required.validate.account_input.form-control"));
        hotelRegisteredEmail.sendKeys("testpll@test.pl");
        WebElement hotelPassword = driver.findElement(By.cssSelector("#passwd.is_required.validate.account_input.form-control"));
        hotelPassword.sendKeys("cph4t1s");
        WebElement hotelPasswordSignIn = driver.findElement(By.cssSelector("#SubmitLogin.btn.button.button-medium"));
        hotelPasswordSignIn.click();

        WebElement myPersonalRegistration = driver.findElement(By.cssSelector(".icon-user"));
        WebElement myAdress = driver.findElement(By.cssSelector(".icon-building"));

    }
}
