package pl.coderslab.seleniumcourse.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pl.coderslab.seleniumcourse.Tools;

import static pl.coderslab.seleniumcourse.Tools.assertDisplayedAndEnabled;
import static pl.coderslab.seleniumcourse.Tools.fillInput;

public class LoginHotelTestlabPage {
    private WebDriver driver;

    public LoginHotelTestlabPage(WebDriver driver) {
        this.driver = driver;
    }

    public  void attemptAccountCreationForEmail(String email) {
        WebElement emailInput = driver.findElement(By.cssSelector("#email_create"));
        fillInput(emailInput, email);
        WebElement createAnAccountButton = driver.findElement(By.cssSelector("#SubmitCreate"));
        createAnAccountButton.click();
    }
}
