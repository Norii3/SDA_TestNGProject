package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C19_AddRecordDPExcel extends TestBase {

    @Test(dataProvider = "getEmployeeDataFromExcel", dataProviderClass = utilities.DataProviderUtilities.class)
    void addRecordDPExcel(String name, double age, String country){
        //System.out.println(name+ (int) age+country);
        driver.get("https://claruswaysda.github.io/addRecordWebTable.html");
        driver.findElement(By.id("nameInput")).sendKeys(name);
        driver.findElement(By.id("ageInput")).sendKeys((int)age+"");
        WebElement dd = driver.findElement(By.id("countrySelect"));
        new Select(dd).selectByVisibleText(country);

        driver.findElement(By.xpath("//*[.='Add Record']")).click();

    }
}
