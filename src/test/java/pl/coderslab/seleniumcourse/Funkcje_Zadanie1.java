package pl.coderslab.seleniumcourse;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Funkcje_Zadanie1 {
    @Test
    public void shouldFindElementsByClassName() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement signButton = driver.findElement(By.className("hide_xs"));
        signButton.click();
        WebElement emailSignIn = driver.findElement(By.id("email_create"));
        emailSignIn.sendKeys("pl@pl.pl");
        emailSignIn.submit();

        WebElement firstName = driver.findElement(By.id("customer_firstname"));
        if (firstName.isDisplayed()) {
            firstName.sendKeys("Piotr");
            System.out.println("firstName is displayed");
        } else {
            System.out.println("firstName is not displayed");

        }

        WebElement lastName = driver.findElement(By.id("customer_lastname"));
        if (lastName.isDisplayed()) {
            lastName.sendKeys("Lachowicz");
            System.out.println("lastName is displayed");
        } else {
            System.out.println("lastName is not displayed");
        }

        WebElement emailCreate = driver.findElement(By.id("email"));
        //nie trzeba ponownie wpisywać maila, strona zapamiętuje go po pierwszym wpisaniu
        if (emailCreate.isDisplayed()) {
            System.out.println("emailCreate is displayed");
        } else {
            System.out.println("emailCreate is not displayed");
        }

        WebElement passwordCreate = driver.findElement(By.id("passwd"));
        if (passwordCreate.isDisplayed()) {
            passwordCreate.sendKeys("haslomaslo");
        } else {
            System.out.println("passwordCreate is not displayed");
        }

        WebElement registerButton = driver.findElement(By.id("submitAccount"));
        if (registerButton.isDisplayed()) {
            System.out.println("registerButton is displayed");
        } else {
            System.out.println("registerButton is not displayed");
        }

        //registerButton.click();
        //na razie bez rejestracji
    }
}