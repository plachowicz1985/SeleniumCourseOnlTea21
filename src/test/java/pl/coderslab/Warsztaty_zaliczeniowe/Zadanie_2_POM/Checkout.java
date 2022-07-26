package pl.coderslab.Warsztaty_zaliczeniowe.Zadanie_2_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout {
    private WebDriver driver;
    public Checkout(WebDriver driver) {
        this.driver = driver;
    }

    public void proceedTocheckout() {
        WebElement checkoutButton = driver.findElement(By.xpath("//a[contains(text(),\"Proceed to checkout\")]"));
        checkoutButton.click();
        WebElement checkoutButton2 = driver.findElement(By.xpath("//a[contains(text(),\"Proceed to checkout\")]"));
        checkoutButton2.click();
    }

}
