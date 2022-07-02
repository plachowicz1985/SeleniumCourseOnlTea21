package pl.coderslab.seleniumcourse;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadanie4_xPath {

    @Test
    public void shouldFindElements() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelSignInClass = driver.findElement(By.className("hide_xs"));
        WebElement HotelEmailClass = driver.findElement(By.cssSelector(".inputNew.form-control.grey.newsletter-input"));
        hotelSignInClass.click();
        WebElement HotelEmailAdress = driver.findElement(By.cssSelector(".is_required.validate.account_input.form-control"));
        HotelEmailAdress.sendKeys("testpll@test.pl");
        WebElement HotelCreateButton = driver.findElement(By.cssSelector("#SubmitCreate"));
        HotelCreateButton.click();
        WebElement hotelFirstName = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        hotelFirstName.sendKeys("Piotr");
        WebElement hotelLastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        hotelLastName.sendKeys("Lahović");
        WebElement hotelPassword = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        hotelPassword.sendKeys("cph4t1s");
        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]"));
        registerButton.click();

    }
}