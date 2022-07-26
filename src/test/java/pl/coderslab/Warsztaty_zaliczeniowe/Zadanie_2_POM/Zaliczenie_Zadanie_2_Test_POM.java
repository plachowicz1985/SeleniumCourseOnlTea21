package pl.coderslab.Warsztaty_zaliczeniowe.Zadanie_2_POM;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class Zaliczenie_Zadanie_2_Test_POM {
    private WebDriver driver;
    private LoginPage loginPage;
    private SearchSweater searchSweater;
    private ShopBasket shopBasket;
    private Checkout checkout;
    private ConfirmAddressandDelivery confirmAddress;
    private Payment payment;
    private ScreenShot screenShot;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        this.driver = new ChromeDriver();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        this.loginPage = new LoginPage(driver);
        this.searchSweater = new SearchSweater(driver);
        this.shopBasket = new ShopBasket(driver);
        this.checkout = new Checkout(driver);
        this.confirmAddress = new ConfirmAddressandDelivery(driver);
        this.payment = new Payment(driver);
        this.screenShot = new ScreenShot(driver);
    }

    @Test
    public void shouldOrderAndTakeScreenshot() throws IOException {
        loginPage.loginAsUser("test_marzec@o2.pl", "test_marzec@o2.pl");
        searchSweater.searchBar("Hummingbird Printed Sweater");
        searchSweater.clickImages();
        shopBasket.setSize("M");
        shopBasket.setQuantity("5");
        shopBasket.addToBasket();
        checkout.proceedTocheckout();
        confirmAddress.confirmClick();
        payment.paymentProceed();
        screenShot.saveScreenshot();


    }


}


