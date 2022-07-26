package pl.coderslab.Warsztaty_zaliczeniowe.Zadanie_2_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmAddressandDelivery {
    private WebDriver driver;
    public ConfirmAddressandDelivery(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmClick() {
        WebElement continueButton = driver.findElement(By.name("confirm-addresses"));
        continueButton.click();
        WebElement deliveryOptionPresta = driver.findElement(By.id("delivery_option_1"));
        deliveryOptionPresta.isSelected();
        WebElement continueButtonShipping = driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/button"));
        continueButtonShipping.click();
    }
}
