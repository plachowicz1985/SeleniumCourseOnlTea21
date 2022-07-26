package pl.coderslab.Warsztaty_zaliczeniowe.Zadanie_2_POM;

import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class ScreenShot {
    private WebDriver driver;
    public ScreenShot(WebDriver driver) {
        this.driver = driver;
    }

    public void saveScreenshot() throws IOException {
        //zrobi screenshot z potwierdzeniem zamówienia i kwotą.
        File tmpScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        Files.copy(tmpScreenshot.toPath(), Paths.get("/Users/piotrek/Desktop/screenshots", currentDateTime+".jpeg"));
    }
}
