package pl.coderslab.seleniumcourse.homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class homework_zadanie3 {
    @Test
    public void shouldFindElementsByClassName() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");


        //sekcja first name
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Karol");

        //sekcja last name
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Kowalski");

        //sekcja gender
        WebElement gender = driver.findElement(By.xpath("//*[contains(text(),\"Male\")]"));
        gender.click();

        //sekcja date of birth
        WebElement dateofBirth = driver.findElement(By.id("dob"));
        dateofBirth.sendKeys("05/22/2010");
        dateofBirth.submit();

        //sekcja address
        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("Prosta 51");

        //sekcja email
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("karol.kowalski@mailinator.com");

        //sekcja password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Pass123");

        //sekcja company
        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("Coders Lab");

        //sekcja role
        WebElement role = driver.findElement(By.xpath("//*[contains(text(),\"QA\")]"));
        role.click();

        //sekcja comment
        WebElement comment = driver.findElement(By.id("comment"));
        comment.sendKeys("Coders Lab");

        //sekcja job expectation
        WebElement jobExpectation = driver.findElement(By.xpath("//*[contains(text(),\"High salary\")]"));
        jobExpectation.click();

        //sekcja ways of development
        WebElement waysOfDevelopment = driver.findElement(By.xpath("//*[contains(text(),\"Take online courses\")]"));
        waysOfDevelopment.sendKeys("Coders Lab");
        WebElement waysOfDevelopment2 = driver.findElement(By.xpath("//*[contains(text(),\"Read books\")]"));
        waysOfDevelopment2.sendKeys("Coders Lab");

        //sekcja comment
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

    }
}
