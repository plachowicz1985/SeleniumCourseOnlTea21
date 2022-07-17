package pl.coderslab.seleniumcourse.pageObject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie2PageObjectPattern {


    //1. strona główna
    //2. signin icon
    //3. already registered -> email -> password -> sign in button

    @Test

    public void shouldFindElementsByClassName() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        //strona główna
        WebElement hotelSignInClass = driver.findElement(By.className("hide_xs"));
        hotelSignInClass.click();

        //strona logowania
        WebElement hotelEmailAdress = driver.findElement(By.id("email"));
        hotelEmailAdress.sendKeys("testpl@test.pl");
        WebElement hotelpassword = driver.findElement(By.id("passwd"));
        hotelpassword.sendKeys("cph4t1s");
        WebElement HotelCreateButton = driver.findElement(By.id("SubmitLogin"));
        HotelCreateButton.click();

        //powrót na stronę główną
        WebElement HotelLogoButton = driver.findElement(By.id("header_logo"));
        HotelLogoButton.click();



    }


}
