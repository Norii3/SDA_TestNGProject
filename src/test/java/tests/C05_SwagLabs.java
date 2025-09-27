package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class C05_SwagLabs extends TestBase {

    @Test(timeOut = 10000)
    void loginTest(){

        driver.get("https://www.saucedemo.com/v1/index.html");
        driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce", Keys.ENTER);
        assert driver.findElement(By.xpath("//*[.='Products']")).isDisplayed();
    }


}
