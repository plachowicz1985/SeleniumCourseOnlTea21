package pl.coderslab.seleniumcourse.pageObject.ddg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DdgMainPage {
    private WebDriver driver;

    public DdgMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchPhrase(String phrase) {
        WebElement searchInput = driver.findElement(By.name("q"));

        //phrase "zastępuje" nam hasło, które wyszukujemy
        searchInput.sendKeys(phrase);
        searchInput.submit();

    }
}
