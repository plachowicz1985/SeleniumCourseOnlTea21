package pl.coderslab.seleniumcourse.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReturnToMainPage {
    private WebDriver driver;
    public ReturnToMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public  void clickLogo() {
        WebElement LogoButton = driver.findElement(By.id("header_logo"));
        LogoButton.click();
    }





}
