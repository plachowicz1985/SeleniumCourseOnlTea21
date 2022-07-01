package pl.coderslab.GoogleSearchTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie3 {
    @Test

    public void shouldSearchWithGoogle() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        driver.get("https://coderslab.pl/pl");
        driver.navigate().back();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


        //WebElement searchInput = driver.findElement(By.name("q"));
        //searchInput.sendKeys("W pustyni i puszczy");
        //searchInput.submit();
    }
}
