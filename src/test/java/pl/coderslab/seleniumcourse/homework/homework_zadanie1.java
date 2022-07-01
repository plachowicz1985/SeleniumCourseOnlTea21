package pl.coderslab.seleniumcourse.homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class homework_zadanie1 {
    @Test
    public void shouldFindElementsByClassName() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://mystore-testlab.coderslab.pl/index.php");


        WebElement signInButton = driver.findElement(By.xpath("//*[contains(text(),\"Sign in\")]"));
        signInButton.click();

        WebElement noAccountButton = driver.findElement(By.xpath("//*[contains(text(),\"No account? Create one here\")]"));
        noAccountButton.click();

        driver.navigate().back();
        driver.navigate().back();

    }
}
