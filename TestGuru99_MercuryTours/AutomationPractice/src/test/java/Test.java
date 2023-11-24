import mercurytour.Base;
import mercurytour.Home;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test {
    WebDriver driver;

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

    /*Reporte n°1*/
    @org.junit.Test
    public void runTestReport1(){
        Home home= new Home(driver);
        home.runReport1();
    }

    /*Reporte n°2*/
    @org.junit.Test
    public void runTestReport2(){
        Home home = new Home(driver);
        home.runReport2();
    }

    /*Reporte n°3*/
    @org.junit.Test
    public void runTestReport3() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
