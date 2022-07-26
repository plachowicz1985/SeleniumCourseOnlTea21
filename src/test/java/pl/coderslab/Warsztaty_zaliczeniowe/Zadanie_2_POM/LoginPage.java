package pl.coderslab.Warsztaty_zaliczeniowe.Zadanie_2_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void loginAsUser(String email, String password) {
        WebElement loginMyStore = driver.findElement(By.xpath("//*[contains(text(), \"Sign in\")]"));
        loginMyStore.click();
        WebElement loginEmail = driver.findElement(By.name("email"));
        loginEmail.sendKeys(email);
        WebElement loginPassword = driver.findElement(By.name("password"));
        loginPassword.sendKeys(password);
        WebElement loginSignInButton = driver.findElement(By.id("submit-login"));
        loginSignInButton.click();
    }

}
