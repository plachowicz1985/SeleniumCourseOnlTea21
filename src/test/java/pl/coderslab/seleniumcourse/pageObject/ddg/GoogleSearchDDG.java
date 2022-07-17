package pl.coderslab.seleniumcourse.pageObject.ddg;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchDDG {
    @Test
    public void shouldSearchWithGoogle() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");

        DdgMainPage ddgMainPage = new DdgMainPage(driver);
        ddgMainPage.searchPhrase("Gdziew Polsce do miasta empik");

        //WebElement searchInput = driver.findElement(By.name("q"));
        //searchInput.sendKeys("W pustyni i puszczy");
        //searchInput.submit();
        driver.quit();
    }
}
