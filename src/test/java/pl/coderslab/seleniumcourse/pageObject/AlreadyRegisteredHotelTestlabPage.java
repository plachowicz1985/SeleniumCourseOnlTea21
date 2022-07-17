package pl.coderslab.seleniumcourse.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static pl.coderslab.seleniumcourse.Tools.fillInput;

public class AlreadyRegisteredHotelTestlabPage {
    private WebDriver driver;

    public AlreadyRegisteredHotelTestlabPage(WebDriver driver) {
        this.driver = driver;
    }

    public void attemptRegister() {

        WebElement hotelEmailAdress = driver.findElement(By.id("email"));
        hotelEmailAdress.sendKeys("testpl@test.pl");
        WebElement hotelpassword = driver.findElement(By.id("passwd"));
        hotelpassword.sendKeys("cph4t1s");
        WebElement HotelCreateButton = driver.findElement(By.id("SubmitLogin"));
        HotelCreateButton.click();


    }

   // public void HotelCreateButton(){
     //   WebElement HotelCreateButton = driver.findElement(By.id("SubmitLogin"));
      //  HotelCreateButton.click();
    //}
}
