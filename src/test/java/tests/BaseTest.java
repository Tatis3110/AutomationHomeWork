package tests;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public abstract class BaseTest {

    protected static WebDriver driver;

    @Before
    public void SetUp() {
        switch (System.getProperty("browser", "chrome")){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "opera":
                driver = new OperaDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            default:
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
    }

    @After
    public void tearDown() {
        Log(driver.getCurrentUrl());
        driver.quit();
    }
}
