package org.example;

import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Main {

    WebDriver driver;

    @Test

      public void getGoogle() throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com");
        driver.findElement(By.id("session_key")).sendKeys("Arslan");
        Thread.sleep(2000);
        driver.findElement(By.id("session_password")).sendKeys("Khan1234");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".btn-md.btn-primary.flex")).click();

    }
        @Test
        public void testSearchBox() throws InterruptedException {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://youtube.com");
            Thread.sleep(2000);
            driver.findElement(By.name("search_query")).sendKeys("Java Course");
            Thread.sleep(1000);
            driver.findElement(By.id("sbse0")).click();
            Thread.sleep(2000);
        }

        @Test

        public void handMouseHover() throws InterruptedException {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://rahulshettyacademy.com/AutomationPractice/");
            Actions actions = new Actions(driver);
            ((JavascriptExecutor) driver).executeScript("scroll(0,900) ");
            Thread.sleep(2000);
            WebElement element = driver.findElement(By.id("mousehover"));
            Thread.sleep(2000);
            actions.moveToElement(element).build().perform();
            WebElement element1 = driver.findElement(By.linkText("Top"));
            element1.click();
            ((JavascriptExecutor) driver).executeScript("scroll(0,900) ");
            actions.moveToElement(element).build().perform();
            WebElement element2 = driver.findElement(By.linkText("Reload"));
            element2.click();
            driver.close();
        }











}




