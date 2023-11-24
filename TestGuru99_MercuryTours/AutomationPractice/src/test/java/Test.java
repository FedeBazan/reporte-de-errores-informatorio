import mercurytour.Home;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    @org.junit.Test
    public void runTestReport1(){
        Home home= new Home(driver);
        home.runReport1();
    }

    @org.junit.Test
    public void runTestReport2(){
        Home home = new Home(driver);
        home.runReport2();
    }
}
