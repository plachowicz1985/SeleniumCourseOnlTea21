package pl.coderslab.Warsztaty_zaliczeniowe;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;

public class Zaliczenie_Zadanie_2 {
   String setQuantity = "5";
   String setSize = "M";

    @Test

    public void shouldFindElements() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");


        //zaloguje się na tego samego użytkownika z zadania 1,
        WebElement loginMyStore = driver.findElement(By.xpath("//*[contains(text(), \"Sign in\")]"));
        loginMyStore.click();
        WebElement loginEmail = driver.findElement(By.name("email"));
        loginEmail.sendKeys("test_marzec@o2.pl");
        WebElement loginPassword = driver.findElement(By.name("password"));
        loginPassword.sendKeys("test_marzec@o2.pl");
        WebElement loginSignInButton = driver.findElement(By.id("submit-login"));
        loginSignInButton.click();

        //wybierze do zakupu Hummingbird Printed Sweater (opcja dodatkowa: sprawdzi czy rabat na niego wynosi 20%),
        WebElement searchBar = driver.findElement(By.name("s"));
        searchBar.sendKeys("Hummingbird Printed Sweater");
        searchBar.submit();

        WebElement regularPrice = driver.findElement(By.cssSelector("span.regular-price"));
        System.out.println(regularPrice.getText());
        WebElement currentPrice = driver.findElement(By.cssSelector("span.price"));
        System.out.println(currentPrice.getText());



        WebElement sweaterImg = driver.findElement(By.xpath("//img[@alt=\"Brown bear printed sweater\"]"));
        sweaterImg.click();

        //wybierze rozmiar M (opcja dodatkowa: zrób tak żeby można było sparametryzować rozmiar i wybrać S,M,L,XL),
        //(Cześć, )należy mieć możliwość wyboru rozmiaru z poziomu skryptu.
        //czyli np. wykorzystać w cucumber tabelę z danymi lub bez cucumber stworzyć sobie zmienną size,
        // którą będziemy mogli sobie ustawić na początku skryptu)
        WebElement size = driver.findElement(By.id("group_1"));
        size.sendKeys(setSize);

        //wybierze 5 sztuk według parametru podanego w teście (opcja dodatkowa: zrób tak żeby można było sparametryzować liczbę sztuk),
        //Cześć, należy mieć możliwość wyboru rozmiaru z poziomu skryptu.
        //czyli np. wykorzystać w cucumber tabelę z danymi lub bez cucumber stworzyć sobie zmienną size,
        // którą będziemy mogli sobie ustawić na początku skryptu
        WebElement quantity = driver.findElement(By.name("qty"));
        quantity.click();
        quantity.clear();
        quantity.sendKeys(setQuantity);

        //dodaj produkt do koszyka,
        WebElement addToCartButton = driver.findElement(By.className("add"));
        addToCartButton.click();

        //przejdzie do opcji - checkout,
        WebElement checkoutButton = driver.findElement(By.xpath("//a[contains(text(),\"Proceed to checkout\")]"));
        checkoutButton.click();
        WebElement checkoutButton2 = driver.findElement(By.xpath("//a[contains(text(),\"Proceed to checkout\")]"));
        checkoutButton2.click();

        //potwierdzi address (możesz go dodać wcześniej ręcznie),
        WebElement continueButton = driver.findElement(By.name("confirm-addresses"));
        continueButton.click();

        //wybierze metodę odbioru - PrestaShop "pick up in store",
        WebElement deliveryOptionPresta = driver.findElement(By.id("delivery_option_1"));
        deliveryOptionPresta.isSelected();
        WebElement continueButtonShipping = driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/button"));
        continueButtonShipping.click();


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


        //zrobi screenshot z potwierdzeniem zamówienia i kwotą.
        File tmpScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        Files.copy(tmpScreenshot.toPath(), Paths.get("/Users/piotrek/Desktop/screenshots", "Warsztaty_zaliczeniowe_Zadanie_2"+".jpeg"));

        //Wejdź w historię zamówień i detale (najpierw kliknij w użytkownika zalogowanego, później kafelek),

        //sprawdź czy zamówienie znajduje się na liście ze statusem "Awaiting check payment" i kwotą
        //taką samą jak na zamówieniu dwa kroki wcześniej.


       driver.quit();

    }
}


