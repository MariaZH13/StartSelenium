import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StartSelenium {

    WebDriver wd;

    @BeforeTest
    public void preconditions(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");

    }
    @Test
    public void test(){
        //Old strategies
        wd.findElement(By.tagName("a"));
        wd.findElement(By.cssSelector("a"));

        wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root"));

        wd.findElement(By.className("container"));
        wd.findElement(By.cssSelector(".container"));

        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.partialLinkText("OM"));

        wd.findElement(By.cssSelector("[href='/login'"));
        wd.findElement(By.cssSelector("[href*='og'"));
        wd.findElement(By.cssSelector("[href^='/log'"));
        wd.findElement(By.cssSelector("[href$='in'"));









    }
    @AfterTest
    public void postconditions(){
        wd.quit();

    }
}