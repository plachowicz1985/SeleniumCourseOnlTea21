package pl.coderslab.seleniumcourse.homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class homework_zadanie6 {

    @Test

    public void shouldFindElements() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&create_account=1");

        tablice_zadanie6 email = new tablice_zadanie6();
        System.out.println(email);
    }
}