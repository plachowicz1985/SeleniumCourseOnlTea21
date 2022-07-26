package pl.coderslab.Warsztaty_zaliczeniowe.Zadanie_2_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Payment {
    private WebDriver driver;
    public Payment(WebDriver driver) {
        this.driver = driver;
    }

    public void paymentProceed() {
        //wybierze opcję płatności - Pay by Check,
        WebElement payByCheck = driver.findElement(By.id("payment-option-1"));
        payByCheck.click();

        //kliknie na "order with an obligation to pay",
        WebElement conditionsBox = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        conditionsBox.click();
        WebElement orderButton = driver.findElement(By.xpath("//*[contains(text(),\"Order with an obligation to pay\")]"));
        orderButton.click();
        WebElement orderDetails = driver.findElement(By.id("order-details"));
        System.out.println(orderDetails.getText());
    }
}
