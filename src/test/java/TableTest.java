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
import java.util.concurrent.TimeUnit;

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


        System.out.println(wd.findElements(By.cssSelector("#customers th")).size());
        System.out.println(wd.findElements(By.xpath("//table[@class='ws-table-all']//th")).size());
        System.out.println(wd.findElements(By.xpath("//*[@id='customers']//th")).size());

        System.out.println(wd.findElements(By.cssSelector("#customers tr")).size());
        System.out.println(wd.findElements(By.xpath("//*[@id='customers']//tr")).size());
        System.out.println(wd.findElements(By.xpath("//table[@class='ws-table-all']//tr")).size());


       // System.out.println(wd.findElements(By.cssSelector("#customers td:first-child")).size());

        WebElement row3= wd.findElement(By.cssSelector("#customers tr:nth-child(3)"));
        System.out.println(row3.getText());
        wd.findElement(By.xpath("//*[@id='customers']//tr[position()=2]/child::td"));


        wd.findElement(By.cssSelector("#customers td:last-child"));
        wd.findElement(By.xpath("//*[@id='customers']//td[last()]"));





    }

    @AfterMethod
    public void tearDown(){

        wd.quit();
    }
}