package pl.coderslab.Warsztaty_zaliczeniowe.Zadanie_2_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopBasket {
    private WebDriver driver;
    public ShopBasket(WebDriver driver) {
        this.driver = driver;
    }

    //wybierze rozmiar M (opcja dodatkowa: zrób tak żeby można było sparametryzować rozmiar i wybrać S,M,L,XL),
    //(Cześć, )należy mieć możliwość wyboru rozmiaru z poziomu skryptu.
    //czyli np. wykorzystać w cucumber tabelę z danymi lub bez cucumber stworzyć sobie zmienną size,
    // którą będziemy mogli sobie ustawić na początku skryptu)
    public void setSize(String size) {
        WebElement setSize = driver.findElement(By.id("group_1"));
        //setSize.click();
        setSize.sendKeys(size);
    }

    //wybierze 5 sztuk według parametru podanego w teście (opcja dodatkowa: zrób tak żeby można było sparametryzować liczbę sztuk),
    //Cześć, należy mieć możliwość wyboru rozmiaru z poziomu skryptu.
    //czyli np. wykorzystać w cucumber tabelę z danymi lub bez cucumber stworzyć sobie zmienną size,
    // którą będziemy mogli sobie ustawić na początku skryptu

    public void setQuantity(String quantity) {
        WebElement setquantity = driver.findElement(By.name("qty"));
       //setquantity.click();
        setquantity.clear();
        setquantity.sendKeys(quantity);
    }


    //dodaj produkt do koszyka,
    public void addToBasket() {
        WebElement addToBasket = driver.findElement(By.className("add"));
        addToBasket.click();
    }

}
