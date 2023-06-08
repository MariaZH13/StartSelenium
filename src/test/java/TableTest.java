import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {
    WebDriver wd;


    @BeforeMethod
    public void init() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    public void testCss(){
        wd.findElement(By.cssSelector("#customers tr:nth-child(7) td:last-child"));

        List<WebElement> elements = wd.findElements(By.cssSelector("#customers th"));
        int countColumns = elements.toArray().length;
        System.out.println(countColumns);

        List<WebElement>elements1 = wd.findElements(By.cssSelector("#customers td:first-child"));
        int countRows = elements1.toArray().length;
        System.out.println(countRows);

       // System.out.println(wd.findElements(By.cssSelector("#customers td:first-child")).size());

        WebElement row3= wd.findElement(By.cssSelector("#customers tr:nth-child(4)"));
        System.out.println(row3.getText());
        WebElement lastColumn = wd.findElement(By.cssSelector("#customers th:last-child"));
        System.out.println(lastColumn.getText());




    }

    @AfterMethod
    public void tearDown(){
       wd.quit();
    }
}