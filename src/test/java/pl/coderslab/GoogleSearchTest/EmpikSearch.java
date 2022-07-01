package pl.coderslab.GoogleSearchTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmpikSearch {
    @Test

    public void shouldSearchWithGoogle() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.empik.com/");
        WebElement searchInput = driver.findElement(By.cssSelector(".css-1vl1nnj-input-input-1"));
        searchInput.sendKeys("dwanaście prac herkulesa agatha christie");
        searchInput.submit();
    }
}
