package pl.coderslab.seleniumcourse.homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class homework_zadanie4 {
    @Test
    public void shouldFindElements() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&create_account=1");

        WebElement socialTitle = driver.findElement(By.xpath("//*[@name=\"id_gender\" and @value=\"1\"]"));
        System.out.println("Element social title został znaleziony");

        WebElement firstName = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        System.out.println("Element first name został znaleziony");

        WebElement lastName = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        System.out.println("Element last name został znaleziony");

        WebElement email = driver.findElement(By.xpath("//input[@name=\"email\" and @class=\"form-control\"]"));
        System.out.println("Element Email został znaleziony");

        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        System.out.println("Element Password został znaleziony");

        WebElement showButton = driver.findElement(By.xpath("//button[@data-action=\"show-password\"]"));
        System.out.println("Element Show został znaleziony");

        WebElement birthdate = driver.findElement(By.xpath("//input[@name=\"birthday\"]"));
        System.out.println("Element Birthdate został znaleziony");


    }
}
