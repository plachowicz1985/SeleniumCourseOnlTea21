package pl.coderslab.seleniumcourse;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie1_By_Id {
    @Test

    public void shouldFindElementsById() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocatioId = driver.findElement(By.id("hotel_location"));
        hotelLocatioId.sendKeys("Warsaw");
        WebElement hotelSearchId = driver.findElement(By.id("search_room_submit"));
        WebElement hotelEmailId = driver.findElement(By.id("newsletter-input"));
        hotelEmailId.sendKeys("test@test.com");


    }
}
