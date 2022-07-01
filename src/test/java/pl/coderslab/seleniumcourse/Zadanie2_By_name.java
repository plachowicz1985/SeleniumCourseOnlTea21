package pl.coderslab.seleniumcourse;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie2_By_name {
    @Test

    public void shouldFindElementsByName() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocatioName = driver.findElement(By.name("hotel_location"));
        hotelLocatioName.sendKeys("Warsaw");
        WebElement hotelSearchName = driver.findElement(By.name("search_room_submit"));
        WebElement hotelEmailName = driver.findElement(By.name("email"));
        hotelEmailName.sendKeys("test@test.com");
        WebElement hotelSubscribeName = driver.findElement(By.name("submitNewsletter"));
        hotelSubscribeName.submit();

    }
}
