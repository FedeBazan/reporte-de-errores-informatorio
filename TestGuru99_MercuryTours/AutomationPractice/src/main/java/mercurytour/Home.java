package mercurytour;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class Home {

    WebDriver driver;
    By imgHomeXpath = By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/p[1]/img");

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","./src/main/java/webdriver/chromedriver.exe");
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @After
    public void tearDown(){
        driver.quit();
    }


    public void testUp(){
        assertTrue(driver.findElement(imgHomeXpath).isDisplayed());
    }

    
}
