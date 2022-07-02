package pl.coderslab.seleniumcourse.homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.sql.Driver;
import java.time.Duration;

public class homework_zadanie2 {
    @Test
    public void shouldFindElements() {
        WebDriver driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement signButton = driver.findElement(By.className("hide_xs"));
        signButton.click();

        //WebElement safari = driver.findElement(By.className("is_required validate account_input form-control"));
        //safari.sendKeys("pl@pl.pl");
        //safari.submit();

    }
}