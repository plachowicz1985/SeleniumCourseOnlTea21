package pl.coderslab.Warsztaty_zaliczeniowe.Zadanie_2_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchSweater {
    private WebDriver driver;
    public SearchSweater(WebDriver driver) {
        this.driver = driver;
    }

    public void searchBar(String clothes) {
        WebElement searchBar = driver.findElement(By.name("s"));
        searchBar.sendKeys(clothes);
        searchBar.submit();
    }
    public void clickImages() {
        WebElement sweaterImg = driver.findElement(By.xpath("//img[@alt=\"Brown bear printed sweater\"]"));
        sweaterImg.click();
    }

}
