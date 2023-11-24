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
    By yourDestinationLink = By.linkText("your destination");

    By businessTravelXpath = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[12]/td/table/tbody/tr/td/font/a[1]");

    public Home(WebDriver driver) {
        this.driver=driver;
    }

    public void testUp(){
        assertTrue(driver.findElement(imgHomeXpath).isDisplayed());
    }

    /*Reporte n°1*/
    public void runReport1(){
        driver.findElement(yourDestinationLink).click();
        testUp();
    }

    /*Reporte n°2*/
    public void runReport2(){
        Base base = new Base(driver);
        driver.findElement(businessTravelXpath).click();
        base.isDisplayedError();
    }


}
