package pl.coderslab.seleniumcourse;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie3_By_className {
    @Test

    public void shouldFindElementsByClassName() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelSignInClass = driver.findElement(By.className("hide_xs"));
        WebElement HotelEmailClass = driver.findElement(By.cssSelector(".inputNew.form-control.grey.newsletter-input"));
        hotelSignInClass.click();
        WebElement HotelEmailAdress = driver.findElement(By.cssSelector(".is_required.validate.account_input.form-control"));
        HotelEmailAdress.sendKeys("testpl@test.pl");
        WebElement HotelCreateButton = driver.findElement(By.cssSelector("#SubmitCreate"));
        HotelCreateButton.click();




    }
}
